package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends js.Object {
  
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
  implicit class DefaultValueOps[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]]): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabel(value: `true` with js.UndefOr[Boolean]): Self = this.set("hideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisableDebounce(value: Boolean): Self = this.set("disableDebounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDebounce: Self = this.set("disableDebounce", js.undefined)
    
    @scala.inline
    def setDisableForceUpdate(value: Boolean): Self = this.set("disableForceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableForceUpdate: Self = this.set("disableForceUpdate", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setUsed(value: Boolean): Self = this.set("used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
}
