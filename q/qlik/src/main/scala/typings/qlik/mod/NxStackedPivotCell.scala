package typings.qlik.mod

import typings.qlik.qlikStrings.E
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.R
import typings.qlik.qlikStrings.T
import typings.qlik.qlikStrings.U
import typings.qlik.qlikStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxStackedPivotCell extends StObject {
  
  var qAttrDims: NxAttributeDimValues
  
  var qAttrExps: NxAttributeExpressionValues
  
  var qCanCollapse: Boolean
  
  var qCanExpand: Boolean
  
  var qDown: Double
  
  var qElemNo: Double
  
  var qMaxPos: Double
  
  var qMinNeg: Double
  
  var qRow: Double
  
  var qSubNodes: js.Array[NxStackedPivotCell]
  
  var qText: String
  
  var qType: V | E | N | T | P | R | U
  
  var qUp: Double
  
  var qValue: Double
}
object NxStackedPivotCell {
  
  inline def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[NxStackedPivotCell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qMaxPos = qMaxPos.asInstanceOf[js.Any], qMinNeg = qMinNeg.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackedPivotCell]
  }
  
  extension [Self <: NxStackedPivotCell](x: Self) {
    
    inline def setQAttrDims(value: NxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrExps(value: NxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQCanCollapse(value: Boolean): Self = StObject.set(x, "qCanCollapse", value.asInstanceOf[js.Any])
    
    inline def setQCanExpand(value: Boolean): Self = StObject.set(x, "qCanExpand", value.asInstanceOf[js.Any])
    
    inline def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    inline def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    inline def setQMaxPos(value: Double): Self = StObject.set(x, "qMaxPos", value.asInstanceOf[js.Any])
    
    inline def setQMinNeg(value: Double): Self = StObject.set(x, "qMinNeg", value.asInstanceOf[js.Any])
    
    inline def setQRow(value: Double): Self = StObject.set(x, "qRow", value.asInstanceOf[js.Any])
    
    inline def setQSubNodes(value: js.Array[NxStackedPivotCell]): Self = StObject.set(x, "qSubNodes", value.asInstanceOf[js.Any])
    
    inline def setQSubNodesVarargs(value: NxStackedPivotCell*): Self = StObject.set(x, "qSubNodes", js.Array(value*))
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: V | E | N | T | P | R | U): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
