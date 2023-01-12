package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfLoadersRegistry.mod.Loader
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmaScriptMod extends Shortcut {
  
  @JSImport("rdf-loader-code/ecmaScript", JSImport.Namespace)
  @js.native
  val ^ : EcmaScriptLoader = js.native
  
  @js.native
  trait EcmaScriptLoader extends Loader[Any, Options] {
    
    def register(registry: LoaderRegistry): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  type _To = EcmaScriptLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptMod.foo` */
  override def _to: EcmaScriptLoader = ^
}
