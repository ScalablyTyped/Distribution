package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var callback: ButtonTypeOnClickProp & js.UndefOr[js.Function0[js.Any]]
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var disableDebounce: js.UndefOr[Boolean] = js.undefined
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var hideLabel: `true` & js.UndefOr[Boolean]
  
  var label: String
  
  var name: String
  
  var `type`: js.Any
  
  var used: js.UndefOr[Boolean] = js.undefined
  
  var value: Unit
}
object DefaultValue {
  
  inline def apply(
    callback: ButtonTypeOnClickProp & js.UndefOr[js.Function0[js.Any]],
    hideLabel: `true` & js.UndefOr[Boolean],
    label: String,
    name: String,
    `type`: js.Any,
    value: Unit
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], hideLabel = hideLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setCallback(value: ButtonTypeOnClickProp & js.UndefOr[js.Function0[js.Any]]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
    
    inline def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
    
    inline def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHideLabel(value: `true` & js.UndefOr[Boolean]): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
