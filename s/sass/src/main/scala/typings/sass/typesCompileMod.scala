package typings.sass

import typings.sass.sassStrings.async
import typings.sass.sassStrings.sync
import typings.sass.typesOptionsMod.Options
import typings.sass.typesOptionsMod.StringOptions
import typings.sourceMapJs.mod.RawSourceMap
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompileMod {
  
  @JSImport("sass/types/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(path: String): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(path.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileAsync(path: String): js.Promise[CompileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileAsync_async(path: String, options: Options[async]): js.Promise[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileAsync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileString(source: String): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileString")(source.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileStringAsync(source: String): js.Promise[CompileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStringAsync")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileStringAsync_async(source: String, options: StringOptions[async]): js.Promise[CompileResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileStringAsync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompileResult]]
  
  inline def compileString_sync(source: String, options: StringOptions[sync]): CompileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compileString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileResult]
  
  inline def compile_sync(path: String, options: Options[sync]): CompileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileResult]
  
  trait CompileResult extends StObject {
    
    /**
      * The generated CSS.
      *
      * Note that this *never* includes a `sourceMapUrl` comment—it's up to the
      * caller to determine where to save the source map and how to link to it from
      * the stylesheet.
      */
    var css: String
    
    /**
      * The canonical URLs of all the stylesheets that were loaded during the
      * Sass compilation. The order of these URLs is not guaranteed.
      */
    var loadedUrls: js.Array[URL]
    
    /**
      * The object representation of the source map that maps locations in the
      * generated CSS back to locations in the Sass source code.
      *
      * This typically uses absolute `file:` URLs to refer to Sass files, although
      * this can be controlled by having a custom [[Importer]] return
      * [[ImporterResult.sourceMapUrl]].
      *
      * This is set if and only if [[Options.sourceMap]] is `true`.
      */
    var sourceMap: js.UndefOr[RawSourceMap] = js.undefined
  }
  object CompileResult {
    
    inline def apply(css: String, loadedUrls: js.Array[URL]): CompileResult = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], loadedUrls = loadedUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileResult]
    }
    
    extension [Self <: CompileResult](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setLoadedUrls(value: js.Array[URL]): Self = StObject.set(x, "loadedUrls", value.asInstanceOf[js.Any])
      
      inline def setLoadedUrlsVarargs(value: URL*): Self = StObject.set(x, "loadedUrls", js.Array(value*))
      
      inline def setSourceMap(value: RawSourceMap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
