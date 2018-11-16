package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NxCurrentSelectionItem extends js.Object {
  var qField: java.lang.String
  var qIsNum: js.UndefOr[scala.Boolean] = js.undefined
  var qLocked: js.UndefOr[scala.Boolean] = js.undefined
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qOneAndOnlyOne: js.UndefOr[scala.Boolean] = js.undefined
  var qRangeInfo: js.Array[RangeSelectInfo]
  var qSelected: java.lang.String
  var qSelectedCount: scala.Double
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qSelectionThreshold: scala.Double
  var qSortIndex: scala.Double
  var qStateCounts: NxStateCounts
  var qTextSearch: js.UndefOr[java.lang.String] = js.undefined
  var qTotal: scala.Double
}

