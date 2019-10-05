package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.textarea
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
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, maxlength = maxlength, ref = ref, rows = rows, show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomTextArea]
  }
}

