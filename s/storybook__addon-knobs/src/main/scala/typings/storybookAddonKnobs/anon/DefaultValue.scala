package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var callback: ButtonTypeOnClickProp
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var disableDebounce: js.UndefOr[Boolean] = js.undefined
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var hideLabel: `true`
  
  var label: String
  
  var name: String
  
  var `type`: Any
  
  var used: js.UndefOr[Boolean] = js.undefined
  
  var value: Unit
}
object DefaultValue {
  
  inline def apply(callback: /* knob */ ButtonTypeKnob => Any, label: String, name: String, `type`: Any, value: Unit): DefaultValue = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = true, label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* knob */ ButtonTypeKnob => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
    
    inline def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
    
    inline def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHideLabel(value: `true`): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
