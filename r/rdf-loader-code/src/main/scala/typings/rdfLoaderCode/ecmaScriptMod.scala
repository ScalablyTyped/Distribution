package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfLoadersRegistry.mod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmaScriptMod extends Shortcut {
  
  @JSImport("rdf-loader-code/ecmaScript", JSImport.Namespace)
  @js.native
  val ^ : EcmaScriptLoader = js.native
  
  @js.native
  trait EcmaScriptLoader
    extends Loader[js.Any, Options] {
    
    def register(registry: typings.rdfLoadersRegistry.mod.^): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
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
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  type _To = EcmaScriptLoader
  
  /* This means you don't have to write `^`, but can instead just say `ecmaScriptMod.foo` */
  override def _to: EcmaScriptLoader = ^
}
