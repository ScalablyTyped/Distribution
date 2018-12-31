package typings
package signalsDotJsLib.libOrgOsflashSignalsEventsGenericEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js/lib/org/osflash/signals/events/GenericEvent", "GenericEvent")
@js.native
class GenericEvent ()
  extends signalsDotJsLib.libOrgOsflashSignalsEventsIEventMod.IEvent {
  def this(bubbles: scala.Boolean) = this()
  var _bubbles: scala.Boolean = js.native
  var _currentTarget: js.Object = js.native
  var _signal: signalsDotJsLib.libOrgOsflashSignalsIPrioritySignalMod.IPrioritySignal = js.native
  var _target: js.Object = js.native
  /** Indicates whether the event is a bubbling event. */
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /** The object that added the listener for the event. */
  /* CompleteClass */
  override var currentTarget: js.Object = js.native
  /** The signal that dispatched the event. */
  /* CompleteClass */
  override var signal: signalsDotJsLib.libOrgOsflashSignalsIPrioritySignalMod.IPrioritySignal = js.native
  /** The object that originally dispatched the event.
    *  When dispatched from an signal, the target is the object containing the signal. */
  /* CompleteClass */
  override var target: js.Object = js.native
}

