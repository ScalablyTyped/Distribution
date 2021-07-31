package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxTreeValue extends StObject {
  
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.undefined
  
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.undefined
  
  /**
    * The text version of the value, if available.
    */
  var qText: String
  
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double
}
object INxTreeValue {
  
  @scala.inline
  def apply(qText: String, qValue: Double): INxTreeValue = {
    val __obj = js.Dynamic.literal(qText = qText.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeValue]
  }
  
  @scala.inline
  implicit class INxTreeValueMutableBuilder[Self <: INxTreeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttrDims(value: INxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimsUndefined: Self = StObject.set(x, "qAttrDims", js.undefined)
    
    @scala.inline
    def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExpsUndefined: Self = StObject.set(x, "qAttrExps", js.undefined)
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
