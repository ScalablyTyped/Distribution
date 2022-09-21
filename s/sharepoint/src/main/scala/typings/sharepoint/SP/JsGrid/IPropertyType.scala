package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyType extends StObject {
  
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ DataValue, Unit],
    fnError: Any
  ): Unit
  
  var ID: String
}
object IPropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyType]
  }
  
  extension [Self <: IPropertyType](x: Self) {
    
    inline def setBeginValidateNormalizeConvert(value: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Unit): Self = StObject.set(x, "BeginValidateNormalizeConvert", js.Any.fromFunction6(value))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
