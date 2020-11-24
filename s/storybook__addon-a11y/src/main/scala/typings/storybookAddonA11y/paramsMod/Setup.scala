package typings.storybookAddonA11y.paramsMod

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Setup extends js.Object {
  
  var config: Spec = js.native
  
  var element: js.UndefOr[ElementContext] = js.native
  
  var options: RunOptions = js.native
}
object Setup {
  
  @scala.inline
  def apply(config: Spec, options: RunOptions): Setup = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setup]
  }
  
  @scala.inline
  implicit class SetupOps[Self <: Setup] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: Spec): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RunOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: ElementContext): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
}
