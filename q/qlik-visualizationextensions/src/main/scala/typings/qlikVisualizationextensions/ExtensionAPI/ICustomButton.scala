package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomButton extends ICustomControl {
  
  var action: valueOrfunc[Unit] = js.native
  
  var component: button = js.native
}
object ICustomButton {
  
  @scala.inline
  def apply(action: valueOrfunc[Unit], component: button, label: String, ref: String, `type`: String): ICustomButton = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomButton]
  }
  
  @scala.inline
  implicit class ICustomButtonOps[Self <: ICustomButton] (val x: Self) extends AnyVal {
    
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
    def setActionFunction0(value: () => Unit): Self = this.set("action", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAction(value: valueOrfunc[Unit]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: button): Self = this.set("component", value.asInstanceOf[js.Any])
  }
}
