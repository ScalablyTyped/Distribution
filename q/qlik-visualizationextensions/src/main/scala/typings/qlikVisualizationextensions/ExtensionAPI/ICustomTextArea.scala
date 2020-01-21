package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomTextArea extends ICustomControl {
  var component: textarea
  var defaultValue: String
  var maxlength: Double
  var rows: Double
  var show: valueOrfunc[Boolean]
}

object ICustomTextArea {
  @scala.inline
  def apply(
    component: textarea,
    defaultValue: String,
    label: String,
    maxlength: Double,
    ref: String,
    rows: Double,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomTextArea]
  }
}

