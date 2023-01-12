package typings.sassEmbedded

import typings.sassEmbedded.distTypesImporterMod.FileImporter
import typings.sassEmbedded.distTypesImporterMod.Importer
import typings.sassEmbedded.distTypesLoggerMod.Logger
import typings.sassEmbedded.distTypesUtilPromiseOrMod.PromiseOr
import typings.sassEmbedded.distTypesValueMod.Value
import typings.sassEmbedded.sassEmbeddedStrings.async
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsMod {
  
  type CustomFunction[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] = js.Function1[/* args */ js.Array[Value], PromiseOr[Value, sync]]
  
  trait Options[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] extends StObject {
    
    /**
      * If this is `true`, the compiler will exclusively use ASCII characters in
      * its error and warning messages. Otherwise, it may use non-ASCII Unicode
      * characters as well.
      *
      * @defaultValue `false`
      * @category Messages
      */
    var alertAscii: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is `true`, the compiler will use ANSI color escape codes in its
      * error and warning messages. If it's `false`, it won't use these. If it's
      * undefined, the compiler will determine whether or not to use colors
      * depending on whether the user is using an interactive terminal.
      *
      * @category Messages
      */
    var alertColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the compiler may prepend `@charset "UTF-8";` or U+FEFF
      * (byte-order marker) if it outputs non-ASCII CSS.
      *
      * If `false`, the compiler never emits these byte sequences. This is ideal
      * when concatenating or embedding in HTML `<style>` tags. (The output will
      * still be UTF-8.)
      *
      * @defaultValue `true`
      * @category Output
      * @compatibility dart: "1.54.0", node: false
      */
    var charset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional built-in Sass functions that are available in all stylesheets.
      * This option takes an object whose keys are Sass function signatures like
      * you'd write for the [`@function
      * rule`](https://sass-lang.com/documentation/at-rules/function) and whose
      * values are [[CustomFunction]]s.
      *
      * Functions are passed JavaScript representations of [Sass value
      * types](https://sass-lang.com/documentation/js-api#value-types), and must
      * return the same.
      *
      * When writing custom functions, it's important to make them as user-friendly
      * and as close to the standards set by Sass's core functions as possible. Some
      * good guidelines to follow include:
      *
      * * Use `Value.assert*` methods, like [[Value.assertString]], to cast untyped
      *   `Value` objects to more specific types. For values that were passed
      *   directly as arguments, pass in the argument name as well. This ensures
      *   that the user gets good error messages when they pass in the wrong type
      *   to your function.
      *
      * * Individual classes may have more specific `assert*` methods, like
      *   [[SassNumber.assertInt]], which should be used when possible.
      *
      * * In Sass, every value counts as a list. Rather than trying to detect the
      *   [[SassList]] type, you should use [[Value.asList]] to treat all values as
      *   lists.
      *
      * * When manipulating values like lists, strings, and numbers that have
      *   metadata (comma versus space separated, bracketed versus unbracketed,
      *   quoted versus unquoted, units), the output metadata should match the
      *   input metadata.
      *
      * * When in doubt, lists should default to comma-separated, strings should
      *   default to quoted, and numbers should default to unitless.
      *
      * * In Sass, lists and strings use one-based indexing and use negative
      *   indices to index from the end of value. Functions should follow these
      *   conventions. [[Value.sassIndexToListIndex]] and
      *   [[SassString.sassIndexToStringIndex]] can be used to do this
      *   automatically.
      *
      * * String indexes in Sass refer to Unicode code points while JavaScript
      *   string indices refer to UTF-16 code units. For example, the character
      *   U+1F60A SMILING FACE WITH SMILING EYES is a single Unicode code point but
      *   is represented in UTF-16 as two code units (`0xD83D` and `0xDE0A`). So in
      *   JavaScript, `"a😊b".charCodeAt(1)` returns `0xD83D`, whereas in Sass
      *   `str-slice("a😊b", 1, 1)` returns `"😊"`. Functions should follow Sass's
      *   convention. [[SassString.sassIndexToStringIndex]] can be used to do this
      *   automatically, and the [[SassString.sassLength]] getter can be used to
      *   access a string's length in code points.
      *
      * @example
      *
      * ```js
      * sass.compileString(`
      * h1 {
      *   font-size: pow(2, 5) * 1px;
      * }`, {
      *   functions: {
      *     // Note: in real code, you should use `math.pow()` from the built-in
      *     // `sass:math` module.
      *     'pow($base, $exponent)': function(args) {
      *       const base = args[0].assertNumber('base').assertNoUnits('base');
      *       const exponent =
      *           args[1].assertNumber('exponent').assertNoUnits('exponent');
      *
      *       return new sass.SassNumber(Math.pow(base.value, exponent.value));
      *     }
      *   }
      * });
      * ```
      *
      * @category Plugins
      */
    var functions: js.UndefOr[Record[String, CustomFunction[sync]]] = js.undefined
    
    /**
      * Custom importers that control how Sass resolves loads from rules like
      * [`@use`](https://sass-lang.com/documentation/at-rules/use) and
      * [`@import`](https://sass-lang.com/documentation/at-rules/import).
      *
      * Loads are resolved by trying, in order:
      *
      * - The importer that was used to load the current stylesheet, with the
      *   loaded URL resolved relative to the current stylesheet's canonical URL.
      *
      * - Each [[Importer]] or [[FileImporter]] in [[importers]], in order.
      *
      * - Each load path in [[loadPaths]], in order.
      *
      * If none of these return a Sass file, the load fails and Sass throws an
      * error.
      *
      * @category Plugins
      */
    var importers: js.UndefOr[js.Array[Importer[sync] | FileImporter[sync]]] = js.undefined
    
    /**
      * Paths in which to look for stylesheets loaded by rules like
      * [`@use`](https://sass-lang.com/documentation/at-rules/use) and
      * [`@import`](https://sass-lang.com/documentation/at-rules/import).
      *
      * A load path `loadPath` is equivalent to the following [[FileImporter]]:
      *
      * ```js
      * {
      *   findFileUrl(url) {
      *     // Load paths only support relative URLs.
      *     if (/^[a-z]+:/i.test(url)) return null;
      *     return new URL(url, pathToFileURL(loadPath));
      *   }
      * }
      * ```
      *
      * @category Input
      */
    var loadPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object to use to handle warnings and/or debug messages from Sass.
      *
      * By default, Sass emits warnings and debug messages to standard error, but
      * if [[Logger.warn]] or [[Logger.debug]] is set, this will invoke them
      * instead.
      *
      * The special value [[Logger.silent]] can be used to easily silence all
      * messages.
      *
      * @category Messages
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * If this option is set to `true`, Sass won’t print warnings that are caused
      * by dependencies. A “dependency” is defined as any file that’s loaded
      * through [[loadPaths]] or [[importer]]. Stylesheets that are imported
      * relative to the entrypoint are not considered dependencies.
      *
      * This is useful for silencing deprecation warnings that you can’t fix on
      * your own. However, please <em>also</em> notify your dependencies of the deprecations
      * so that they can get fixed as soon as possible!
      *
      * **Heads up!** If [[compileString]] or [[compileStringAsync]] is called
      * without [[StringWithoutImporter.url]], <em>all</em> stylesheets it loads
      * will be considered dependencies. Since it doesn’t have a path of its own,
      * everything it loads is coming from a load path rather than a relative
      * import.
      *
      * @defaultValue `false`
      * @category Messages
      */
    var quietDeps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not Sass should generate a source map. If it does, the source
      * map will be available as [[CompileResult.sourceMap]].
      *
      * **Heads up!** Sass doesn't automatically add a `sourceMappingURL` comment
      * to the generated CSS. It's up to callers to do that, since callers have
      * full knowledge of where the CSS and the source map will exist in relation
      * to one another and how they'll be served to the browser.
      *
      * @defaultValue `false`
      * @category Output
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether Sass should include the sources in the generated source map.
      *
      * This option has no effect if [[sourceMap]] is `false`.
      *
      * @defaultValue `false`
      * @category Output
      */
    var sourceMapIncludeSources: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The [[OutputStyle]] of the compiled CSS.
      *
      * @example
      *
      * ```js
      * const source = `
      * h1 {
      *   font-size: 40px;
      *   code {
      *     font-face: Roboto Mono;
      *   }
      * }`;
      *
      * let result = sass.compileString(source, {style: "expanded"});
      * console.log(result.css.toString());
      * // h1 {
      * //   font-size: 40px;
      * // }
      * // h1 code {
      * //   font-face: Roboto Mono;
      * // }
      *
      * result = sass.compileString(source, {style: "compressed"})
      * console.log(result.css.toString());
      * // h1{font-size:40px}h1 code{font-face:Roboto Mono}
      * ```
      *
      * @category Output
      */
    var style: js.UndefOr[OutputStyle] = js.undefined
    
    /**
      * By default, Dart Sass will print only five instances of the same
      * deprecation warning per compilation to avoid deluging users in console
      * noise. If you set `verbose` to `true`, it will instead print every
      * deprecation warning it encounters.
      *
      * @defaultValue `false`
      * @category Messages
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */](): Options[sync] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[sync]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] (val x: Self & Options[sync]) extends AnyVal {
      
      inline def setAlertAscii(value: Boolean): Self = StObject.set(x, "alertAscii", value.asInstanceOf[js.Any])
      
      inline def setAlertAsciiUndefined: Self = StObject.set(x, "alertAscii", js.undefined)
      
      inline def setAlertColor(value: Boolean): Self = StObject.set(x, "alertColor", value.asInstanceOf[js.Any])
      
      inline def setAlertColorUndefined: Self = StObject.set(x, "alertColor", js.undefined)
      
      inline def setCharset(value: Boolean): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setFunctions(value: Record[String, CustomFunction[sync]]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setImporters(value: js.Array[Importer[sync] | FileImporter[sync]]): Self = StObject.set(x, "importers", value.asInstanceOf[js.Any])
      
      inline def setImportersUndefined: Self = StObject.set(x, "importers", js.undefined)
      
      inline def setImportersVarargs(value: (Importer[sync] | FileImporter[sync])*): Self = StObject.set(x, "importers", js.Array(value*))
      
      inline def setLoadPaths(value: js.Array[String]): Self = StObject.set(x, "loadPaths", value.asInstanceOf[js.Any])
      
      inline def setLoadPathsUndefined: Self = StObject.set(x, "loadPaths", js.undefined)
      
      inline def setLoadPathsVarargs(value: String*): Self = StObject.set(x, "loadPaths", js.Array(value*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setQuietDeps(value: Boolean): Self = StObject.set(x, "quietDeps", value.asInstanceOf[js.Any])
      
      inline def setQuietDepsUndefined: Self = StObject.set(x, "quietDeps", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapIncludeSources(value: Boolean): Self = StObject.set(x, "sourceMapIncludeSources", value.asInstanceOf[js.Any])
      
      inline def setSourceMapIncludeSourcesUndefined: Self = StObject.set(x, "sourceMapIncludeSources", js.undefined)
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStyle(value: OutputStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sassEmbedded.sassEmbeddedStrings.expanded
    - typings.sassEmbedded.sassEmbeddedStrings.compressed
  */
  trait OutputStyle extends StObject
  object OutputStyle {
    
    inline def compressed: typings.sassEmbedded.sassEmbeddedStrings.compressed = "compressed".asInstanceOf[typings.sassEmbedded.sassEmbeddedStrings.compressed]
    
    inline def expanded: typings.sassEmbedded.sassEmbeddedStrings.expanded = "expanded".asInstanceOf[typings.sassEmbedded.sassEmbeddedStrings.expanded]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithImporter[sync]
    - typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithoutImporter[sync]
  */
  trait StringOptions[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] extends StObject
  object StringOptions {
    
    inline def StringOptionsWithImporter[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */](importer: Importer[sync] | FileImporter[sync], url: URL): typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithImporter[sync] = {
      val __obj = js.Dynamic.literal(importer = importer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithImporter[sync]]
    }
    
    inline def StringOptionsWithoutImporter[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */](): typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithoutImporter[sync] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.sassEmbedded.distTypesOptionsMod.StringOptionsWithoutImporter[sync]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sassEmbedded.distTypesOptionsMod.StringOptions because Already inherited */ trait StringOptionsWithImporter[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */]
    extends StObject
       with StringOptionsWithoutImporter[sync] {
    
    /**
      * The importer to use to handle loads that are relative to the entrypoint
      * stylesheet.
      *
      * A relative load's URL is first resolved relative to [[url]], then passed to
      * [[importer]]. If the importer doesn't recognize it, it's then passed to
      * [[importers]] and [[loadPaths]].
      *
      * @category Input
      */
    var importer: Importer[sync] | FileImporter[sync]
    
    /**
      * The canonical URL of the entrypoint stylesheet. If this is passed along
      * with [[importer]], it's used to resolve relative loads in the entrypoint
      * stylesheet.
      *
      * @category Input
      */
    @JSName("url")
    var url_StringOptionsWithImporter: URL
  }
  object StringOptionsWithImporter {
    
    inline def apply[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */](importer: Importer[sync] | FileImporter[sync], url: URL): StringOptionsWithImporter[sync] = {
      val __obj = js.Dynamic.literal(importer = importer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringOptionsWithImporter[sync]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringOptionsWithImporter[?], sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] (val x: Self & StringOptionsWithImporter[sync]) extends AnyVal {
      
      inline def setImporter(value: Importer[sync] | FileImporter[sync]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringOptionsWithoutImporter[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */]
    extends StObject
       with Options[sync]
       with StringOptions[sync] {
    
    /**
      * The [[Syntax]] to use to parse the entrypoint stylesheet.
      *
      * @default `'scss'`
      *
      * @category Input
      */
    var syntax: js.UndefOr[Syntax] = js.undefined
    
    /**
      * The canonical URL of the entrypoint stylesheet.
      *
      * A relative load's URL is first resolved relative to [[url]], then resolved
      * to a file on disk if it's a `file://` URL. If it can't be resolved to a
      * file on disk, it's then passed to [[importers]] and [[loadPaths]].
      *
      * @category Input
      */
    var url: js.UndefOr[URL] = js.undefined
  }
  object StringOptionsWithoutImporter {
    
    inline def apply[sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */](): StringOptionsWithoutImporter[sync] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringOptionsWithoutImporter[sync]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringOptionsWithoutImporter[?], sync /* <: typings.sassEmbedded.sassEmbeddedStrings.sync | async */] (val x: Self & StringOptionsWithoutImporter[sync]) extends AnyVal {
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sassEmbedded.sassEmbeddedStrings.scss
    - typings.sassEmbedded.sassEmbeddedStrings.indented
    - typings.sassEmbedded.sassEmbeddedStrings.css
  */
  trait Syntax extends StObject
  object Syntax {
    
    inline def css: typings.sassEmbedded.sassEmbeddedStrings.css = "css".asInstanceOf[typings.sassEmbedded.sassEmbeddedStrings.css]
    
    inline def indented: typings.sassEmbedded.sassEmbeddedStrings.indented = "indented".asInstanceOf[typings.sassEmbedded.sassEmbeddedStrings.indented]
    
    inline def scss: typings.sassEmbedded.sassEmbeddedStrings.scss = "scss".asInstanceOf[typings.sassEmbedded.sassEmbeddedStrings.scss]
  }
}
