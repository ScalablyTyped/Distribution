package typings.qlik.mod

import typings.qlik.qlikStrings.StringExpr
import typings.qlik.qlikStrings.StringExpression
import typings.qlik.qlikStrings.ValueExpression
import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.dimension
import typings.qlik.qlikStrings.expression
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.measure
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  var component: expression
  var defaultValue: js.UndefOr[String] = js.undefined
  var expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing] = js.undefined
}

object CustomPropertyExpression {
  @scala.inline
  def apply(
    component: expression,
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    defaultValue: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
}

