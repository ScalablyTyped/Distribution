package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Client
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorHateoasMod extends Shortcut {
  
  @JSImport("rest/interceptor/hateoas", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var client: js.UndefOr[Client] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorHateoasMod.foo` */
  override def _to: Interceptor[Config] = ^
}
