package typings.qlikDashVisualizationextensions.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomString extends ICustomControl {
  var defaultValue: String
  var expression: ExpressionType
  var maxlength: Double
  var show: valueOrfunc[Boolean]
}

object ICustomString {
  @scala.inline
  def apply(
    defaultValue: String,
    expression: ExpressionType,
    label: String,
    maxlength: Double,
    ref: String,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomString = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, expression = expression, label = label, maxlength = maxlength, ref = ref, show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomString]
  }
}

