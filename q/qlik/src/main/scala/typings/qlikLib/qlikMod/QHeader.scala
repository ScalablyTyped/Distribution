package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QHeader extends js.Object {
  var col: scala.Double
  var errorCode: js.UndefOr[scala.Double] = js.undefined
  var errorMessage: js.UndefOr[scala.Double] = js.undefined
  var isOrderedBy: scala.Boolean
  var qCardinal: js.UndefOr[scala.Double] = js.undefined
  var qFallbackTitle: java.lang.String
  var qMax: js.UndefOr[scala.Double] = js.undefined
  // field?: Field
  var qMin: js.UndefOr[scala.Double] = js.undefined
  var qReverseSort: scala.Boolean
  var qSortIndicator: qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.B
  var qStateCounts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  def orderBy(): scala.Unit
  def reverseOrder(): scala.Unit
  def selectRange(min: scala.Double, max: scala.Double, inclMin: scala.Boolean, inclMax: scala.Boolean): js.Promise[_]
}

object QHeader {
  @scala.inline
  def apply(
    col: scala.Double,
    isOrderedBy: scala.Boolean,
    orderBy: js.Function0[scala.Unit],
    qFallbackTitle: java.lang.String,
    qReverseSort: scala.Boolean,
    qSortIndicator: qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.B,
    reverseOrder: js.Function0[scala.Unit],
    selectRange: js.Function4[scala.Double, scala.Double, scala.Boolean, scala.Boolean, js.Promise[_]],
    errorCode: scala.Int | scala.Double = null,
    errorMessage: scala.Int | scala.Double = null,
    qCardinal: scala.Int | scala.Double = null,
    qMax: scala.Int | scala.Double = null,
    qMin: scala.Int | scala.Double = null,
    qStateCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): QHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("isOrderedBy")(isOrderedBy)
    __obj.updateDynamic("orderBy")(orderBy)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qReverseSort")(qReverseSort)
    __obj.updateDynamic("qSortIndicator")(qSortIndicator.asInstanceOf[js.Any])
    __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.updateDynamic("selectRange")(selectRange)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (qCardinal != null) __obj.updateDynamic("qCardinal")(qCardinal.asInstanceOf[js.Any])
    if (qMax != null) __obj.updateDynamic("qMax")(qMax.asInstanceOf[js.Any])
    if (qMin != null) __obj.updateDynamic("qMin")(qMin.asInstanceOf[js.Any])
    if (qStateCounts != null) __obj.updateDynamic("qStateCounts")(qStateCounts)
    __obj.asInstanceOf[QHeader]
  }
}

