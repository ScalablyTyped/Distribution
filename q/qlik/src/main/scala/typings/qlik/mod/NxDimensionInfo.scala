package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxDimensionInfo extends ColumnInfo {
  
  var qContinuousAxes: Boolean = js.native
  
  var qDerivedField: Boolean = js.native
  
  var qDimensionType: D | N | T = js.native
  
  var qGroupFallbackTitles: js.Array[String] = js.native
  
  var qGroupFieldDefs: js.Array[String] = js.native
  
  var qGroupPos: Double = js.native
  
  var qGrouping: N | H | C = js.native
  
  var qIsCyclic: Boolean = js.native
  
  var qIsSemantic: Boolean = js.native
  
  var qLocker: String = js.native
  
  var qStateCounts: NxStateCounts = js.native
  
  var qTags: js.Array[String] = js.native
}
object NxDimensionInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NxDimensionInfoOps[Self <: NxDimensionInfo] (val x: Self) extends AnyVal {
    
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
    def setQContinuousAxes(value: Boolean): Self = this.set("qContinuousAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDerivedField(value: Boolean): Self = this.set("qDerivedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionType(value: D | N | T): Self = this.set("qDimensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupFallbackTitlesVarargs(value: String*): Self = this.set("qGroupFallbackTitles", js.Array(value :_*))
    
    @scala.inline
    def setQGroupFallbackTitles(value: js.Array[String]): Self = this.set("qGroupFallbackTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupFieldDefsVarargs(value: String*): Self = this.set("qGroupFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQGroupFieldDefs(value: js.Array[String]): Self = this.set("qGroupFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupPos(value: Double): Self = this.set("qGroupPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrouping(value: N | H | C): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsCyclic(value: Boolean): Self = this.set("qIsCyclic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsSemantic(value: Boolean): Self = this.set("qIsSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocker(value: String): Self = this.set("qLocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: NxStateCounts): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
