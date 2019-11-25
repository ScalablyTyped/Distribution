package typings.qlikDashVisualizationextensions.ExtensionAPI

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
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomString]
  }
}

