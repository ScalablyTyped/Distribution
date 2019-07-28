package typings.qlik.qlikMod

import typings.qlik.qlikNumbers.`-1`
import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriteria extends js.Object {
  var qExpression: ValueExpr
  var qSortByAscii: `-1` | `0` | `1`
  var qSortByExpression: `-1` | `0` | `1`
  var qSortByFrequency: `-1` | `0` | `1`
  var qSortByLoadOrder: `-1` | `0` | `1`
  var qSortByNumeric: `-1` | `0` | `1`
  var qSortByState: `-1` | `0` | `1`
}

object SortCriteria {
  @scala.inline
  def apply(
    qExpression: ValueExpr,
    qSortByAscii: `-1` | `0` | `1`,
    qSortByExpression: `-1` | `0` | `1`,
    qSortByFrequency: `-1` | `0` | `1`,
    qSortByLoadOrder: `-1` | `0` | `1`,
    qSortByNumeric: `-1` | `0` | `1`,
    qSortByState: `-1` | `0` | `1`
  ): SortCriteria = {
    val __obj = js.Dynamic.literal(qExpression = qExpression, qSortByAscii = qSortByAscii.asInstanceOf[js.Any], qSortByExpression = qSortByExpression.asInstanceOf[js.Any], qSortByFrequency = qSortByFrequency.asInstanceOf[js.Any], qSortByLoadOrder = qSortByLoadOrder.asInstanceOf[js.Any], qSortByNumeric = qSortByNumeric.asInstanceOf[js.Any], qSortByState = qSortByState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortCriteria]
  }
}

