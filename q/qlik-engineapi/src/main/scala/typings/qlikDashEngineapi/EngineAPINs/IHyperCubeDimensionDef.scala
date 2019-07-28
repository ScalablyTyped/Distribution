package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHyperCubeDimensionDef extends INxDimension {
  @JSName("qDef")
  var qDef_IHyperCubeDimensionDef: IHyperCubeDimensionqDef
}

object IHyperCubeDimensionDef {
  @scala.inline
  def apply(
    qDef: IHyperCubeDimensionqDef,
    qAttributeDimensions: js.Array[INxAttrDimDef] = null,
    qAttributeExpressions: js.Array[INxAttrExprDef] = null,
    qCalcCond: IValueExpr = null,
    qIncludeElemValue: js.UndefOr[Boolean] = js.undefined,
    qLibraryId: String = null,
    qNullSuppression: js.UndefOr[Boolean] = js.undefined,
    qOtherLabel: IStringExpressionContainer = null,
    qOtherTotalSpec: IOtherTotalSpecProp = null,
    qShowAll: js.UndefOr[Boolean] = js.undefined,
    qShowTotal: js.UndefOr[Boolean] = js.undefined,
    qTotalLabel: IStringExpressionContainer = null
  ): IHyperCubeDimensionDef = {
    val __obj = js.Dynamic.literal(qDef = qDef)
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions)
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    if (!js.isUndefined(qIncludeElemValue)) __obj.updateDynamic("qIncludeElemValue")(qIncludeElemValue)
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId)
    if (!js.isUndefined(qNullSuppression)) __obj.updateDynamic("qNullSuppression")(qNullSuppression)
    if (qOtherLabel != null) __obj.updateDynamic("qOtherLabel")(qOtherLabel)
    if (qOtherTotalSpec != null) __obj.updateDynamic("qOtherTotalSpec")(qOtherTotalSpec)
    if (!js.isUndefined(qShowAll)) __obj.updateDynamic("qShowAll")(qShowAll)
    if (!js.isUndefined(qShowTotal)) __obj.updateDynamic("qShowTotal")(qShowTotal)
    if (qTotalLabel != null) __obj.updateDynamic("qTotalLabel")(qTotalLabel)
    __obj.asInstanceOf[IHyperCubeDimensionDef]
  }
}

