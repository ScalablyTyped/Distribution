package typings.storybookComponents.checkboxMod

import typings.storybookComponents.controlsTypesMod.OptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/controls/types.NormalizedOptionsConfig & {  isInline :boolean} */
@js.native
trait CheckboxConfig extends js.Object {
  
  var isInline: Boolean = js.native
  
  var options: OptionsObject = js.native
}
object CheckboxConfig {
  
  @scala.inline
  def apply(isInline: Boolean, options: OptionsObject): CheckboxConfig = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxConfig]
  }
  
  @scala.inline
  implicit class CheckboxConfigOps[Self <: CheckboxConfig] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
