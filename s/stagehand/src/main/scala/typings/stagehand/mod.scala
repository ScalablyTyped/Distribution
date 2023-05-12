package typings.stagehand

import typings.stagehand.anon.STAGEHANDINSTANCE
import typings.stagehand.libStagehandMod.default
import typings.stagehand.libUtilsTypesMod.HandlerType
import typings.stagehand.libUtilsTypesMod.MethodsOnly
import typings.stagehand.libUtilsTypesMod.RemoteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stagehand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T](endpoint: MessageEndpoint): js.Promise[Remote[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(endpoint.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote[T]]]
  
  inline def disconnect[T](remote: Remote[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(remote.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def launch[T](endpoint: MessageEndpoint, implementation: Implementation[T]): js.Promise[default[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("launch")(endpoint.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default[T]]]
  
  type Implementation[T] = HandlerType[T]
  
  trait MessageEndpoint extends StObject {
    
    def disconnect(): Unit
    
    def onMessage(callback: js.Function1[/* message */ Any, Unit]): Unit
    
    def sendMessage(message: Any): Unit
  }
  object MessageEndpoint {
    
    inline def apply(
      disconnect: () => Unit,
      onMessage: js.Function1[/* message */ Any, Unit] => Unit,
      sendMessage: Any => Unit
    ): MessageEndpoint = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
      __obj.asInstanceOf[MessageEndpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEndpoint] (val x: Self) extends AnyVal {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setOnMessage(value: js.Function1[/* message */ Any, Unit] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setSendMessage(value: Any => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
    }
  }
  
  type Remote[T] = RemoteType[MethodsOnly[T]] & STAGEHANDINSTANCE[T]
}
