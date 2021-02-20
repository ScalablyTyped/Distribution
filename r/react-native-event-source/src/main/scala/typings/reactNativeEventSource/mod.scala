package typings.reactNativeEventSource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-event-source", JSImport.Default)
  @js.native
  class default protected () extends RNEventSource {
    def this(url: String) = this()
    def this(url: String, options: js.Object) = this()
  }
  
  type ListenerCallback = js.Function1[/* event */ MessageEvent, Unit]
  
  @js.native
  trait MessageEvent extends StObject {
    
    var data: String | Null = js.native
    
    var lastEventId: String = js.native
    
    var origin: String = js.native
    
    var `type`: String = js.native
  }
  object MessageEvent {
    
    @scala.inline
    def apply(lastEventId: String, origin: String, `type`: String): MessageEvent = {
      val __obj = js.Dynamic.literal(lastEventId = lastEventId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RNEventSource extends StObject {
    
    def addEventListener(`type`: String, listener: ListenerCallback): js.Any = js.native
    
    def close(): Unit = js.native
    
    def removeAllListeners(): Unit = js.native
    
    def removeListener(`type`: String, listener: ListenerCallback): Unit = js.native
  }
  object RNEventSource {
    
    @scala.inline
    def apply(
      addEventListener: (String, ListenerCallback) => js.Any,
      close: () => Unit,
      removeAllListeners: () => Unit,
      removeListener: (String, ListenerCallback) => Unit
    ): RNEventSource = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[RNEventSource]
    }
    
    @scala.inline
    implicit class RNEventSourceMutableBuilder[Self <: RNEventSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (String, ListenerCallback) => js.Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(value: (String, ListenerCallback) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
}
