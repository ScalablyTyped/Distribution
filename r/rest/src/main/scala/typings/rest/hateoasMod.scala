package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Client
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hateoasMod extends Shortcut {
  
  @JSImport("rest/interceptor/hateoas", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var client: js.UndefOr[Client] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `hateoasMod.foo` */
  override def _to: Interceptor[Config] = ^
}
