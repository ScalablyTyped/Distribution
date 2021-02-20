package typings.signalsJs

import typings.signalsJs.islotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioncesignalMod {
  
  @js.native
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
    def addOnce(listener: js.Function): ISlot = js.native
    
    /**
      * Dispatches an object to listeners.
      * @param    valueObjects    Any number of parameters to send to listeners. Will be type-checked against valueClasses.
      * @throws    ArgumentError    <code>ArgumentError</code>:    valueObjects are not compatible with valueClasses.
      */
    def dispatch(valueObjects: js.Any*): Unit = js.native
    
    /** The current number of listeners for the signal. */
    var numListeners: Double = js.native
    
    /**
      * Unsubscribes a listener from the signal.
      * @param    listener
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def remove(listener: js.Function): ISlot = js.native
    
    /**
      * Unsubscribes all listeners from the signal.
      */
    def removeAll(): Unit = js.native
    
    /**
      * An optional array of classes defining the types of parameters sent to listeners.
      */
    var valueClasses: js.Array[_] = js.native
  }
  object IOnceSignal {
    
    @JSImport("signals.js/lib/org/osflash/signals/IOnceSignal", "IOnceSignal")
    @js.native
    val ^ : js.Symbol = js.native
    
    @scala.inline
    implicit class IOnceSignalMutableBuilder[Self <: IOnceSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOnce(value: js.Function => ISlot): Self = StObject.set(x, "addOnce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatch(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumListeners(value: Double): Self = StObject.set(x, "numListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: js.Function => ISlot): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAll(value: () => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValueClasses(value: js.Array[_]): Self = StObject.set(x, "valueClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueClassesVarargs(value: js.Any*): Self = StObject.set(x, "valueClasses", js.Array(value :_*))
    }
  }
}
