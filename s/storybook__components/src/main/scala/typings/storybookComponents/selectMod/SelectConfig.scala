package typings.storybookComponents.selectMod

import typings.storybookComponents.controlsTypesMod.OptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/controls/types.NormalizedOptionsConfig & {  isMulti :boolean} */
@js.native
trait SelectConfig extends js.Object {
  
  var isMulti: Boolean = js.native
  
  var options: OptionsObject = js.native
}
object SelectConfig {
  
  @scala.inline
  def apply(isMulti: Boolean, options: OptionsObject): SelectConfig = {
    val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectConfig]
  }
  
  @scala.inline
  implicit class SelectConfigOps[Self <: SelectConfig] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
