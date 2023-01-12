package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariExtensionSettingsChangeEvent
  extends StObject
     with SafariEvent {
  
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
  var newValue: Any
  
  /**
    * The value before the settings change.
    */
  var oldValue: Any
  
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  @JSName("target")
  var target_SafariExtensionSettingsChangeEvent: SafariExtensionSettings | SafariExtensionSecureSettings
}
object SafariExtensionSettingsChangeEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: SafariExtensionSettings | SafariExtensionSecureSettings,
    defaultPrevented: Boolean,
    eventPhase: Double,
    key: String,
    newValue: Any,
    oldValue: Any,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariExtensionSettings | SafariExtensionSecureSettings,
    timestamp: Double,
    `type`: String
  ): SafariExtensionSettingsChangeEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionSettingsChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafariExtensionSettingsChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setCurrentTarget(value: SafariExtensionSettings | SafariExtensionSecureSettings): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SafariExtensionSettings | SafariExtensionSecureSettings): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
