package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyExpression extends CustomPropertyCommon {
  var component: qlikLib.qlikLibStrings.expression
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var expressionType: qlikLib.qlikLibStrings.dimension | qlikLib.qlikLibStrings.measure | qlikLib.qlikLibStrings.StringExpr | qlikLib.qlikLibStrings.ValueExpr | qlikLib.qlikLibStrings.ValueExpression | qlikLib.qlikLibStrings.StringExpression
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing]
}

