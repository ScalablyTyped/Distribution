package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxDimensionInfo
  extends StObject
     with ColumnInfo {
  
  var qContinuousAxes: Boolean
  
  var qDerivedField: Boolean
  
  var qDimensionType: D | N | T
  
  var qGroupFallbackTitles: js.Array[String]
  
  var qGroupFieldDefs: js.Array[String]
  
  var qGroupPos: Double
  
  var qGrouping: N | H | C
  
  var qIsCyclic: Boolean
  
  var qIsSemantic: Boolean
  
  var qLocker: String
  
  var qStateCounts: NxStateCounts
  
  var qTags: js.Array[String]
}
object NxDimensionInfo {
  
  inline def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: D | N | T,
    qError: NxValidationError,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: N | H | C,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocker: String,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D,
    qStateCounts: NxStateCounts,
    qTags: js.Array[String]
  ): NxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocker = qLocker.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDimensionInfo]
  }
  
  extension [Self <: NxDimensionInfo](x: Self) {
    
    inline def setQContinuousAxes(value: Boolean): Self = StObject.set(x, "qContinuousAxes", value.asInstanceOf[js.Any])
    
    inline def setQDerivedField(value: Boolean): Self = StObject.set(x, "qDerivedField", value.asInstanceOf[js.Any])
    
    inline def setQDimensionType(value: D | N | T): Self = StObject.set(x, "qDimensionType", value.asInstanceOf[js.Any])
    
    inline def setQGroupFallbackTitles(value: js.Array[String]): Self = StObject.set(x, "qGroupFallbackTitles", value.asInstanceOf[js.Any])
    
    inline def setQGroupFallbackTitlesVarargs(value: String*): Self = StObject.set(x, "qGroupFallbackTitles", js.Array(value :_*))
    
    inline def setQGroupFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qGroupFieldDefs", value.asInstanceOf[js.Any])
    
    inline def setQGroupFieldDefsVarargs(value: String*): Self = StObject.set(x, "qGroupFieldDefs", js.Array(value :_*))
    
    inline def setQGroupPos(value: Double): Self = StObject.set(x, "qGroupPos", value.asInstanceOf[js.Any])
    
    inline def setQGrouping(value: N | H | C): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQIsCyclic(value: Boolean): Self = StObject.set(x, "qIsCyclic", value.asInstanceOf[js.Any])
    
    inline def setQIsSemantic(value: Boolean): Self = StObject.set(x, "qIsSemantic", value.asInstanceOf[js.Any])
    
    inline def setQLocker(value: String): Self = StObject.set(x, "qLocker", value.asInstanceOf[js.Any])
    
    inline def setQStateCounts(value: NxStateCounts): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
  }
}
