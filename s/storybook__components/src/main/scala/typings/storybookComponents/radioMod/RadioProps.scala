package typings.storybookComponents.radioMod

import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSingleSelection
import typings.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsSingleSelection> & @storybook/components.@storybook/components/dist/controls/options/Radio.RadioConfig */
@js.native
trait RadioProps extends js.Object {
  
  var argType: js.UndefOr[ArgType] = js.native
  
  var defaultValue: js.UndefOr[OptionsSingleSelection] = js.native
  
  var isInline: Boolean = js.native
  
  var name: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  def onChange(value: OptionsSingleSelection): OptionsSingleSelection | Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var options: OptionsObject = js.native
  
  var value: js.UndefOr[OptionsSingleSelection] = js.native
}
object RadioProps {
  
  @scala.inline
  def apply(
    isInline: Boolean,
    name: String,
    onChange: OptionsSingleSelection => OptionsSingleSelection | Unit,
    options: OptionsObject
  ): RadioProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
  
  @scala.inline
  implicit class RadioPropsOps[Self <: RadioProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: OptionsSingleSelection => OptionsSingleSelection | Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgType(value: ArgType): Self = this.set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgType: Self = this.set("argType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: OptionsSingleSelection): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
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
    def setValue(value: OptionsSingleSelection): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
