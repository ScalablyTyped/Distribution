package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :any,   groupId :string | undefined,   disableDebounce :boolean | undefined,   disableForceUpdate :boolean | undefined,   name :string,   label :string,   used :boolean | undefined,   defaultValue :any | undefined,   hideLabel :boolean | undefined,   callback :(): any | undefined} & std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
trait typeanygroupIdstringundef extends StObject {
  
  var callback: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var disableDebounce: js.UndefOr[Boolean] = js.undefined
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var hideLabel: js.UndefOr[Boolean] = js.undefined
  
  var label: String
  
  var name: String
  
  var `type`: js.Any
  
  var used: js.UndefOr[Boolean] = js.undefined
  
  var value: js.Any
}
object typeanygroupIdstringundef {
  
  inline def apply(label: String, name: String, `type`: js.Any, value: js.Any): typeanygroupIdstringundef = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeanygroupIdstringundef]
  }
  
  extension [Self <: typeanygroupIdstringundef](x: Self) {
    
    inline def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
    
    inline def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
    
    inline def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
