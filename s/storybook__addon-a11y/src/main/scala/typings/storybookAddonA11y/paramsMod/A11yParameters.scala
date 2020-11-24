package typings.storybookAddonA11y.paramsMod

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yParameters extends js.Object {
  
  var config: js.UndefOr[Spec] = js.native
  
  var element: js.UndefOr[ElementContext] = js.native
  
  var manual: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[RunOptions] = js.native
}
object A11yParameters {
  
  @scala.inline
  def apply(): A11yParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yParameters]
  }
  
  @scala.inline
  implicit class A11yParametersOps[Self <: A11yParameters] (val x: Self) extends AnyVal {
    
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
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setElement(value: ElementContext): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setManual(value: Boolean): Self = this.set("manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    
    @scala.inline
    def setOptions(value: RunOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
