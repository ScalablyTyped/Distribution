package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnInfo extends StObject {
  
  var qApprMaxGlyphCount: Double = js.native
  
  var qAttrDimInfo: js.Array[NxAttrDimInfo] = js.native
  
  var qAttrExprInfo: js.Array[NxAttrExprInfo] = js.native
  
  var qCardinal: String = js.native
  
  var qError: NxValidationError = js.native
  
  var qFallbackTitle: String = js.native
  
  var qIsAutoFormat: Boolean = js.native
  
  var qMax: Double = js.native
  
  var qMin: Double = js.native
  
  var qNumFormat: FieldAttributes = js.native
  
  var qReverseSort: Boolean = js.native
  
  var qSortIndicator: N | A | D = js.native
}
object ColumnInfo {
  
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qError: NxValidationError,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  @scala.inline
  implicit class ColumnInfoMutableBuilder[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQApprMaxGlyphCount(value: Double): Self = StObject.set(x, "qApprMaxGlyphCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimInfo(value: js.Array[NxAttrDimInfo]): Self = StObject.set(x, "qAttrDimInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimInfoVarargs(value: NxAttrDimInfo*): Self = StObject.set(x, "qAttrDimInfo", js.Array(value :_*))
    
    @scala.inline
    def setQAttrExprInfo(value: js.Array[NxAttrExprInfo]): Self = StObject.set(x, "qAttrExprInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExprInfoVarargs(value: NxAttrExprInfo*): Self = StObject.set(x, "qAttrExprInfo", js.Array(value :_*))
    
    @scala.inline
    def setQCardinal(value: String): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: NxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsAutoFormat(value: Boolean): Self = StObject.set(x, "qIsAutoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumFormat(value: FieldAttributes): Self = StObject.set(x, "qNumFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicator(value: N | A | D): Self = StObject.set(x, "qSortIndicator", value.asInstanceOf[js.Any])
  }
}
