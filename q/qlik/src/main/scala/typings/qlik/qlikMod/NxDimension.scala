package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimension extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineDimensionDef
  var qLibraryId: String
  var qNullSuppression: Boolean
  var qOtherLabel: String
  var qOtherTotalSpec: OtherTotalSpecProp
  var qShowAll: Boolean
  var qTotalLabel: String
}

object NxDimension {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineDimensionDef,
    qLibraryId: String,
    qNullSuppression: Boolean,
    qOtherLabel: String,
    qOtherTotalSpec: OtherTotalSpecProp,
    qShowAll: Boolean,
    qTotalLabel: String
  ): NxDimension = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions, qAttributeExpressions = qAttributeExpressions, qCalcCond = qCalcCond, qDef = qDef, qLibraryId = qLibraryId, qNullSuppression = qNullSuppression, qOtherLabel = qOtherLabel, qOtherTotalSpec = qOtherTotalSpec, qShowAll = qShowAll, qTotalLabel = qTotalLabel)
  
    __obj.asInstanceOf[NxDimension]
  }
}

