package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionSettingsChangeEvent extends SafariEvent {
  /**
  		* The object that the event is currently being sent to.
  		* This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
  		*/
  @JSName("currentTarget")
  var currentTarget_SafariExtensionSettingsChangeEvent: SafariExtensionSettings | SafariExtensionSecureSettings
  /**
  		* The key identifier of the setting that was changed.
  		*/
  var key: java.lang.String
  /**
  		* The value after the settings change.
  		*/
  var newValue: js.Any
  /**
  		* The value before the settings change.
  		*/
  var oldValue: js.Any
  /**
  		* The target of the event.
  		* This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
  		*/
  @JSName("target")
  var target_SafariExtensionSettingsChangeEvent: SafariExtensionSettings | SafariExtensionSecureSettings
}

object SafariExtensionSettingsChangeEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: SafariExtensionSettings | SafariExtensionSecureSettings,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    key: java.lang.String,
    newValue: js.Any,
    oldValue: js.Any,
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: SafariExtensionSettings | SafariExtensionSecureSettings,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SafariExtensionSettingsChangeEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("newValue")(newValue)
    __obj.updateDynamic("oldValue")(oldValue)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SafariExtensionSettingsChangeEvent]
  }
}

