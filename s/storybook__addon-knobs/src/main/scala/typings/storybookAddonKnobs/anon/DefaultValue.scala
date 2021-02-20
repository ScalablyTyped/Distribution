package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends StObject {
  
  var callback: ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var disableDebounce: js.UndefOr[Boolean] = js.native
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var hideLabel: `true` with js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var `type`: js.Any = js.native
  
  var used: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
}
object DefaultValue {
  
  @scala.inline
  def apply(
    callback: ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]],
    hideLabel: `true` with js.UndefOr[Boolean],
    label: String,
    name: String,
    `type`: js.Any
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], hideLabel = hideLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisableDebounce(value: Boolean): Self = StObject.set(x, "disableDebounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDebounceUndefined: Self = StObject.set(x, "disableDebounce", js.undefined)
    
    @scala.inline
    def setDisableForceUpdate(value: Boolean): Self = StObject.set(x, "disableForceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableForceUpdateUndefined: Self = StObject.set(x, "disableForceUpdate", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setHideLabel(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
