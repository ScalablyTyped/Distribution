package typings.qlikDashEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions.asInstanceOf[js.Any])
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions.asInstanceOf[js.Any])
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond.asInstanceOf[js.Any])
    if (!js.isUndefined(qIncludeElemValue)) __obj.updateDynamic("qIncludeElemValue")(qIncludeElemValue.asInstanceOf[js.Any])
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId.asInstanceOf[js.Any])
    if (!js.isUndefined(qNullSuppression)) __obj.updateDynamic("qNullSuppression")(qNullSuppression.asInstanceOf[js.Any])
    if (qOtherLabel != null) __obj.updateDynamic("qOtherLabel")(qOtherLabel.asInstanceOf[js.Any])
    if (qOtherTotalSpec != null) __obj.updateDynamic("qOtherTotalSpec")(qOtherTotalSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowAll)) __obj.updateDynamic("qShowAll")(qShowAll.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowTotal)) __obj.updateDynamic("qShowTotal")(qShowTotal.asInstanceOf[js.Any])
    if (qTotalLabel != null) __obj.updateDynamic("qTotalLabel")(qTotalLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDimensionDef]
  }
}

