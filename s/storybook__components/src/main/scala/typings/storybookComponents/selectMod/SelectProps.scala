package typings.storybookComponents.selectMod

import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import typings.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsSelection> & @storybook/components.@storybook/components/dist/controls/options/Select.SelectConfig */
@js.native
trait SelectProps extends js.Object {
  
  var argType: js.UndefOr[ArgType] = js.native
  
  var defaultValue: js.UndefOr[OptionsSelection] = js.native
  
  var isMulti: Boolean = js.native
  
  var name: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  def onChange(value: OptionsSelection): OptionsSelection | Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var options: OptionsObject = js.native
  
  var value: js.UndefOr[OptionsSelection] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(
    isMulti: Boolean,
    name: String,
    onChange: OptionsSelection => OptionsSelection | Unit,
    options: OptionsObject
  ): SelectProps = {
    val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    
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
    def setIsMulti(value: Boolean): Self = this.set("isMulti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: OptionsSelection => OptionsSelection | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgType(value: ArgType): Self = this.set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgType: Self = this.set("argType", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: js.Any*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: OptionsSelection): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
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
    def setValue(value: OptionsSelection): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
