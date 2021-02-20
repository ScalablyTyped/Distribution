package typings.signalsJs

import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isignalMod {
  
  @js.native
  trait ISignal extends IOnceSignal {
    
    /**
      * Subscribes a listener for the signal.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def add(listener: js.Function): ISlot = js.native
  }
  object ISignal {
    
    @JSImport("signals.js/lib/org/osflash/signals/ISignal", "ISignal")
    @js.native
    val ^ : js.Symbol = js.native
    
    @scala.inline
    implicit class ISignalMutableBuilder[Self <: ISignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: js.Function => ISlot): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
}
