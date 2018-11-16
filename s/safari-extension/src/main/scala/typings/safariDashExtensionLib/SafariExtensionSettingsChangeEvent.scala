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

