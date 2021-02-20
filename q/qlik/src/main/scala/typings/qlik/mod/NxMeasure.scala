package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxMeasure extends StObject {
  
  var qAttributeDimensions: js.Array[NxAttrDimDef] = js.native
  
  var qAttributeExpressions: js.Array[NxAttrExprDef] = js.native
  
  var qCalcCond: ValueExpr = js.native
  
  var qDef: NxInlineMeasureDef = js.native
  
  var qLibraryId: String = js.native
  
  var qSortBy: SortCriteria = js.native
}
object NxMeasure {
  
  @scala.inline
  def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineMeasureDef,
    qLibraryId: String,
    qSortBy: SortCriteria
  ): NxMeasure = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxMeasure]
  }
  
  @scala.inline
  implicit class NxMeasureMutableBuilder[Self <: NxMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttributeDimensions(value: js.Array[NxAttrDimDef]): Self = StObject.set(x, "qAttributeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeDimensionsVarargs(value: NxAttrDimDef*): Self = StObject.set(x, "qAttributeDimensions", js.Array(value :_*))
    
    @scala.inline
    def setQAttributeExpressions(value: js.Array[NxAttrExprDef]): Self = StObject.set(x, "qAttributeExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeExpressionsVarargs(value: NxAttrExprDef*): Self = StObject.set(x, "qAttributeExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQCalcCond(value: ValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: NxInlineMeasureDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortBy(value: SortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
  }
}
