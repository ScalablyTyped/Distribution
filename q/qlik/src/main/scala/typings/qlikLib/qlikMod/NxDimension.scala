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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions)
    __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions)
    __obj.updateDynamic("qCalcCond")(qCalcCond)
    __obj.updateDynamic("qDef")(qDef)
    __obj.updateDynamic("qLibraryId")(qLibraryId)
    __obj.updateDynamic("qNullSuppression")(qNullSuppression)
    __obj.updateDynamic("qOtherLabel")(qOtherLabel)
    __obj.updateDynamic("qOtherTotalSpec")(qOtherTotalSpec)
    __obj.updateDynamic("qShowAll")(qShowAll)
    __obj.updateDynamic("qTotalLabel")(qTotalLabel)
    __obj.asInstanceOf[NxDimension]
  }
}

