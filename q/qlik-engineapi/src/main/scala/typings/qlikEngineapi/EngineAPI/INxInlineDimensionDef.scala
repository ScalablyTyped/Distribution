package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxInlineDimensionDef...
  */
@js.native
trait INxInlineDimensionDef extends StObject {
  
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
  implicit class INxInlineDimensionDefMutableBuilder[Self <: INxInlineDimensionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQActiveField(value: Double): Self = StObject.set(x, "qActiveField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQActiveFieldUndefined: Self = StObject.set(x, "qActiveField", js.undefined)
    
    @scala.inline
    def setQFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldDefsUndefined: Self = StObject.set(x, "qFieldDefs", js.undefined)
    
    @scala.inline
    def setQFieldDefsVarargs(value: String*): Self = StObject.set(x, "qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQFieldLabels(value: js.Array[String]): Self = StObject.set(x, "qFieldLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldLabelsUndefined: Self = StObject.set(x, "qFieldLabels", js.undefined)
    
    @scala.inline
    def setQFieldLabelsVarargs(value: String*): Self = StObject.set(x, "qFieldLabels", js.Array(value :_*))
    
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupingUndefined: Self = StObject.set(x, "qGrouping", js.undefined)
    
    @scala.inline
    def setQNumberPresentations(value: js.Array[IFieldAttributes]): Self = StObject.set(x, "qNumberPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentationsUndefined: Self = StObject.set(x, "qNumberPresentations", js.undefined)
    
    @scala.inline
    def setQNumberPresentationsVarargs(value: IFieldAttributes*): Self = StObject.set(x, "qNumberPresentations", js.Array(value :_*))
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReverseSortUndefined: Self = StObject.set(x, "qReverseSort", js.undefined)
    
    @scala.inline
    def setQSortCriterias(value: ISortCriteria): Self = StObject.set(x, "qSortCriterias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortCriteriasUndefined: Self = StObject.set(x, "qSortCriterias", js.undefined)
  }
}
