package typings
package signalsDotJsLib.libOrgOsflashSignalsEventsIEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  /** Indicates whether the event is a bubbling event. */
  var bubbles: scala.Boolean
  /** The object that added the listener for the event. */
  var currentTarget: js.Object
  /** The signal that dispatched the event. */
  var signal: signalsDotJsLib.libOrgOsflashSignalsIPrioritySignalMod.IPrioritySignal
  /** The object that originally dispatched the event.
    *  When dispatched from an signal, the target is the object containing the signal. */
  var target: js.Object
}

