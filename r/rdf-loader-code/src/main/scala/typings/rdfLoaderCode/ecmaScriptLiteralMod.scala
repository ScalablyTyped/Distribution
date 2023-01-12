package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfLoadersRegistry.mod.Loader
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmaScriptLiteralMod extends Shortcut {
  
  @JSImport("rdf-loader-code/ecmaScriptLiteral", JSImport.Namespace)
  @js.native
  val ^ : EcmaScriptLiteralLoader = js.native
  
  @js.native
  trait EcmaScriptLiteralLoader extends Loader[String, Options] {
    
    def register(registry: LoaderRegistry): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var variables: js.UndefOr[Map[String, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setVariables(value: Map[String, Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type _To = EcmaScriptLiteralLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptLiteralMod.foo` */
  override def _to: EcmaScriptLiteralLoader = ^
}
