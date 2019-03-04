package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.expression
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var expressionType: qlikLib.qlikLibStrings.dimension | qlikLib.qlikLibStrings.measure | qlikLib.qlikLibStrings.StringExpr | qlikLib.qlikLibStrings.ValueExpr | qlikLib.qlikLibStrings.ValueExpression | qlikLib.qlikLibStrings.StringExpression
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing]
}

object CustomPropertyExpression {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.expression,
    expressionType: qlikLib.qlikLibStrings.dimension | qlikLib.qlikLibStrings.measure | qlikLib.qlikLibStrings.StringExpr | qlikLib.qlikLibStrings.ValueExpr | qlikLib.qlikLibStrings.ValueExpression | qlikLib.qlikLibStrings.StringExpression,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component, expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomPropertyExpression]
  }
}

