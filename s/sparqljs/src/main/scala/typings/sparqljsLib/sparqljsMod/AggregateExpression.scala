package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateExpression extends BaseExpression {
  var aggregation: java.lang.String
  var expression: Expression
  var separator: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_AggregateExpression: sparqljsLib.sparqljsLibStrings.aggregate
}

