package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomString extends ICustomControl {
  var defaultValue: java.lang.String
  var expression: ExpressionType
  var maxlength: scala.Double
  var show: valueOrfunc[scala.Boolean]
}

object ICustomString {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    expression: ExpressionType,
    label: java.lang.String,
    maxlength: scala.Double,
    ref: java.lang.String,
    show: valueOrfunc[scala.Boolean],
    `type`: java.lang.String
  ): ICustomString = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("maxlength")(maxlength)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomString]
  }
}

