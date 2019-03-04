package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomTextArea extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.textarea
  var defaultValue: java.lang.String
  var maxlength: scala.Double
  var rows: scala.Double
  var show: valueOrfunc[scala.Boolean]
}

object ICustomTextArea {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.textarea,
    defaultValue: java.lang.String,
    label: java.lang.String,
    maxlength: scala.Double,
    ref: java.lang.String,
    rows: scala.Double,
    show: valueOrfunc[scala.Boolean],
    `type`: java.lang.String
  ): ICustomTextArea = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, maxlength = maxlength, ref = ref, rows = rows, show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomTextArea]
  }
}

