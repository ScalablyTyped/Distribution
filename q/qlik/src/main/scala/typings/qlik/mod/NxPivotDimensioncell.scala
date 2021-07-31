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

trait NxPivotDimensioncell extends StObject {
  
  var qAttrDims: js.Array[NxAttributeDimValues]
  
  var qAttrExps: js.Array[NxAttributeExpressionValues]
  
  var qCanCollapse: Boolean
  
  var qCanExpand: Boolean
  
  var qDown: Double
  
  var qElemNo: Double
  
  var qSubNodes: js.Array[NxPivotDimensioncell]
  
  var qText: String
  
  var qType: V | E | N | T | P | R | U
  
  var qUp: Double
  
  var qValue: Double
}
object NxPivotDimensioncell {
  
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
  
  @scala.inline
  implicit class NxPivotDimensioncellMutableBuilder[Self <: NxPivotDimensioncell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttrDims(value: js.Array[NxAttributeDimValues]): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimsVarargs(value: NxAttributeDimValues*): Self = StObject.set(x, "qAttrDims", js.Array(value :_*))
    
    @scala.inline
    def setQAttrExps(value: js.Array[NxAttributeExpressionValues]): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExpsVarargs(value: NxAttributeExpressionValues*): Self = StObject.set(x, "qAttrExps", js.Array(value :_*))
    
    @scala.inline
    def setQCanCollapse(value: Boolean): Self = StObject.set(x, "qCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanExpand(value: Boolean): Self = StObject.set(x, "qCanExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodes(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qSubNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodesVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qSubNodes", js.Array(value :_*))
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: V | E | N | T | P | R | U): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
