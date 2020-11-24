package typings.reactAlbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardComponentProps extends js.Object {
  
  var wizard: WizardContext = js.native
}
object WizardComponentProps {
  
  @scala.inline
  def apply(wizard: WizardContext): WizardComponentProps = {
    val __obj = js.Dynamic.literal(wizard = wizard.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardComponentProps]
  }
  
  @scala.inline
  implicit class WizardComponentPropsOps[Self <: WizardComponentProps] (val x: Self) extends AnyVal {
    
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
    def setWizard(value: WizardContext): Self = this.set("wizard", value.asInstanceOf[js.Any])
  }
}
