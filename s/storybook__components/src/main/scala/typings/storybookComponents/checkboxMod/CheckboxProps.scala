package typings.storybookComponents.checkboxMod

import typings.storybookComponents.controlsTypesMod.OptionsMultiSelection
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsMultiSelection> & @storybook/components.@storybook/components/dist/controls/options/Checkbox.CheckboxConfig */
@js.native
trait CheckboxProps extends js.Object {
  
  var argType: js.UndefOr[ArgType] = js.native
  
  var defaultValue: js.UndefOr[OptionsMultiSelection] = js.native
  
  var isInline: Boolean = js.native
  
  var name: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  def onChange(value: OptionsMultiSelection): OptionsMultiSelection | Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var options: OptionsObject = js.native
  
  var value: js.UndefOr[OptionsMultiSelection] = js.native
}
object CheckboxProps {
  
  @scala.inline
  def apply(
    isInline: Boolean,
    name: String,
    onChange: OptionsMultiSelection => OptionsMultiSelection | Unit,
    options: OptionsObject
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
  
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    
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
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: OptionsMultiSelection => OptionsMultiSelection | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgType(value: ArgType): Self = this.set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgType: Self = this.set("argType", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: js.Any*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: OptionsMultiSelection): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* evt */ js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* evt */ js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: OptionsMultiSelection): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
