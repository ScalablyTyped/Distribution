package typings.safariDashExtension

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
  var key: String
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
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: SafariExtensionSettings | SafariExtensionSecureSettings,
    defaultPrevented: Boolean,
    eventPhase: Double,
    key: String,
    newValue: js.Any,
    oldValue: js.Any,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariExtensionSettings | SafariExtensionSecureSettings,
    timestamp: Double,
    `type`: String
  ): SafariExtensionSettingsChangeEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented, eventPhase = eventPhase, key = key, newValue = newValue, oldValue = oldValue, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariExtensionSettingsChangeEvent]
  }
}

