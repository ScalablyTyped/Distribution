package typings.sassEmbedded

import typings.sassEmbedded.anon.Context
import typings.sassEmbedded.distTypesLegacyPluginThisMod.LegacyPluginThis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLegacyImporterMod {
  
  /**
    * An asynchronous callback that implements custom Sass loading logic for
    * [`@import` rules](https://sass-lang.com/documentation/at-rules/import) and
    * [`@use` rules](https://sass-lang.com/documentation/at-rules/use). This can be
    * passed to [[LegacySharedOptions.importer]] for either [[render]] or
    * [[renderSync]].
    *
    * An asynchronous importer must return `undefined`, and then call `done` with
    * the result of its [[LegacyImporterResult]] once it's done running.
    *
    * See [[LegacySharedOptions.importer]] for more detailed documentation.
    *
    * ```js
    * sass.render({
    *   file: "style.scss",
    *   importer: [
    *     function(url, prev, done) {
    *       if (url != "big-headers") done(null);
    *
    *       done({
    *         contents: 'h1 { font-size: 40px; }'
    *       });
    *     }
    *   ]
    * });
    * ```
    *
    * @param url - The `@use` or `@import` rule’s URL as a string, exactly as it
    * appears in the stylesheet.
    *
    * @param prev - A string identifying the stylesheet that contained the `@use`
    * or `@import`. This string’s format depends on how that stylesheet was loaded:
    *
    * * If the stylesheet was loaded from the filesystem, it’s the absolute path of
    *   its file.
    * * If the stylesheet was loaded from an importer that returned its contents,
    *   it’s the URL of the `@use` or `@import` rule that loaded it.
    * * If the stylesheet came from the data option, it’s the string "stdin".
    *
    * @param done - The callback to call once the importer has finished running.
    *
    * @category Legacy
    * @deprecated This only works with the legacy [[render]] and [[renderSync]]
    * APIs. Use [[Importer]] with [[compile]], [[compileString]], [[compileAsync]],
    * and [[compileStringAsync]] instead.
    */
  type LegacyAsyncImporter = js.ThisFunction3[
    /* this */ LegacyImporterThis, 
    /* url */ String, 
    /* prev */ String, 
    /* done */ js.Function1[/* result */ LegacyImporterResult, Unit], 
    Unit
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    sync extends 'async' ? sass-embedded.sass-embedded/dist/types/legacy/importer.LegacySyncImporter | sass-embedded.sass-embedded/dist/types/legacy/importer.LegacyAsyncImporter : sass-embedded.sass-embedded/dist/types/legacy/importer.LegacySyncImporter
    }}}
    */
  type LegacyImporter[sync] = LegacySyncImporter | LegacyAsyncImporter
  
  /* Rewritten from type alias, can be one of: 
    - typings.sassEmbedded.anon.File
    - typings.sassEmbedded.anon.Contents
    - js.Error
    - scala.Null
  */
  type LegacyImporterResult = _LegacyImporterResult | js.Error | Null
  
  /**
    * The value of `this` in the context of a [[LegacyImporter]] function.
    *
    * @category Legacy
    * @deprecated This is only used by the legacy [[render]] and [[renderSync]]
    * APIs. Use [[Importer]] with [[compile]], [[compileString]], [[compileAsync]],
    * and [[compileStringAsync]] instead.
    */
  trait LegacyImporterThis
    extends StObject
       with LegacyPluginThis {
    
    /**
      * Whether the importer is being invoked because of a Sass `@import` rule, as
      * opposed to a `@use` or `@forward` rule.
      *
      * This should *only* be used for determining whether or not to load
      * [import-only files](https://sass-lang.com/documentation/at-rules/import#import-only-files).
      *
      * @compatibility dart: "1.33.0", node: false
      */
    var fromImport: Boolean
  }
  object LegacyImporterThis {
    
    inline def apply(fromImport: Boolean, options: Context): LegacyImporterThis = {
      val __obj = js.Dynamic.literal(fromImport = fromImport.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyImporterThis]
    }
    
    extension [Self <: LegacyImporterThis](x: Self) {
      
      inline def setFromImport(value: Boolean): Self = StObject.set(x, "fromImport", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A synchronous callback that implements custom Sass loading logic for
    * [`@import` rules](https://sass-lang.com/documentation/at-rules/import) and
    * [`@use` rules](https://sass-lang.com/documentation/at-rules/use). This can be
    * passed to [[LegacySharedOptions.importer]] for either [[render]] or
    * [[renderSync]].
    *
    * See [[LegacySharedOptions.importer]] for more detailed documentation.
    *
    * ```js
    * sass.renderSync({
    *   file: "style.scss",
    *   importer: [
    *     function(url, prev) {
    *       if (url != "big-headers") return null;
    *
    *       return {
    *         contents: 'h1 { font-size: 40px; }'
    *       };
    *     }
    *   ]
    * });
    * ```
    *
    * @param url - The `@use` or `@import` rule’s URL as a string, exactly as it
    * appears in the stylesheet.
    *
    * @param prev - A string identifying the stylesheet that contained the `@use`
    * or `@import`. This string’s format depends on how that stylesheet was loaded:
    *
    * * If the stylesheet was loaded from the filesystem, it’s the absolute path of
    *   its file.
    * * If the stylesheet was loaded from an importer that returned its contents,
    *   it’s the URL of the `@use` or `@import` rule that loaded it.
    * * If the stylesheet came from the data option, it’s the string "stdin".
    *
    * @category Legacy
    * @deprecated This only works with the legacy [[render]] and [[renderSync]]
    * APIs. Use [[Importer]] with [[compile]], [[compileString]], [[compileAsync]],
    * and [[compileStringAsync]] instead.
    */
  type LegacySyncImporter = js.ThisFunction2[
    /* this */ LegacyImporterThis, 
    /* url */ String, 
    /* prev */ String, 
    LegacyImporterResult
  ]
  
  trait _LegacyImporterResult extends StObject
  object _LegacyImporterResult {
    
    inline def Contents(contents: String): typings.sassEmbedded.anon.Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sassEmbedded.anon.Contents]
    }
    
    inline def File(file: String): typings.sassEmbedded.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sassEmbedded.anon.File]
    }
  }
}
