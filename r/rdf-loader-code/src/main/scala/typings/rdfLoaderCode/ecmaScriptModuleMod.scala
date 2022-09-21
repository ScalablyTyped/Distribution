package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfLoadersRegistry.mod.Loader
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmaScriptModuleMod extends Shortcut {
  
  @JSImport("rdf-loader-code/ecmaScriptModule", JSImport.Namespace)
  @js.native
  val ^ : EcmaScriptModuleLoader = js.native
  
  @js.native
  trait EcmaScriptModuleLoader extends Loader[Any, Options] {
    
    def register(registry: LoaderRegistry): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    }
  }
  
  type _To = EcmaScriptModuleLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptModuleMod.foo` */
  override def _to: EcmaScriptModuleLoader = ^
}
