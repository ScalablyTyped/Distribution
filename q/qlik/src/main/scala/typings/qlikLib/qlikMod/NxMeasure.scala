package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxMeasure extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineMeasureDef
  var qLibraryId: java.lang.String
  var qSortBy: SortCriteria
}

object NxMeasure {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineMeasureDef,
    qLibraryId: java.lang.String,
    qSortBy: SortCriteria
  ): NxMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions)
    __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions)
    __obj.updateDynamic("qCalcCond")(qCalcCond)
    __obj.updateDynamic("qDef")(qDef)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.updateDynamic("qSortBy")(qSortBy)
    __obj.asInstanceOf[NxMeasure]
  }
}

