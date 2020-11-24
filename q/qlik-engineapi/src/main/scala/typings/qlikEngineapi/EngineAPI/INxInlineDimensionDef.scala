package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxInlineDimensionDef...
  */
@js.native
trait INxInlineDimensionDef extends js.Object {
  
  /**
    * Index of the active field in a cyclic dimension.
    * This parameter is optional. The default value is 0.
    * This parameter is used in case of cyclic dimensions (qGrouping is C).
    */
  var qActiveField: js.UndefOr[Double] = js.native
  
  /**
    * Array of field names.
    * When creating a grouped dimension, more than one field name is defined.
    * >> This parameter is optional.
    */
  var qFieldDefs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Array of field labels.
    * >> This parameter is optional.
    */
  var qFieldLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentations: js.UndefOr[js.Array[IFieldAttributes]] = js.native
  
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the sorting criteria in the field.
    * >>This parameter is optional.
    * Default is to sort by alphabetical order, ascending.
    */
  var qSortCriterias: js.UndefOr[ISortCriteria] = js.native
}
object INxInlineDimensionDef {
  
  @scala.inline
  def apply(): INxInlineDimensionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxInlineDimensionDef]
  }
  
  @scala.inline
  implicit class INxInlineDimensionDefOps[Self <: INxInlineDimensionDef] (val x: Self) extends AnyVal {
    
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
    def setQActiveField(value: Double): Self = this.set("qActiveField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQActiveField: Self = this.set("qActiveField", js.undefined)
    
    @scala.inline
    def setQFieldDefsVarargs(value: String*): Self = this.set("qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQFieldDefs(value: js.Array[String]): Self = this.set("qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQFieldDefs: Self = this.set("qFieldDefs", js.undefined)
    
    @scala.inline
    def setQFieldLabelsVarargs(value: String*): Self = this.set("qFieldLabels", js.Array(value :_*))
    
    @scala.inline
    def setQFieldLabels(value: js.Array[String]): Self = this.set("qFieldLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQFieldLabels: Self = this.set("qFieldLabels", js.undefined)
    
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQGrouping: Self = this.set("qGrouping", js.undefined)
    
    @scala.inline
    def setQNumberPresentationsVarargs(value: IFieldAttributes*): Self = this.set("qNumberPresentations", js.Array(value :_*))
    
    @scala.inline
    def setQNumberPresentations(value: js.Array[IFieldAttributes]): Self = this.set("qNumberPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQNumberPresentations: Self = this.set("qNumberPresentations", js.undefined)
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = this.set("qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQReverseSort: Self = this.set("qReverseSort", js.undefined)
    
    @scala.inline
    def setQSortCriterias(value: ISortCriteria): Self = this.set("qSortCriterias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQSortCriterias: Self = this.set("qSortCriterias", js.undefined)
  }
}
