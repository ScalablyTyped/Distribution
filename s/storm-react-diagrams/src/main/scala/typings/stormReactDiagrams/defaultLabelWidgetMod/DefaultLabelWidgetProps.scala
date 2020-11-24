package typings.stormReactDiagrams.defaultLabelWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLabelWidgetProps extends BaseWidgetProps {
  
  var model: DefaultLabelModel = js.native
}
object DefaultLabelWidgetProps {
  
  @scala.inline
  def apply(model: DefaultLabelModel): DefaultLabelWidgetProps = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLabelWidgetProps]
  }
  
  @scala.inline
  implicit class DefaultLabelWidgetPropsOps[Self <: DefaultLabelWidgetProps] (val x: Self) extends AnyVal {
    
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
    def setModel(value: DefaultLabelModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
