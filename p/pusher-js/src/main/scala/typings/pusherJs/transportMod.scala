package typings.pusherJs

import typings.pusherJs.transportHooksMod.TransportHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("pusher-js/types/src/core/transports/transport", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Transport {
    def this(hooks: TransportHooks) = this()
    
    /* CompleteClass */
    override def createConnection(name: String, priority: Double, key: String, options: Any): typings.pusherJs.transportConnectionMod.default = js.native
    
    /* CompleteClass */
    var hooks: TransportHooks = js.native
    
    /* CompleteClass */
    override def isSupported(environment: Any): Boolean = js.native
  }
  
  trait Transport extends StObject {
    
    def createConnection(name: String, priority: Double, key: String, options: Any): typings.pusherJs.transportConnectionMod.default
    
    var hooks: TransportHooks
    
    def isSupported(environment: Any): Boolean
  }
  object Transport {
    
    inline def apply(
      createConnection: (String, Double, String, Any) => typings.pusherJs.transportConnectionMod.default,
      hooks: TransportHooks,
      isSupported: Any => Boolean
    ): Transport = {
      val __obj = js.Dynamic.literal(createConnection = js.Any.fromFunction4(createConnection), hooks = hooks.asInstanceOf[js.Any], isSupported = js.Any.fromFunction1(isSupported))
      __obj.asInstanceOf[Transport]
    }
    
    extension [Self <: Transport](x: Self) {
      
      inline def setCreateConnection(value: (String, Double, String, Any) => typings.pusherJs.transportConnectionMod.default): Self = StObject.set(x, "createConnection", js.Any.fromFunction4(value))
      
      inline def setHooks(value: TransportHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setIsSupported(value: Any => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction1(value))
    }
  }
}
