package typings.qlik.mod

import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxInlineDimensionDef extends StObject {
  
  var qActiveField: Double
  
  var qFieldDefs: js.Array[String]
  
  var qGrouping: N | H | C
  
  var qNumberPresentations: js.Array[FieldAttributes]
  
  var qReverseSort: Boolean
  
  var qSortCriteries: js.Array[SortCriteria]
}
object NxInlineDimensionDef {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: NxInlineDimensionDef] (val x: Self) extends AnyVal {
    
    inline def setQActiveField(value: Double): Self = StObject.set(x, "qActiveField", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefsVarargs(value: String*): Self = StObject.set(x, "qFieldDefs", js.Array(value*))
    
    inline def setQGrouping(value: N | H | C): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQNumberPresentations(value: js.Array[FieldAttributes]): Self = StObject.set(x, "qNumberPresentations", value.asInstanceOf[js.Any])
    
    inline def setQNumberPresentationsVarargs(value: FieldAttributes*): Self = StObject.set(x, "qNumberPresentations", js.Array(value*))
    
    inline def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    inline def setQSortCriteries(value: js.Array[SortCriteria]): Self = StObject.set(x, "qSortCriteries", value.asInstanceOf[js.Any])
    
    inline def setQSortCriteriesVarargs(value: SortCriteria*): Self = StObject.set(x, "qSortCriteries", js.Array(value*))
  }
}
