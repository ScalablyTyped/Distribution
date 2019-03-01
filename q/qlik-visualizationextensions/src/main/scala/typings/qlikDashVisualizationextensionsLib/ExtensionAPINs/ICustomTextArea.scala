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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("maxlength")(maxlength)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomTextArea]
  }
}

