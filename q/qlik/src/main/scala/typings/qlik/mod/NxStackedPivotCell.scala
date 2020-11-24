package typings.qlik.mod

import typings.qlik.qlikStrings.E
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.R
import typings.qlik.qlikStrings.T
import typings.qlik.qlikStrings.U
import typings.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxStackedPivotCell extends js.Object {
  
  var qAttrDims: NxAttributeDimValues = js.native
  
  var qAttrExps: NxAttributeExpressionValues = js.native
  
  var qCanCollapse: Boolean = js.native
  
  var qCanExpand: Boolean = js.native
  
  var qDown: Double = js.native
  
  var qElemNo: Double = js.native
  
  var qMaxPos: Double = js.native
  
  var qMinNeg: Double = js.native
  
  var qRow: Double = js.native
  
  var qSubNodes: js.Array[NxStackedPivotCell] = js.native
  
  var qText: String = js.native
  
  var qType: V | E | N | T | P | R | U = js.native
  
  var qUp: Double = js.native
  
  var qValue: Double = js.native
}
object NxStackedPivotCell {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NxStackedPivotCellOps[Self <: NxStackedPivotCell] (val x: Self) extends AnyVal {
    
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
    def setQAttrDims(value: NxAttributeDimValues): Self = this.set("qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExps(value: NxAttributeExpressionValues): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanCollapse(value: Boolean): Self = this.set("qCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanExpand(value: Boolean): Self = this.set("qCanExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDown(value: Double): Self = this.set("qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNo(value: Double): Self = this.set("qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxPos(value: Double): Self = this.set("qMaxPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMinNeg(value: Double): Self = this.set("qMinNeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRow(value: Double): Self = this.set("qRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodesVarargs(value: NxStackedPivotCell*): Self = this.set("qSubNodes", js.Array(value :_*))
    
    @scala.inline
    def setQSubNodes(value: js.Array[NxStackedPivotCell]): Self = this.set("qSubNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: V | E | N | T | P | R | U): Self = this.set("qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUp(value: Double): Self = this.set("qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
}
