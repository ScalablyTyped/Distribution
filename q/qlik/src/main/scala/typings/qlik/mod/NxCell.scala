package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.L
import typings.qlik.qlikStrings.O
import typings.qlik.qlikStrings.S
import typings.qlik.qlikStrings.X
import typings.qlik.qlikStrings.XL
import typings.qlik.qlikStrings.XS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxCell extends StObject {
  
  var qAttrDims: NxAttributeDimValues = js.native
  
  var qAttrExps: NxAttributeExpressionValues = js.native
  
  var qElemNumber: Double = js.native
  
  var qFrequency: String = js.native
  
  var qHighlightRanges: NxHighlightRanges = js.native
  
  var qIsEmpty: Boolean = js.native
  
  var qIsNull: Boolean = js.native
  
  var qIsOtherCell: Boolean = js.native
  
  var qIsTotalCell: Boolean = js.native
  
  var qNum: Double = js.native
  
  var qState: L | S | O | D | A | X | XS | XL = js.native
  
  var qText: String = js.native
}
object NxCell {
  
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qNum: Double,
    qState: L | S | O | D | A | X | XS | XL,
    qText: String
  ): NxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCell]
  }
  
  @scala.inline
  implicit class NxCellMutableBuilder[Self <: NxCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttrDims(value: NxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExps(value: NxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFrequency(value: String): Self = StObject.set(x, "qFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHighlightRanges(value: NxHighlightRanges): Self = StObject.set(x, "qHighlightRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsEmpty(value: Boolean): Self = StObject.set(x, "qIsEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNull(value: Boolean): Self = StObject.set(x, "qIsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsOtherCell(value: Boolean): Self = StObject.set(x, "qIsOtherCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsTotalCell(value: Boolean): Self = StObject.set(x, "qIsTotalCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQState(value: L | S | O | D | A | X | XS | XL): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
