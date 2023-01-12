package typings.simonwepSelectionJs.mod

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget[Events /* <: EventMap */] extends StObject {
  
  /* private */ val _listeners: Any
  
  def addEventListener[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type
  
  def dispatchEvent[K /* <: /* keyof Events */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Parameters<Events[K]> is not an array type */ data: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]
  ): Any
  
  def emit[K /* <: /* keyof Events */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Parameters<Events[K]> is not an array type */ data: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]
  ): Any
  
  def off[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type
  
  // Let's also support on, off and emit like node
  /* eslint-disable no-invalid-this */
  def on[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type
  
  def removeEventListener[K /* <: /* keyof Events */ String */](
    event: K,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
  ): this.type
  
  def unbindAllListeners(): Unit
}
object EventTarget {
  
  inline def apply[Events /* <: EventMap */](
    _listeners: Any,
    addEventListener: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events],
    dispatchEvent: (Any, Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]) => Any,
    emit: (Any, Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ]) => Any,
    off: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events],
    on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events],
    removeEventListener: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events],
    unbindAllListeners: () => Unit
  ): EventTarget[Events] = {
    val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction2(dispatchEvent), emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), removeEventListener = js.Any.fromFunction2(removeEventListener), unbindAllListeners = js.Any.fromFunction0(unbindAllListeners))
    __obj.asInstanceOf[EventTarget[Events]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTarget[?], Events /* <: EventMap */] (val x: Self & EventTarget[Events]) extends AnyVal {
    
    inline def setAddEventListener(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events]
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setDispatchEvent(
      value: (Any, Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
        ]) => Any
    ): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction2(value))
    
    inline def setEmit(
      value: (Any, Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
        ]) => Any
    ): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setOff(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events]
    ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events]
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRemoveEventListener(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any) => EventTarget[Events]
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setUnbindAllListeners(value: () => Unit): Self = StObject.set(x, "unbindAllListeners", js.Any.fromFunction0(value))
    
    inline def set_listeners(value: Any): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
  }
}
