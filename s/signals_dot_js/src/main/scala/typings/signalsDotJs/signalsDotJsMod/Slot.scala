package typings.signalsDotJs.signalsDotJsMod

import typings.signalsDotJs.libOrgOsflashSignalsIOnceSignalMod.IOnceSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js", "Slot")
@js.native
class Slot protected ()
  extends typings.signalsDotJs.libOrgOsflashSignalsSlotMod.Slot {
  /**
    * Creates and returns a new Slot object.
    *
    * @param listener The listener associated with the slot.
    * @param signal The signal associated with the slot.
    * @param once Whether or not the listener should be executed only once.
    * @param priority The priority of the slot.
    *
    * @throws ArgumentError <code>ArgumentError</code>: Given listener is <code>null</code>.
    * @throws Error <code>Error</code>: Internal signal reference has not been set yet.
    */
  def this(listener: js.Function, signal: IOnceSignal) = this()
  def this(listener: js.Function, signal: IOnceSignal, once: Boolean) = this()
  def this(listener: js.Function, signal: IOnceSignal, once: Boolean, priority: Double) = this()
}

