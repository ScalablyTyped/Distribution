package typings.signalsJs.ioncesignalMod

import org.scalablytyped.runtime.TopLevel
import typings.signalsJs.islotMod.ISlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnceSignal extends js.Object {
  /** The current number of listeners for the signal. */
  var numListeners: Double = js.native
  /**
    * An optional array of classes defining the types of parameters sent to listeners.
    */
  var valueClasses: js.Array[_] = js.native
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
}

@JSImport("signals.js/lib/org/osflash/signals/IOnceSignal", "IOnceSignal")
@js.native
object IOnceSignal
  extends TopLevel[js.Symbol]

