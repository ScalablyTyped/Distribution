package typings.pusherJs

import typings.pusherJs.typesSrcRuntimesWebDomScriptReceiverMod.ScriptReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebDomJsonpRequestMod {
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/jsonp_request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with JSONPRequest {
    def this(url: String, data: Any) = this()
    
    /* CompleteClass */
    override def cleanup(): Unit = js.native
    
    /* CompleteClass */
    var data: Any = js.native
    
    /* CompleteClass */
    var request: typings.pusherJs.typesSrcRuntimesWebDomScriptRequestMod.default = js.native
    
    /* CompleteClass */
    override def send(receiver: ScriptReceiver): Unit = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  
  trait JSONPRequest extends StObject {
    
    def cleanup(): Unit
    
    var data: Any
    
    var request: typings.pusherJs.typesSrcRuntimesWebDomScriptRequestMod.default
    
    def send(receiver: ScriptReceiver): Unit
    
    var url: String
  }
  object JSONPRequest {
    
    inline def apply(
      cleanup: () => Unit,
      data: Any,
      request: typings.pusherJs.typesSrcRuntimesWebDomScriptRequestMod.default,
      send: ScriptReceiver => Unit,
      url: String
    ): JSONPRequest = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), data = data.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONPRequest]
    }
    
    extension [Self <: JSONPRequest](x: Self) {
      
      inline def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.pusherJs.typesSrcRuntimesWebDomScriptRequestMod.default): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSend(value: ScriptReceiver => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
