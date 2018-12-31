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

