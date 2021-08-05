package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxMeasureInfo extends StObject {
  
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: Double
  
  /**
    * List of attribute dimensions.
    */
  var qAttrDimInfo: js.Array[INxMeasureInfo]
  
  /**
    * List of attribute expressions.
    */
  var qAttrExprInfo: js.Array[INxAttrExprInfo]
  
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: Double
  
  /**
    * This parameter is optional. Gives information on the error.
    */
  var qError: INxValidationError
  
  /**
    * Corresponds to the label of the measure. If the label is not defined then the measure name is used.
    * String
    */
  var qFallbackTitle: String
  
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown).
    * The engine guesses the type of the field based on the field's expression.
    */
  var qIsAutoFormat: Boolean
  
  /**
    * Highest value in the range.
    */
  var qMax: Double
  
  /**
    * Lowest value in the range.
    */
  var qMin: Double
  
  /**
    * Format of the field. This parameter is optional.
    * One of: N for no sorting, A for sorting ascending, D for sorting descending
    */
  var qNumFormat: IFieldAttributes
  
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: Boolean
  
  /**
    * Sort indicator. This parameter is optional. The default value is no sorting.
    */
  var qSortIndicator: SortIndicatorType
}
object INxMeasureInfo {
  
  inline def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[INxMeasureInfo],
    qAttrExprInfo: js.Array[INxAttrExprInfo],
    qCardinal: Double,
    qError: INxValidationError,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: IFieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: SortIndicatorType
  ): INxMeasureInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMeasureInfo]
  }
  
  extension [Self <: INxMeasureInfo](x: Self) {
    
    inline def setQApprMaxGlyphCount(value: Double): Self = StObject.set(x, "qApprMaxGlyphCount", value.asInstanceOf[js.Any])
    
    inline def setQAttrDimInfo(value: js.Array[INxMeasureInfo]): Self = StObject.set(x, "qAttrDimInfo", value.asInstanceOf[js.Any])
    
    inline def setQAttrDimInfoVarargs(value: INxMeasureInfo*): Self = StObject.set(x, "qAttrDimInfo", js.Array(value :_*))
    
    inline def setQAttrExprInfo(value: js.Array[INxAttrExprInfo]): Self = StObject.set(x, "qAttrExprInfo", value.asInstanceOf[js.Any])
    
    inline def setQAttrExprInfoVarargs(value: INxAttrExprInfo*): Self = StObject.set(x, "qAttrExprInfo", js.Array(value :_*))
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    inline def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    inline def setQIsAutoFormat(value: Boolean): Self = StObject.set(x, "qIsAutoFormat", value.asInstanceOf[js.Any])
    
    inline def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    inline def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    inline def setQNumFormat(value: IFieldAttributes): Self = StObject.set(x, "qNumFormat", value.asInstanceOf[js.Any])
    
    inline def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    inline def setQSortIndicator(value: SortIndicatorType): Self = StObject.set(x, "qSortIndicator", value.asInstanceOf[js.Any])
  }
}
