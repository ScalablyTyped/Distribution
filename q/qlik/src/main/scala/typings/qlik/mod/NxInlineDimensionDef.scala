package typings.qlik.mod

import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxInlineDimensionDef extends StObject {
  
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
  implicit class NxInlineDimensionDefMutableBuilder[Self <: NxInlineDimensionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQActiveField(value: Double): Self = StObject.set(x, "qActiveField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldDefsVarargs(value: String*): Self = StObject.set(x, "qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQGrouping(value: N | H | C): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentations(value: js.Array[FieldAttributes]): Self = StObject.set(x, "qNumberPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentationsVarargs(value: FieldAttributes*): Self = StObject.set(x, "qNumberPresentations", js.Array(value :_*))
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortCriteries(value: js.Array[SortCriteria]): Self = StObject.set(x, "qSortCriteries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortCriteriesVarargs(value: SortCriteria*): Self = StObject.set(x, "qSortCriteries", js.Array(value :_*))
  }
}
