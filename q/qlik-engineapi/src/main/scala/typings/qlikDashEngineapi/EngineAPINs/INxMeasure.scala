package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMeasure
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the measure is set in the hypercube and not in the library, this measure cannot be shared with other objects.
  * Note: A measure that is set in the library can be used by many objects.
  * Note: expressions are complementary expressions associated to a measure.
  *
  * For example, you can decide to change the background color of a visualization depending on the values of the measure.
  * Attribute expressions do not affect the layout of an object. The sorting order is unchanged.
  */
trait INxMeasure extends js.Object {
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.undefined
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.undefined
  /**
    * Specifies a calculation condition, which must be fulfilled for the measure to be calculated.
    * If the calculation condition is not met, the measure is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.undefined
  /**
    * Refers to a measure stored in the hypercube.
    */
  var qDef: INxInlineMeasureDef
  /**
    * Refers to a measure stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.undefined
  /**
    * Defines the sort criteria.
    * This property is optional. The default value is sort by ascending alphabetic order.
    */
  var qSortBy: js.UndefOr[ISortCriteria] = js.undefined
}

object INxMeasure {
  @scala.inline
  def apply(
    qDef: INxInlineMeasureDef,
    qAttributeDimensions: js.Array[INxAttrDimDef] = null,
    qAttributeExpressions: js.Array[INxAttrExprDef] = null,
    qCalcCond: IValueExpr = null,
    qLibraryId: String = null,
    qSortBy: ISortCriteria = null
  ): INxMeasure = {
    val __obj = js.Dynamic.literal(qDef = qDef)
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions)
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId)
    if (qSortBy != null) __obj.updateDynamic("qSortBy")(qSortBy)
    __obj.asInstanceOf[INxMeasure]
  }
}

