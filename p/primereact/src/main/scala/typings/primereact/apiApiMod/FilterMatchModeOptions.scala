package typings.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMatchModeOptions extends StObject {
  
  var date: js.Array[Any]
  
  var numeric: js.Array[Any]
  
  var text: js.Array[Any]
}
object FilterMatchModeOptions {
  
  inline def apply(date: js.Array[Any], numeric: js.Array[Any], text: js.Array[Any]): FilterMatchModeOptions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterMatchModeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterMatchModeOptions] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Array[Any]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateVarargs(value: Any*): Self = StObject.set(x, "date", js.Array(value*))
    
    inline def setNumeric(value: js.Array[Any]): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericVarargs(value: Any*): Self = StObject.set(x, "numeric", js.Array(value*))
    
    inline def setText(value: js.Array[Any]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: Any*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
