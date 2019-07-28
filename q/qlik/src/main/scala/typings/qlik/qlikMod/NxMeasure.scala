package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxMeasure extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineMeasureDef
  var qLibraryId: String
  var qSortBy: SortCriteria
}

object NxMeasure {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineMeasureDef,
    qLibraryId: String,
    qSortBy: SortCriteria
  ): NxMeasure = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions, qAttributeExpressions = qAttributeExpressions, qCalcCond = qCalcCond, qDef = qDef, qLibraryId = qLibraryId, qSortBy = qSortBy)
  
    __obj.asInstanceOf[NxMeasure]
  }
}

