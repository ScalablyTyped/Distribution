package typings.signalsJs.isignalMod

import org.scalablytyped.runtime.TopLevel
import typings.signalsJs.ioncesignalMod.IOnceSignal
import typings.signalsJs.islotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("signals.js/lib/org/osflash/signals/ISignal", "ISignal")
@js.native
object ISignal
  extends TopLevel[js.Symbol]

