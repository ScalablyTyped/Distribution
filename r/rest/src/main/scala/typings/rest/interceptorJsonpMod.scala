package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.anon.Name
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorJsonpMod extends Shortcut {
  
  @JSImport("rest/interceptor/jsonp", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[Config] = js.native
  
  trait Config extends StObject {
    
    var callback: js.UndefOr[Name] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCallback(value: Name): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    }
  }
  
  type _To = Interceptor[Config]
  
  /* This means you don't have to write `^`, but can instead just say `interceptorJsonpMod.foo` */
  override def _to: Interceptor[Config] = ^
}
