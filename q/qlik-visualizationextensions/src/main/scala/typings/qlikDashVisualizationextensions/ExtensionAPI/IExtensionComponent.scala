package typings.qlikDashVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionComponent extends js.Object {
  var model: IExtensionModel
}

object IExtensionComponent {
  @scala.inline
  def apply(model: IExtensionModel): IExtensionComponent = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExtensionComponent]
  }
}

