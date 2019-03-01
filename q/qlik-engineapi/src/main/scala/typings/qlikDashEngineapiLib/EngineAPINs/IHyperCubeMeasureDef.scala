package typings
package qlikDashEngineapiLib.EngineAPINs

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
    qLibraryId: java.lang.String = null,
    qSortBy: ISortCriteria = null
  ): IHyperCubeMeasureDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDef")(qDef)
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions)
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId)
    if (qSortBy != null) __obj.updateDynamic("qSortBy")(qSortBy)
    __obj.asInstanceOf[IHyperCubeMeasureDef]
  }
}

