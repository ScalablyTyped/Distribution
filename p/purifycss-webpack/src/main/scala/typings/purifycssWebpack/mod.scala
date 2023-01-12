package typings.purifycssWebpack

import typings.purifycssWebpack.anon.Info
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("purifycss-webpack", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: PurifyOptions) = this()
  }
  
  trait PurifyOptions extends StObject {
    
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: js.UndefOr[js.Object | js.Array[String]] = js.undefined
    
    var purifyOptions: js.UndefOr[Info] = js.undefined
    
    var styleExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PurifyOptions {
    
    inline def apply(): PurifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurifyOptions] (val x: Self) extends AnyVal {
      
      inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      inline def setModuleExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleExtensionsUndefined: Self = StObject.set(x, "moduleExtensions", js.undefined)
      
      inline def setModuleExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleExtensions", js.Array(value*))
      
      inline def setPaths(value: js.Object | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPurifyOptions(value: Info): Self = StObject.set(x, "purifyOptions", value.asInstanceOf[js.Any])
      
      inline def setPurifyOptionsUndefined: Self = StObject.set(x, "purifyOptions", js.undefined)
      
      inline def setStyleExtensions(value: js.Array[String]): Self = StObject.set(x, "styleExtensions", value.asInstanceOf[js.Any])
      
      inline def setStyleExtensionsUndefined: Self = StObject.set(x, "styleExtensions", js.undefined)
      
      inline def setStyleExtensionsVarargs(value: String*): Self = StObject.set(x, "styleExtensions", js.Array(value*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type PurifyPlugin = Plugin
}
