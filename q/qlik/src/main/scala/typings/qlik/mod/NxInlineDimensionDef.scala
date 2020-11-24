package typings.qlik.mod

import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxInlineDimensionDef extends js.Object {
  
  var qActiveField: Double = js.native
  
  var qFieldDefs: js.Array[String] = js.native
  
  var qGrouping: N | H | C = js.native
  
  var qNumberPresentations: js.Array[FieldAttributes] = js.native
  
  var qReverseSort: Boolean = js.native
  
  var qSortCriteries: js.Array[SortCriteria] = js.native
}
object NxInlineDimensionDef {
  
  @scala.inline
  def apply(
    qActiveField: Double,
    qFieldDefs: js.Array[String],
    qGrouping: N | H | C,
    qNumberPresentations: js.Array[FieldAttributes],
    qReverseSort: Boolean,
    qSortCriteries: js.Array[SortCriteria]
  ): NxInlineDimensionDef = {
    val __obj = js.Dynamic.literal(qActiveField = qActiveField.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qNumberPresentations = qNumberPresentations.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortCriteries = qSortCriteries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInlineDimensionDef]
  }
  
  @scala.inline
  implicit class NxInlineDimensionDefOps[Self <: NxInlineDimensionDef] (val x: Self) extends AnyVal {
    
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
    def setQFieldDefsVarargs(value: String*): Self = this.set("qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQFieldDefs(value: js.Array[String]): Self = this.set("qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrouping(value: N | H | C): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentationsVarargs(value: FieldAttributes*): Self = this.set("qNumberPresentations", js.Array(value :_*))
    
    @scala.inline
    def setQNumberPresentations(value: js.Array[FieldAttributes]): Self = this.set("qNumberPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = this.set("qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortCriteriesVarargs(value: SortCriteria*): Self = this.set("qSortCriteries", js.Array(value :_*))
    
    @scala.inline
    def setQSortCriteries(value: js.Array[SortCriteria]): Self = this.set("qSortCriteries", value.asInstanceOf[js.Any])
  }
}
