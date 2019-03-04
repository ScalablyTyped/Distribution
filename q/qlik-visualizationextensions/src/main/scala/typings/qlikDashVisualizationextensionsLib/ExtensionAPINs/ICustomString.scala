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
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, expression = expression, label = label, maxlength = maxlength, ref = ref, show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomString]
  }
}

