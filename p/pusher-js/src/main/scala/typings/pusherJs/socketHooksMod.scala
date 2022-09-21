package typings.pusherJs

import typings.pusherJs.urlLocationMod.URLLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketHooksMod {
  
  trait SocketHooks extends StObject {
    
    def getReceiveURL(url: URLLocation, session: String): String
    
    def onFinished(Socket: Any, Status: Any): Unit
    
    def onHeartbeat(Socket: Any): Unit
    
    def sendHeartbeat(Socket: Any): Unit
  }
  object SocketHooks {
    
    inline def apply(
      getReceiveURL: (URLLocation, String) => String,
      onFinished: (Any, Any) => Unit,
      onHeartbeat: Any => Unit,
      sendHeartbeat: Any => Unit
    ): SocketHooks = {
      val __obj = js.Dynamic.literal(getReceiveURL = js.Any.fromFunction2(getReceiveURL), onFinished = js.Any.fromFunction2(onFinished), onHeartbeat = js.Any.fromFunction1(onHeartbeat), sendHeartbeat = js.Any.fromFunction1(sendHeartbeat))
      __obj.asInstanceOf[SocketHooks]
    }
    
    extension [Self <: SocketHooks](x: Self) {
      
      inline def setGetReceiveURL(value: (URLLocation, String) => String): Self = StObject.set(x, "getReceiveURL", js.Any.fromFunction2(value))
      
      inline def setOnFinished(value: (Any, Any) => Unit): Self = StObject.set(x, "onFinished", js.Any.fromFunction2(value))
      
      inline def setOnHeartbeat(value: Any => Unit): Self = StObject.set(x, "onHeartbeat", js.Any.fromFunction1(value))
      
      inline def setSendHeartbeat(value: Any => Unit): Self = StObject.set(x, "sendHeartbeat", js.Any.fromFunction1(value))
    }
  }
}
