package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldDescription...
  */
@js.native
trait IFieldDescription extends js.Object {
  
  /**
    * If set to true, it means that the field has one and only one selection (not 0 and not more than 1).
    * If this property is set to true, the field cannot be cleared anymore and no more selections can be
    * performed in that field.
    * >> The default value is false.
    */
  var qAlwaysOneSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of distinct field values.
    */
  var qCardinal: Double = js.native
  
  /**
    * Field comment.
    */
  var qComment: String = js.native
  
  /**
    * If set to true, only distinct field values are shown.
    * >> The default value is false.
    */
  var qDistinctOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Internal number of the field.
    */
  var qInternalNumber: Double = js.native
  
  /**
    * If set to true, it means that the field is a field on the fly.
    * >> The default value is false.
    */
  var qIsDefinitionOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is hidden.
    * >> The default value is false.
    */
  var qIsHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is locked.
    * >> The default value is false.
    */
  var qIsLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Is set to true if the value is a numeric.
    * >> The default value is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is a semantic.
    * >> The default value is false.
    */
  var qIsSemantic: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is a system field.
    * >> The default value is false.
    */
  var qIsSystem: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the field.
    */
  var qName: String = js.native
  
  /**
    * List of table names.
    */
  var qSrcTables: js.Array[String] = js.native
  
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String] = js.native
  
  /**
    * Total number of field values.
    */
  var qTotalCount: Double = js.native
}
object IFieldDescription {
  
  @scala.inline
  def apply(
    qCardinal: Double,
    qComment: String,
    qInternalNumber: Double,
    qName: String,
    qSrcTables: js.Array[String],
    qTags: js.Array[String],
    qTotalCount: Double
  ): IFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qInternalNumber = qInternalNumber.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSrcTables = qSrcTables.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTotalCount = qTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescription]
  }
  
  @scala.inline
  implicit class IFieldDescriptionOps[Self <: IFieldDescription] (val x: Self) extends AnyVal {
    
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
    def setQCardinal(value: Double): Self = this.set("qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQComment(value: String): Self = this.set("qComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInternalNumber(value: Double): Self = this.set("qInternalNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSrcTablesVarargs(value: String*): Self = this.set("qSrcTables", js.Array(value :_*))
    
    @scala.inline
    def setQSrcTables(value: js.Array[String]): Self = this.set("qSrcTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTotalCount(value: Double): Self = this.set("qTotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAlwaysOneSelected(value: Boolean): Self = this.set("qAlwaysOneSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQAlwaysOneSelected: Self = this.set("qAlwaysOneSelected", js.undefined)
    
    @scala.inline
    def setQAndMode(value: Boolean): Self = this.set("qAndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQAndMode: Self = this.set("qAndMode", js.undefined)
    
    @scala.inline
    def setQDistinctOnly(value: Boolean): Self = this.set("qDistinctOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQDistinctOnly: Self = this.set("qDistinctOnly", js.undefined)
    
    @scala.inline
    def setQIsDefinitionOnly(value: Boolean): Self = this.set("qIsDefinitionOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsDefinitionOnly: Self = this.set("qIsDefinitionOnly", js.undefined)
    
    @scala.inline
    def setQIsHidden(value: Boolean): Self = this.set("qIsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsHidden: Self = this.set("qIsHidden", js.undefined)
    
    @scala.inline
    def setQIsLocked(value: Boolean): Self = this.set("qIsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsLocked: Self = this.set("qIsLocked", js.undefined)
    
    @scala.inline
    def setQIsNumeric(value: Boolean): Self = this.set("qIsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsNumeric: Self = this.set("qIsNumeric", js.undefined)
    
    @scala.inline
    def setQIsSemantic(value: Boolean): Self = this.set("qIsSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsSemantic: Self = this.set("qIsSemantic", js.undefined)
    
    @scala.inline
    def setQIsSystem(value: Boolean): Self = this.set("qIsSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsSystem: Self = this.set("qIsSystem", js.undefined)
  }
}
