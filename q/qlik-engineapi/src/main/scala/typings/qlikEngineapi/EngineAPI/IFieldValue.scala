package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldValue...
  */
@js.native
trait IFieldValue extends StObject {
  
  /**
    * Is set to true if the value is a numeric.
    * This parameter is optional. Default is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  
  /**
    * Numeric value of the field.
    * This parameter is displayed if qIsNumeric is set to true.
    * This parameter is optional.
    */
  var qNumber: js.UndefOr[Double] = js.native
  
  /**
    * Text related to the field value
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.native
}
object IFieldValue {
  
  @scala.inline
  def apply(): IFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldValue]
  }
  
  @scala.inline
  implicit class IFieldValueMutableBuilder[Self <: IFieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIsNumeric(value: Boolean): Self = StObject.set(x, "qIsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNumericUndefined: Self = StObject.set(x, "qIsNumeric", js.undefined)
    
    @scala.inline
    def setQNumber(value: Double): Self = StObject.set(x, "qNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberUndefined: Self = StObject.set(x, "qNumber", js.undefined)
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextUndefined: Self = StObject.set(x, "qText", js.undefined)
  }
}
