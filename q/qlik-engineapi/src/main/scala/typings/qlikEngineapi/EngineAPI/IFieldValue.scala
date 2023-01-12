package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldValue...
  */
trait IFieldValue extends StObject {
  
  /**
    * Is set to true if the value is a numeric.
    * This parameter is optional. Default is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Numeric value of the field.
    * This parameter is displayed if qIsNumeric is set to true.
    * This parameter is optional.
    */
  var qNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Text related to the field value
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.undefined
}
object IFieldValue {
  
  inline def apply(): IFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldValue] (val x: Self) extends AnyVal {
    
    inline def setQIsNumeric(value: Boolean): Self = StObject.set(x, "qIsNumeric", value.asInstanceOf[js.Any])
    
    inline def setQIsNumericUndefined: Self = StObject.set(x, "qIsNumeric", js.undefined)
    
    inline def setQNumber(value: Double): Self = StObject.set(x, "qNumber", value.asInstanceOf[js.Any])
    
    inline def setQNumberUndefined: Self = StObject.set(x, "qNumber", js.undefined)
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQTextUndefined: Self = StObject.set(x, "qText", js.undefined)
  }
}
