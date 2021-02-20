package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMeasureInfo...
  */
@js.native
trait INxMeasureInfo extends StObject {
  
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: Double = js.native
  
  /**
    * List of attribute dimensions.
    */
  var qAttrDimInfo: js.Array[INxMeasureInfo] = js.native
  
  /**
    * List of attribute expressions.
    */
  var qAttrExprInfo: js.Array[INxAttrExprInfo] = js.native
  
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: Double = js.native
  
  /**
    * This parameter is optional. Gives information on the error.
    */
  var qError: js.UndefOr[INxValidationError] = js.native
  
  /**
    * Corresponds to the label of the measure. If the label is not defined then the measure name is used.
    * String
    */
  var qFallbackTitle: String = js.native
  
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown). The engine guesses the type of the field based on the field's expression.
    */
  var qIsAutoFormat: Boolean = js.native
  
  /**
    * Highest value in the range.
    */
  var qMax: Double = js.native
  
  /**
    * Lowest value in the range.
    */
  var qMin: Double = js.native
  
  /**
    * Format of the field. This parameter is optional.
    * One of: N for no sorting, A for sorting ascending, D for sorting descending
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.native
  
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: Boolean = js.native
  
  /**
    * Sort indicator. This parameter is optional. The default value is no sorting.
    */
  var qSortIndicator: js.UndefOr[SortIndicatorType] = js.native
}
object INxMeasureInfo {
  
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[INxMeasureInfo],
    qAttrExprInfo: js.Array[INxAttrExprInfo],
    qCardinal: Double,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qReverseSort: Boolean
  ): INxMeasureInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMeasureInfo]
  }
  
  @scala.inline
  implicit class INxMeasureInfoMutableBuilder[Self <: INxMeasureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQApprMaxGlyphCount(value: Double): Self = StObject.set(x, "qApprMaxGlyphCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimInfo(value: js.Array[INxMeasureInfo]): Self = StObject.set(x, "qAttrDimInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimInfoVarargs(value: INxMeasureInfo*): Self = StObject.set(x, "qAttrDimInfo", js.Array(value :_*))
    
    @scala.inline
    def setQAttrExprInfo(value: js.Array[INxAttrExprInfo]): Self = StObject.set(x, "qAttrExprInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExprInfoVarargs(value: INxAttrExprInfo*): Self = StObject.set(x, "qAttrExprInfo", js.Array(value :_*))
    
    @scala.inline
    def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorUndefined: Self = StObject.set(x, "qError", js.undefined)
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsAutoFormat(value: Boolean): Self = StObject.set(x, "qIsAutoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumFormat(value: IFieldAttributes): Self = StObject.set(x, "qNumFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumFormatUndefined: Self = StObject.set(x, "qNumFormat", js.undefined)
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicator(value: SortIndicatorType): Self = StObject.set(x, "qSortIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicatorUndefined: Self = StObject.set(x, "qSortIndicator", js.undefined)
  }
}
