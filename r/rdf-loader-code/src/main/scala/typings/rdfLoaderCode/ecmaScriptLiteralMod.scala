package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfLoadersRegistry.mod.Loader
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
    
    def register(registry: typings.rdfLoadersRegistry.mod.^): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var variables: js.UndefOr[Map[String, js.Any]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setVariables(value: Map[String, js.Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type _To = EcmaScriptLiteralLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptLiteralMod.foo` */
  override def _to: EcmaScriptLiteralLoader = ^
}
