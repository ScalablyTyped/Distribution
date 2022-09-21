package typings.rollupPluginSourcemaps

import typings.node.bufferMod.global.Buffer
import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-sourcemaps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(hasIncludeExcludeReadFile: SourcemapsPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIncludeExcludeReadFile.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait SourcemapsPluginOptions extends StObject {
    
    var exclude: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@rollup/pluginutils.@rollup/pluginutils.CreateFilter>[1] */ js.Any
      ] = js.undefined
    
    var include: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@rollup/pluginutils.@rollup/pluginutils.CreateFilter>[0] */ js.Any
      ] = js.undefined
    
    var readFile: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* data */ Buffer | String, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object SourcemapsPluginOptions {
    
    inline def apply(): SourcemapsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourcemapsPluginOptions]
    }
    
    extension [Self <: SourcemapsPluginOptions](x: Self) {
      
      inline def setExclude(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@rollup/pluginutils.@rollup/pluginutils.CreateFilter>[1] */ js.Any
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setInclude(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@rollup/pluginutils.@rollup/pluginutils.CreateFilter>[0] */ js.Any
      ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setReadFile(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ js.Error | Null, /* data */ Buffer | String, Unit]) => Unit
      ): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    }
  }
}
