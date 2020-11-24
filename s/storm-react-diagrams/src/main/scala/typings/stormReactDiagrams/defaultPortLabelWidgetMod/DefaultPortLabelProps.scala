package typings.stormReactDiagrams.defaultPortLabelWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPortLabelProps extends BaseWidgetProps {
  
  var model: DefaultPortModel = js.native
}
object DefaultPortLabelProps {
  
  @scala.inline
  def apply(model: DefaultPortModel): DefaultPortLabelProps = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPortLabelProps]
  }
  
  @scala.inline
  implicit class DefaultPortLabelPropsOps[Self <: DefaultPortLabelProps] (val x: Self) extends AnyVal {
    
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
    def setModel(value: DefaultPortModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
