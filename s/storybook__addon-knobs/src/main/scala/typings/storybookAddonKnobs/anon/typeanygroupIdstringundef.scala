package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :any,   groupId :string | undefined,   disableDebounce :boolean | undefined,   disableForceUpdate :boolean | undefined,   name :string,   label :string,   used :boolean | undefined,   defaultValue :any | undefined,   hideLabel :boolean | undefined,   callback :(): any | undefined} & std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
@js.native
trait typeanygroupIdstringundef extends StObject {
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var disableDebounce: js.UndefOr[Boolean] = js.native
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var hideLabel: js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var `type`: js.Any = js.native
  
  var used: js.UndefOr[Boolean] = js.native
  
  var value: js.Any = js.native
}
object typeanygroupIdstringundef {
  
  @scala.inline
  def apply(label: String, name: String, `type`: js.Any, value: js.Any): typeanygroupIdstringundef = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeanygroupIdstringundef]
  }
  
  @scala.inline
  implicit class typeanygroupIdstringundefMutableBuilder[Self <: typeanygroupIdstringundef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
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
    def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    
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
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
