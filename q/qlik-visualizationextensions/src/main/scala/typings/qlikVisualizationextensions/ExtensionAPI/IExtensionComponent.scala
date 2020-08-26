package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExtensionComponent extends js.Object {
  var model: IExtensionModel = js.native
}

object IExtensionComponent {
  @scala.inline
  def apply(model: IExtensionModel): IExtensionComponent = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionComponent]
  }
  @scala.inline
  implicit class IExtensionComponentOps[Self <: IExtensionComponent] (val x: Self) extends AnyVal {
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
    def setModel(value: IExtensionModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
  
}

