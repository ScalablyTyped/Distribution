package typings.qlik.qlikMod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QHeader extends js.Object {
  var col: Double
  var errorCode: js.UndefOr[Double] = js.undefined
  var errorMessage: js.UndefOr[Double] = js.undefined
  var isOrderedBy: Boolean
  var qCardinal: js.UndefOr[Double] = js.undefined
  var qFallbackTitle: String
  var qMax: js.UndefOr[Double] = js.undefined
  // field?: Field
  var qMin: js.UndefOr[Double] = js.undefined
  var qReverseSort: Boolean
  var qSortIndicator: A | B
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  def orderBy(): Unit
  def reverseOrder(): Unit
  def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): js.Promise[_]
}

object QHeader {
  @scala.inline
  def apply(
    col: Double,
    isOrderedBy: Boolean,
    orderBy: () => Unit,
    qFallbackTitle: String,
    qReverseSort: Boolean,
    qSortIndicator: A | B,
    reverseOrder: () => Unit,
    selectRange: (Double, Double, Boolean, Boolean) => js.Promise[_],
    errorCode: Int | Double = null,
    errorMessage: Int | Double = null,
    qCardinal: Int | Double = null,
    qMax: Int | Double = null,
    qMin: Int | Double = null,
    qStateCounts: StringDictionary[Double] = null
  ): QHeader = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isOrderedBy = isOrderedBy.asInstanceOf[js.Any], orderBy = js.Any.fromFunction0(orderBy), qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], reverseOrder = js.Any.fromFunction0(reverseOrder), selectRange = js.Any.fromFunction4(selectRange))
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (qCardinal != null) __obj.updateDynamic("qCardinal")(qCardinal.asInstanceOf[js.Any])
    if (qMax != null) __obj.updateDynamic("qMax")(qMax.asInstanceOf[js.Any])
    if (qMin != null) __obj.updateDynamic("qMin")(qMin.asInstanceOf[js.Any])
    if (qStateCounts != null) __obj.updateDynamic("qStateCounts")(qStateCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[QHeader]
  }
}

