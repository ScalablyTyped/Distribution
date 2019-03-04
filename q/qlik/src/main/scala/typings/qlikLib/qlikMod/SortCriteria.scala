package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriteria extends js.Object {
  var qExpression: ValueExpr
  var qSortByAscii: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qSortByExpression: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qSortByFrequency: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qSortByLoadOrder: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qSortByNumeric: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  var qSortByState: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
}

object SortCriteria {
  @scala.inline
  def apply(
    qExpression: ValueExpr,
    qSortByAscii: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qSortByExpression: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qSortByFrequency: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qSortByLoadOrder: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qSortByNumeric: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`,
    qSortByState: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  ): SortCriteria = {
    val __obj = js.Dynamic.literal(qExpression = qExpression, qSortByAscii = qSortByAscii.asInstanceOf[js.Any], qSortByExpression = qSortByExpression.asInstanceOf[js.Any], qSortByFrequency = qSortByFrequency.asInstanceOf[js.Any], qSortByLoadOrder = qSortByLoadOrder.asInstanceOf[js.Any], qSortByNumeric = qSortByNumeric.asInstanceOf[js.Any], qSortByState = qSortByState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortCriteria]
  }
}

