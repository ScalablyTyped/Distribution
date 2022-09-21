package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxMeasure extends StObject {
  
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  
  var qCalcCond: ValueExpr
  
  var qDef: NxInlineMeasureDef
  
  var qLibraryId: String
  
  var qSortBy: SortCriteria
}
object NxMeasure {
  
  inline def apply(
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
  
  extension [Self <: NxMeasure](x: Self) {
    
    inline def setQAttributeDimensions(value: js.Array[NxAttrDimDef]): Self = StObject.set(x, "qAttributeDimensions", value.asInstanceOf[js.Any])
    
    inline def setQAttributeDimensionsVarargs(value: NxAttrDimDef*): Self = StObject.set(x, "qAttributeDimensions", js.Array(value*))
    
    inline def setQAttributeExpressions(value: js.Array[NxAttrExprDef]): Self = StObject.set(x, "qAttributeExpressions", value.asInstanceOf[js.Any])
    
    inline def setQAttributeExpressionsVarargs(value: NxAttrExprDef*): Self = StObject.set(x, "qAttributeExpressions", js.Array(value*))
    
    inline def setQCalcCond(value: ValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    inline def setQDef(value: NxInlineMeasureDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    inline def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    inline def setQSortBy(value: SortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
  }
}
