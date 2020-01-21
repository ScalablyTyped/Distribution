package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeMeasureDef width extend NxMeasure
  */
trait IHyperCubeMeasureDef extends INxMeasure {
  @JSName("qDef")
  var qDef_IHyperCubeMeasureDef: IHyperCubeMeasureqDef
}

object IHyperCubeMeasureDef {
  @scala.inline
  def apply(
    qDef: IHyperCubeMeasureqDef,
    qAttributeDimensions: js.Array[INxAttrDimDef] = null,
    qAttributeExpressions: js.Array[INxAttrExprDef] = null,
    qCalcCond: IValueExpr = null,
    qLibraryId: String = null,
    qSortBy: ISortCriteria = null
  ): IHyperCubeMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions.asInstanceOf[js.Any])
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions.asInstanceOf[js.Any])
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond.asInstanceOf[js.Any])
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId.asInstanceOf[js.Any])
    if (qSortBy != null) __obj.updateDynamic("qSortBy")(qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureDef]
  }
}

