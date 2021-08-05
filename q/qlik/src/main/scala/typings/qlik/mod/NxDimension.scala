package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxDimension extends StObject {
  
  var qAttributeDimensions: js.Array[NxAttrDimDef]
  
  var qAttributeExpressions: js.Array[NxAttrExprDef]
  
  var qCalcCond: ValueExpr
  
  var qDef: NxInlineDimensionDef
  
  var qLibraryId: String
  
  var qNullSuppression: Boolean
  
  var qOtherLabel: String
  
  var qOtherTotalSpec: OtherTotalSpecProp
  
  var qShowAll: Boolean
  
  var qTotalLabel: String
}
object NxDimension {
  
  inline def apply(
    qAttributeDimensions: js.Array[NxAttrDimDef],
    qAttributeExpressions: js.Array[NxAttrExprDef],
    qCalcCond: ValueExpr,
    qDef: NxInlineDimensionDef,
    qLibraryId: String,
    qNullSuppression: Boolean,
    qOtherLabel: String,
    qOtherTotalSpec: OtherTotalSpecProp,
    qShowAll: Boolean,
    qTotalLabel: String
  ): NxDimension = {
    val __obj = js.Dynamic.literal(qAttributeDimensions = qAttributeDimensions.asInstanceOf[js.Any], qAttributeExpressions = qAttributeExpressions.asInstanceOf[js.Any], qCalcCond = qCalcCond.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qNullSuppression = qNullSuppression.asInstanceOf[js.Any], qOtherLabel = qOtherLabel.asInstanceOf[js.Any], qOtherTotalSpec = qOtherTotalSpec.asInstanceOf[js.Any], qShowAll = qShowAll.asInstanceOf[js.Any], qTotalLabel = qTotalLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDimension]
  }
  
  extension [Self <: NxDimension](x: Self) {
    
    inline def setQAttributeDimensions(value: js.Array[NxAttrDimDef]): Self = StObject.set(x, "qAttributeDimensions", value.asInstanceOf[js.Any])
    
    inline def setQAttributeDimensionsVarargs(value: NxAttrDimDef*): Self = StObject.set(x, "qAttributeDimensions", js.Array(value :_*))
    
    inline def setQAttributeExpressions(value: js.Array[NxAttrExprDef]): Self = StObject.set(x, "qAttributeExpressions", value.asInstanceOf[js.Any])
    
    inline def setQAttributeExpressionsVarargs(value: NxAttrExprDef*): Self = StObject.set(x, "qAttributeExpressions", js.Array(value :_*))
    
    inline def setQCalcCond(value: ValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    inline def setQDef(value: NxInlineDimensionDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    inline def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    inline def setQNullSuppression(value: Boolean): Self = StObject.set(x, "qNullSuppression", value.asInstanceOf[js.Any])
    
    inline def setQOtherLabel(value: String): Self = StObject.set(x, "qOtherLabel", value.asInstanceOf[js.Any])
    
    inline def setQOtherTotalSpec(value: OtherTotalSpecProp): Self = StObject.set(x, "qOtherTotalSpec", value.asInstanceOf[js.Any])
    
    inline def setQShowAll(value: Boolean): Self = StObject.set(x, "qShowAll", value.asInstanceOf[js.Any])
    
    inline def setQTotalLabel(value: String): Self = StObject.set(x, "qTotalLabel", value.asInstanceOf[js.Any])
  }
}
