package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxDimensionInfo extends js.Object {
  
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: Double = js.native
  
  /**
    * Array of attribute dimensions.
    * Array of NxAttrDimInfo
    */
  var qAttrDimInfo: INxAttrDimInfo = js.native
  
  /**
    * Array of attribute expressions.
    * Array of NxAttrExprInfo
    */
  var qAttrExprInfo: INxAttrExprInfo = js.native
  
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: Double = js.native
  
  /**
    * Is continuous axis used.
    * Boolean
    */
  var qContinuousAxes: Boolean = js.native
  
  /**
    * Is derived field is used as a dimension.
    * Boolean
    */
  var qDerivedField: Boolean = js.native
  
  /**
    * Binary format of the field.
    * One of:
    *       # D for discrete (String)
    *       # N for numeric (Double)
    *       # T for Time (Timestamp)
    */
  var qDimensionType: DimensionType = js.native
  
  /**
    * This parameter is optional.
    * Gives information on the error.
    * Null or NxValidationError
    */
  var qError: INxValidationError = js.native
  
  /**
    * Corresponds to the label of the dimension that is selected.
    * If the label is not defined then the field name is used.
    * String
    */
  var qFallbackTitle: String = js.native
  
  /**
    * Array of dimension labels.
    * Contains the labels of all dimensions in a hierarchy group
    * (for example the labels of all dimensions in a drill down group).
    * Array of String
    */
  var qGroupFallbackTitles: js.Array[String] = js.native
  
  /**
    * Array of field names.
    * Array of String
    */
  var qGroupFieldDefs: js.Array[String] = js.native
  
  /**
    * Index of the dimension that is currently in use.
    * qGroupPos is set to 0 if there are no hierarchical groups (drill-down groups) or cycle groups.
    * Integer
    */
  var qGroupPos: Double = js.native
  
  /**
    * Defines the grouping.
    * One of:
    *       # N for no grouping
    *       # H for drill-down
    *       # C for cyclic
    */
  var qGrouping: GroupingType = js.native
  
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown).
    * The engine guesses the type of the field based on the field's definition.
    * Boolean
    */
  var qIsAutoFormat: Boolean = js.native
  
  /**
    * Is a cyclic dimension used.
    * Boolean
    */
  var qIsCyclic: Boolean = js.native
  
  /**
    * If set to true, it means that the field is a semantic.
    * Boolean
    */
  var qIsSemantic: Boolean = js.native
  
  /**
    * Is set to true if the field is locked.
    * Boolean
    */
  var qLocked: Boolean = js.native
  
  /**
    * Maximum value.
    * Double
    */
  var qMax: Double = js.native
  
  /**
    * Minimum value.
    * Double
    */
  var qMin: Double = js.native
  
  /**
    * Format of the field.
    * This parameter is optional.
    * FieldAttributes
    */
  var qNumFormat: FieldAttributesType = js.native
  
  /**
    * If set to true, it inverts the sort criteria in the field.
    * Boolean
    */
  var qReverseSort: Boolean = js.native
  
  /**
    * Sort indicator.
    * This parameter is optional.
    * The default value is no sorting.
    * One of:
    *       # N for no sorting
    *       # A for sorting ascending
    *       # D for sorting descending
    */
  var qSortIndicator: SortIndicatorType = js.native
  
  /**
    * Number of values in a particular state.
    * NxStateCounts
    */
  var qStateCounts: INxStateCounts = js.native
  
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    * Array of String
    */
  var qTags: js.Array[String] = js.native
}
object INxDimensionInfo {
  
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: INxAttrDimInfo,
    qAttrExprInfo: INxAttrExprInfo,
    qCardinal: Double,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: DimensionType,
    qError: INxValidationError,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: GroupingType,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocked: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributesType,
    qReverseSort: Boolean,
    qSortIndicator: SortIndicatorType,
    qStateCounts: INxStateCounts,
    qTags: js.Array[String]
  ): INxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDimensionInfo]
  }
  
  @scala.inline
  implicit class INxDimensionInfoOps[Self <: INxDimensionInfo] (val x: Self) extends AnyVal {
    
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
    def setQApprMaxGlyphCount(value: Double): Self = this.set("qApprMaxGlyphCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimInfo(value: INxAttrDimInfo): Self = this.set("qAttrDimInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExprInfo(value: INxAttrExprInfo): Self = this.set("qAttrExprInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCardinal(value: Double): Self = this.set("qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQContinuousAxes(value: Boolean): Self = this.set("qContinuousAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDerivedField(value: Boolean): Self = this.set("qDerivedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionType(value: DimensionType): Self = this.set("qDimensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = this.set("qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = this.set("qFallbackTitle", value.asInstanceOf[js.Any])
    
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
    def setQGrouping(value: GroupingType): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsAutoFormat(value: Boolean): Self = this.set("qIsAutoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsCyclic(value: Boolean): Self = this.set("qIsCyclic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsSemantic(value: Boolean): Self = this.set("qIsSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocked(value: Boolean): Self = this.set("qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMax(value: Double): Self = this.set("qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = this.set("qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumFormat(value: FieldAttributesType): Self = this.set("qNumFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = this.set("qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicator(value: SortIndicatorType): Self = this.set("qSortIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: INxStateCounts): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
