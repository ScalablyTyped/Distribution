package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxTreeValue extends js.Object {
  
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.native
  
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.native
  
  /**
    * The text version of the value, if available.
    */
  var qText: String = js.native
  
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double = js.native
}
object INxTreeValue {
  
  @scala.inline
  def apply(qText: String, qValue: Double): INxTreeValue = {
    val __obj = js.Dynamic.literal(qText = qText.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeValue]
  }
  
  @scala.inline
  implicit class INxTreeValueOps[Self <: INxTreeValue] (val x: Self) extends AnyVal {
    
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
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = this.set("qValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDims(value: INxAttributeDimValues): Self = this.set("qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQAttrDims: Self = this.set("qAttrDims", js.undefined)
    
    @scala.inline
    def setQAttrExps(value: INxAttributeExpressionValues): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQAttrExps: Self = this.set("qAttrExps", js.undefined)
  }
}
