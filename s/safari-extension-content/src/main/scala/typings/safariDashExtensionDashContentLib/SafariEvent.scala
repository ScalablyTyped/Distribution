package typings
package safariDashExtensionDashContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariEvent extends js.Object {
  /**
  		* A Boolean value that indicates whether the event goes through the bubbling phase.
  		*/
  var bubbles: scala.Boolean
  /**
  		* A Boolean value that indicates whether the event can be canceled.
  		*/
  var cancelable: scala.Boolean
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  var currentTarget: SafariEventTarget
  /**
  		* A Boolean value that indicates whether the event’s default action has been prevented.
  		*/
  var defaultPrevented: scala.Boolean
  /**
  		* The event-handling phase that the event is in.
  		* The values for this property are the same as the values used by Webkit to identify the event-handling phases.
  		*/
  var eventPhase: scala.Double
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  var target: SafariEventTarget
  /**
  		* The time and date that the event was created.
  		*/
  var timestamp: scala.Double
  /**
  		* The type of the event.
  		* The string used to identify a particular type of event is documented in the reference for that class.
  		*/
  var `type`: java.lang.String
  /**
  		* Prevents the browser from performing the default action for an event.
  		* Use this method to indicate that your extension has already fully handled the event; you don’t want the browser to do anything. Note that preventing the default action does not stop an event from propagating.
  		*/
  def preventDefault(): scala.Unit
  /**
  		* Prevents the event from any further propagation.
  		* Propagation can be stopped only fon cancelable events. After propagation is stopped, the event is not sent to any other targets.
  		*/
  def stopPropagation(): scala.Unit
}

object SafariEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: SafariEventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariEventTarget,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SafariEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SafariEvent]
  }
}

