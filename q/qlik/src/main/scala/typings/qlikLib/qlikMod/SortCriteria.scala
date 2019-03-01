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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qExpression")(qExpression)
    __obj.updateDynamic("qSortByAscii")(qSortByAscii.asInstanceOf[js.Any])
    __obj.updateDynamic("qSortByExpression")(qSortByExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("qSortByFrequency")(qSortByFrequency.asInstanceOf[js.Any])
    __obj.updateDynamic("qSortByLoadOrder")(qSortByLoadOrder.asInstanceOf[js.Any])
    __obj.updateDynamic("qSortByNumeric")(qSortByNumeric.asInstanceOf[js.Any])
    __obj.updateDynamic("qSortByState")(qSortByState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
}

