package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDimension
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the dimension is set in the hypercube and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
@js.native
trait INxDimension extends js.Object {
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.native
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.native
  /**
    * Specifies a calculation condition, which must be fulfilled for the dimension to be calculated.
    * If the calculation condition is not met, the dimension is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.native
  /**
    * Refers to a dimension stored in the hypercube.
    */
  var qDef: INxInlineDimensionDef = js.native
  /**
    * no / empty docu
    */
  var qIncludeElemValue: js.UndefOr[Boolean] = js.native
  /**
    * Refers to a dimension stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.native
  /**
    * If set to true, no null values are returned.
    */
  var qNullSuppression: js.UndefOr[Boolean] = js.native
  /**
    * This property is used when some dimension limits are set.
    * Label of the Others group. The default label is Others.
    * Example:
    * "qOtherLabel":"=<label>"
    *               or
    * "qOtherLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Others group.
    */
  var qOtherLabel: js.UndefOr[IStringExpressionContainer] = js.native
  /**
    * Sets the dimension limits. Each dimension of a hypercube is configured separately.
    * Defines if some values (grouped as Others) should be grouped together in the visualization.
    * For example in a pie chart all values lower than 200 could be grouped together.
    */
  var qOtherTotalSpec: js.UndefOr[IOtherTotalSpecProp] = js.native
  /**
    * If set to true, all dimension values are shown.
    */
  var qShowAll: js.UndefOr[Boolean] = js.native
   // ?Nicht in Doku
  /**
    * no / empty docu
    */
  var qShowTotal: js.UndefOr[Boolean] = js.native
  /**
    * If this property is set, the total of the calculated values is returned.
    * The default label is Total.
    * Example:
    * "qTotalLabel":"=<label>"
    *               or
    * "qTotalLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Totalgroup.
    */
  var qTotalLabel: js.UndefOr[IStringExpressionContainer] = js.native
}

object INxDimension {
  @scala.inline
  def apply(qDef: INxInlineDimensionDef): INxDimension = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDimension]
  }
  @scala.inline
  implicit class INxDimensionOps[Self <: INxDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQDef(value: INxInlineDimensionDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQAttributeDimensionsVarargs(value: INxAttrDimDef*): Self = this.set("qAttributeDimensions", js.Array(value :_*))
    @scala.inline
    def setQAttributeDimensions(value: js.Array[INxAttrDimDef]): Self = this.set("qAttributeDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAttributeDimensions: Self = this.set("qAttributeDimensions", js.undefined)
    @scala.inline
    def setQAttributeExpressionsVarargs(value: INxAttrExprDef*): Self = this.set("qAttributeExpressions", js.Array(value :_*))
    @scala.inline
    def setQAttributeExpressions(value: js.Array[INxAttrExprDef]): Self = this.set("qAttributeExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAttributeExpressions: Self = this.set("qAttributeExpressions", js.undefined)
    @scala.inline
    def setQCalcCond(value: IValueExpr): Self = this.set("qCalcCond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQCalcCond: Self = this.set("qCalcCond", js.undefined)
    @scala.inline
    def setQIncludeElemValue(value: Boolean): Self = this.set("qIncludeElemValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQIncludeElemValue: Self = this.set("qIncludeElemValue", js.undefined)
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLibraryId: Self = this.set("qLibraryId", js.undefined)
    @scala.inline
    def setQNullSuppression(value: Boolean): Self = this.set("qNullSuppression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQNullSuppression: Self = this.set("qNullSuppression", js.undefined)
    @scala.inline
    def setQOtherLabel(value: IStringExpressionContainer): Self = this.set("qOtherLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQOtherLabel: Self = this.set("qOtherLabel", js.undefined)
    @scala.inline
    def setQOtherTotalSpec(value: IOtherTotalSpecProp): Self = this.set("qOtherTotalSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQOtherTotalSpec: Self = this.set("qOtherTotalSpec", js.undefined)
    @scala.inline
    def setQShowAll(value: Boolean): Self = this.set("qShowAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQShowAll: Self = this.set("qShowAll", js.undefined)
    @scala.inline
    def setQShowTotal(value: Boolean): Self = this.set("qShowTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQShowTotal: Self = this.set("qShowTotal", js.undefined)
    @scala.inline
    def setQTotalLabel(value: IStringExpressionContainer): Self = this.set("qTotalLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQTotalLabel: Self = this.set("qTotalLabel", js.undefined)
  }
  
}

