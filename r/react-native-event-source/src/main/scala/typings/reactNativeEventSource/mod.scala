package typings.reactNativeEventSource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-event-source", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RNEventSource {
    def this(url: String) = this()
    def this(url: String, options: js.Object) = this()
    
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: ListenerCallback): Any = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def removeAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def removeListener(`type`: String, listener: ListenerCallback): Unit = js.native
  }
  
  type ListenerCallback = js.Function1[/* event */ MessageEvent, Unit]
  
  trait MessageEvent extends StObject {
    
    var data: String | Null
    
    var lastEventId: String
    
    var origin: String
    
    var `type`: String
  }
  object MessageEvent {
    
    inline def apply(lastEventId: String, origin: String, `type`: String): MessageEvent = {
      val __obj = js.Dynamic.literal(lastEventId = lastEventId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], data = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RNEventSource extends StObject {
    
    def addEventListener(`type`: String, listener: ListenerCallback): Any
    
    def close(): Unit
    
    def removeAllListeners(): Unit
    
    def removeListener(`type`: String, listener: ListenerCallback): Unit
  }
  object RNEventSource {
    
    inline def apply(
      addEventListener: (String, ListenerCallback) => Any,
      close: () => Unit,
      removeAllListeners: () => Unit,
      removeListener: (String, ListenerCallback) => Unit
    ): RNEventSource = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[RNEventSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RNEventSource] (val x: Self) extends AnyVal {
      
      inline def setAddEventListener(value: (String, ListenerCallback) => Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(value: (String, ListenerCallback) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
}
