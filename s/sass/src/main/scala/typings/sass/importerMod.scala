package typings.sass

import typings.sass.anon.FromImport
import typings.sass.promiseOrMod.PromiseOr
import typings.sass.sassStrings.async
import typings.sass.typesOptionsMod.Syntax
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importerMod {
  
  trait FileImporter[sync /* <: typings.sass.sassStrings.sync | async */] extends StObject {
    
    /** @hidden */
    var canonicalize: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * A callback that's called to partially resolve a load (such as
      * [`@use`](https://sass-lang.com/documentation/at-rules/use) or
      * [`@import`](https://sass-lang.com/documentation/at-rules/import)) to a file
      * on disk.
      *
      * Unlike an [[Importer]], the compiler will automatically handle relative
      * loads for a [[FileImporter]]. See [[Options.importers]] for more details on
      * the way loads are resolved.
      *
      * @param url - The loaded URL. Since this might be relative, it's represented
      * as a string rather than a [[URL]] object.
      *
      * @param options.fromImport - Whether this is being invoked because of a Sass
      * `@import` rule, as opposed to a `@use` or `@forward` rule.
      *
      * This should *only* be used for determining whether or not to load
      * [import-only files](https://sass-lang.com/documentation/at-rules/import#import-only-files).
      *
      * @returns An absolute `file:` URL if this importer recognizes the `url`.
      * This may be only partially resolved: the compiler will automatically look
      * for [partials](https://sass-lang.com/documentation/at-rules/use#partials),
      * [index files](https://sass-lang.com/documentation/at-rules/use#index-files),
      * and file extensions based on the returned URL. An importer may also return
      * a fully resolved URL if it so chooses.
      *
      * If this importer doesn't recognize the URL, it should return `null` instead
      * to allow other importers or {@link Options.loadPaths | load paths} to
      * handle it.
      *
      * This may also return a `Promise`, but if it does the importer may only be
      * passed to [[compileAsync]] and [[compileStringAsync]], not [[compile]] or
      * [[compileString]].
      *
      * @throws any - If this importer recognizes `url` but determines that it's
      * invalid, it may throw an exception that will be wrapped by Sass. If the
      * exception object has a `message` property, it will be used as the wrapped
      * exception's message; otherwise, the exception object's `toString()` will be
      * used. This means it's safe for importers to throw plain strings.
      */
    def findFileUrl(url: String, options: FromImport): PromiseOr[URL | Null, sync]
  }
  object FileImporter {
    
    inline def apply[sync /* <: typings.sass.sassStrings.sync | async */](findFileUrl: (String, FromImport) => PromiseOr[URL | Null, sync]): FileImporter[sync] = {
      val __obj = js.Dynamic.literal(findFileUrl = js.Any.fromFunction2(findFileUrl))
      __obj.asInstanceOf[FileImporter[sync]]
    }
    
    extension [Self <: FileImporter[?], sync /* <: typings.sass.sassStrings.sync | async */](x: Self & FileImporter[sync]) {
      
      inline def setFindFileUrl(value: (String, FromImport) => PromiseOr[URL | Null, sync]): Self = StObject.set(x, "findFileUrl", js.Any.fromFunction2(value))
    }
  }
  
  trait Importer[sync /* <: typings.sass.sassStrings.sync | async */] extends StObject {
    
    /**
      * If `url` is recognized by this importer, returns its canonical format.
      *
      * If Sass has already loaded a stylesheet with the returned canonical URL, it
      * re-uses the existing parse tree (and the loaded module for `@use`). This
      * means that importers **must ensure** that the same canonical URL always
      * refers to the same stylesheet, *even across different importers*. As such,
      * importers are encouraged to use unique URL schemes to disambiguate between
      * one another.
      *
      * As much as possible, custom importers should canonicalize URLs the same way
      * as the built-in filesystem importer:
      *
      * - The importer should look for stylesheets by adding the prefix `_` to the
      *   URL's basename, and by adding the extensions `.sass` and `.scss` if the
      *   URL doesn't already have one of those extensions. For example, if the
      *   URL was `foo/bar/baz`, the importer would look for:
      *   - `foo/bar/baz.sass`
      *   - `foo/bar/baz.scss`
      *   - `foo/bar/_baz.sass`
      *   - `foo/bar/_baz.scss`
      *
      *   If the URL was `foo/bar/baz.scss`, the importer would just look for:
      *   - `foo/bar/baz.scss`
      *   - `foo/bar/_baz.scss`
      *
      *   If the importer finds a stylesheet at more than one of these URLs, it
      *   should throw an exception indicating that the URL is ambiguous. Note that
      *   if the extension is explicitly specified, a stylesheet with the opposite
      *   extension is allowed to exist.
      *
      * - If none of the possible paths is valid, the importer should perform the
      *   same resolution on the URL followed by `/index`. In the example above,
      *   it would look for:
      *   - `foo/bar/baz/index.sass`
      *   - `foo/bar/baz/index.scss`
      *   - `foo/bar/baz/_index.sass`
      *   - `foo/bar/baz/_index.scss`
      *
      *   As above, if the importer finds a stylesheet at more than one of these
      *   URLs, it should throw an exception indicating that the import is
      *   ambiguous.
      *
      * If no stylesheets are found, the importer should return `null`.
      *
      * Calling [[canonicalize]] multiple times with the same URL must return the
      * same result. Calling [[canonicalize]] with a URL returned by a previous
      * call to [[canonicalize]] must return that URL.
      *
      * Relative loads in stylesheets loaded from an importer are handled by
      * resolving the loaded URL relative to the canonical URL of the stylesheet
      * that contains it, and passing that URL back to the importer's
      * [[canonicalize]] method. For example, suppose the "Resolving a Load"
      * example {@link Importer | above} returned a stylesheet that contained
      * `@use "mixins"`:
      *
      * - The compiler resolves the URL `mixins` relative to the current
      *   stylesheet's canonical URL `db:foo/bar/baz/_index.scss` to get
      *   `db:foo/bar/baz/mixins`.
      * - It calls [[canonicalize]] with `"db:foo/bar/baz/mixins"`.
      * - [[canonicalize]] returns `new URL("db:foo/bar/baz/_mixins.scss")`.
      *
      * Because of this, [[canonicalize]] must return a meaningful result when
      * called with a URL relative to one returned by an earlier call to
      * [[canonicalize]].
      *
      * @param url - The loaded URL. Since this might be relative, it's represented
      * as a string rather than a [[URL]] object.
      *
      * @param options.fromImport - Whether this is being invoked because of a Sass
      * `@import` rule, as opposed to a `@use` or `@forward` rule.
      *
      * This should *only* be used for determining whether or not to load
      * [import-only files](https://sass-lang.com/documentation/at-rules/import#import-only-files).
      *
      * @returns An absolute URL if this importer recognizes the `url`, or `null`
      * if it doesn't. If this returns `null`, other importers or {@link
      * Options.loadPaths | load paths} may handle the load.
      *
      * This may also return a `Promise`, but if it does the importer may only be
      * passed to [[compileAsync]] and [[compileStringAsync]], not [[compile]] or
      * [[compileString]].
      *
      * @throws any - If this importer recognizes `url` but determines that it's
      * invalid, it may throw an exception that will be wrapped by Sass. If the
      * exception object has a `message` property, it will be used as the wrapped
      * exception's message; otherwise, the exception object's `toString()` will be
      * used. This means it's safe for importers to throw plain strings.
      */
    def canonicalize(url: String, options: FromImport): PromiseOr[URL | Null, sync]
    
    /** @hidden */
    var findFileUrl: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * Loads the Sass text for the given `canonicalUrl`, or returns `null` if this
      * importer can't find the stylesheet it refers to.
      *
      * @param canonicalUrl - The canonical URL of the stylesheet to load. This is
      * guaranteed to come from a call to [[canonicalize]], although not every call
      * to [[canonicalize]] will result in a call to [[load]].
      *
      * @returns The contents of the stylesheet at `canonicalUrl` if it can be
      * loaded, or `null` if it can't.
      *
      * This may also return a `Promise`, but if it does the importer may only be
      * passed to [[compileAsync]] and [[compileStringAsync]], not [[compile]] or
      * [[compileString]].
      *
      * @throws any - If this importer finds a stylesheet at `url` but it fails to
      * load for some reason, or if `url` is uniquely associated with this importer
      * but doesn't refer to a real stylesheet, the importer may throw an exception
      * that will be wrapped by Sass. If the exception object has a `message`
      * property, it will be used as the wrapped exception's message; otherwise,
      * the exception object's `toString()` will be used. This means it's safe for
      * importers to throw plain strings.
      */
    def load(canonicalUrl: URL): PromiseOr[ImporterResult | Null, sync]
  }
  object Importer {
    
    inline def apply[sync /* <: typings.sass.sassStrings.sync | async */](
      canonicalize: (String, FromImport) => PromiseOr[URL | Null, sync],
      load: URL => PromiseOr[ImporterResult | Null, sync]
    ): Importer[sync] = {
      val __obj = js.Dynamic.literal(canonicalize = js.Any.fromFunction2(canonicalize), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[Importer[sync]]
    }
    
    extension [Self <: Importer[?], sync /* <: typings.sass.sassStrings.sync | async */](x: Self & Importer[sync]) {
      
      inline def setCanonicalize(value: (String, FromImport) => PromiseOr[URL | Null, sync]): Self = StObject.set(x, "canonicalize", js.Any.fromFunction2(value))
      
      inline def setLoad(value: URL => PromiseOr[ImporterResult | Null, sync]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  trait ImporterResult extends StObject {
    
    /** The contents of the stylesheet. */
    var contents: String
    
    /**
      * The URL to use to link to the loaded stylesheet's source code in source
      * maps. A `file:` URL is ideal because it's accessible to both browsers and
      * other build tools, but an `http:` URL is also acceptable.
      *
      * If this isn't set, it defaults to a `data:` URL that contains the contents
      * of the loaded stylesheet.
      */
    var sourceMapUrl: js.UndefOr[URL] = js.undefined
    
    /** The syntax with which to parse [[contents]]. */
    var syntax: Syntax
  }
  object ImporterResult {
    
    inline def apply(contents: String, syntax: Syntax): ImporterResult = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImporterResult]
    }
    
    extension [Self <: ImporterResult](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: URL): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
}
