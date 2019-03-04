package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimension extends js.Object {
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  var qCalcCond: ValueExpr
  var qDef: NxInlineDimensionDef
  var qLibraryId: java.lang.String
  var qNullSuppression: scala.Boolean
  var qOtherLabel: java.lang.String
  var qOtherTotalSpec: OtherTotalSpecProp
  var qShowAll: scala.Boolean
  var qTotalLabel: java.lang.String
}

object NxDimension {
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineDimensionDef,
    qLibraryId: java.lang.String,
    qNullSuppression: scala.Boolean,
    qOtherLabel: java.lang.String,
    qOtherTotalSpec: OtherTotalSpecProp,
    qShowAll: scala.Boolean,
    qTotalLabel: java.lang.String
  ): NxDimension = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions, qAttributeExpressions = qAttributeExpressions, qCalcCond = qCalcCond, qDef = qDef, qLibraryId = qLibraryId, qNullSuppression = qNullSuppression, qOtherLabel = qOtherLabel, qOtherTotalSpec = qOtherTotalSpec, qShowAll = qShowAll, qTotalLabel = qTotalLabel)
  
    __obj.asInstanceOf[NxDimension]
  }
}

