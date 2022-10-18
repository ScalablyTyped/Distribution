package typings.signalsJs

import typings.signalsJs.libOrgOsflashSignalsIoncesignalMod.IOnceSignal
import typings.signalsJs.libOrgOsflashSignalsIslotMod.ISlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOrgOsflashSignalsIsignalMod {
  
  trait ISignal
    extends StObject
       with IOnceSignal {
    
    /**
      * Subscribes a listener for the signal.
      * @param    listener A function with arguments
      * that matches the value classes dispatched by the signal.
      * If value classes are not specified (e.g. via Signal constructor), dispatch() can be called without arguments.
      * @return a ISlot, which contains the Function passed as the parameter
      */
    def add(listener: js.Function): ISlot
  }
  object ISignal {
    
    @JSImport("signals.js/lib/org/osflash/signals/ISignal", "ISignal")
    @js.native
    val ^ : js.Symbol = js.native
    
    extension [Self <: ISignal](x: Self) {
      
      inline def setAdd(value: js.Function => ISlot): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
}
