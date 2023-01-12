package typings.signalsJs

import typings.signalsJs.libOrgOsflashSignalsIslotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOrgOsflashSignalsIoncesignalMod {
  
  trait IOnceSignal extends StObject {
    
    /**
      * Subscribes a one-time listener for this signal.
      * The signal will remove the listener automatically the first time it is called,
      * after the dispatch to all listeners is complete.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def addOnce(listener: js.Function): ISlot
    
    /**
      * Dispatches an object to listeners.
      * @param    valueObjects    Any number of parameters to send to listeners. Will be type-checked against valueClasses.
      * @throws    ArgumentError    <code>ArgumentError</code>:    valueObjects are not compatible with valueClasses.
      */
    def dispatch(valueObjects: Any*): Unit
    
    /** The current number of listeners for the signal. */
    var numListeners: Double
    
    /**
      * Unsubscribes a listener from the signal.
      * @param    listener
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def remove(listener: js.Function): ISlot
    
    /**
      * Unsubscribes all listeners from the signal.
      */
    def removeAll(): Unit
    
    /**
      * An optional array of classes defining the types of parameters sent to listeners.
      */
    var valueClasses: js.Array[Any]
  }
  object IOnceSignal {
    
    @JSImport("signals.js/lib/org/osflash/signals/IOnceSignal", "IOnceSignal")
    @js.native
    val ^ : js.Symbol = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnceSignal] (val x: Self) extends AnyVal {
      
      inline def setAddOnce(value: js.Function => ISlot): Self = StObject.set(x, "addOnce", js.Any.fromFunction1(value))
      
      inline def setDispatch(value: /* repeated */ Any => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setNumListeners(value: Double): Self = StObject.set(x, "numListeners", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: js.Function => ISlot): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAll(value: () => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction0(value))
      
      inline def setValueClasses(value: js.Array[Any]): Self = StObject.set(x, "valueClasses", value.asInstanceOf[js.Any])
      
      inline def setValueClassesVarargs(value: Any*): Self = StObject.set(x, "valueClasses", js.Array(value*))
    }
  }
}
