package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDimension
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the dimension is set in the hypercube and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
@js.native
trait INxDimension extends StObject {
  
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
  implicit class INxDimensionMutableBuilder[Self <: INxDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttributeDimensions(value: js.Array[INxAttrDimDef]): Self = StObject.set(x, "qAttributeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeDimensionsUndefined: Self = StObject.set(x, "qAttributeDimensions", js.undefined)
    
    @scala.inline
    def setQAttributeDimensionsVarargs(value: INxAttrDimDef*): Self = StObject.set(x, "qAttributeDimensions", js.Array(value :_*))
    
    @scala.inline
    def setQAttributeExpressions(value: js.Array[INxAttrExprDef]): Self = StObject.set(x, "qAttributeExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeExpressionsUndefined: Self = StObject.set(x, "qAttributeExpressions", js.undefined)
    
    @scala.inline
    def setQAttributeExpressionsVarargs(value: INxAttrExprDef*): Self = StObject.set(x, "qAttributeExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQCalcCond(value: IValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalcCondUndefined: Self = StObject.set(x, "qCalcCond", js.undefined)
    
    @scala.inline
    def setQDef(value: INxInlineDimensionDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIncludeElemValue(value: Boolean): Self = StObject.set(x, "qIncludeElemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIncludeElemValueUndefined: Self = StObject.set(x, "qIncludeElemValue", js.undefined)
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryIdUndefined: Self = StObject.set(x, "qLibraryId", js.undefined)
    
    @scala.inline
    def setQNullSuppression(value: Boolean): Self = StObject.set(x, "qNullSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNullSuppressionUndefined: Self = StObject.set(x, "qNullSuppression", js.undefined)
    
    @scala.inline
    def setQOtherLabel(value: IStringExpressionContainer): Self = StObject.set(x, "qOtherLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherLabelUndefined: Self = StObject.set(x, "qOtherLabel", js.undefined)
    
    @scala.inline
    def setQOtherTotalSpec(value: IOtherTotalSpecProp): Self = StObject.set(x, "qOtherTotalSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherTotalSpecUndefined: Self = StObject.set(x, "qOtherTotalSpec", js.undefined)
    
    @scala.inline
    def setQShowAll(value: Boolean): Self = StObject.set(x, "qShowAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowAllUndefined: Self = StObject.set(x, "qShowAll", js.undefined)
    
    @scala.inline
    def setQShowTotal(value: Boolean): Self = StObject.set(x, "qShowTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowTotalUndefined: Self = StObject.set(x, "qShowTotal", js.undefined)
    
    @scala.inline
    def setQTotalLabel(value: IStringExpressionContainer): Self = StObject.set(x, "qTotalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTotalLabelUndefined: Self = StObject.set(x, "qTotalLabel", js.undefined)
  }
}
