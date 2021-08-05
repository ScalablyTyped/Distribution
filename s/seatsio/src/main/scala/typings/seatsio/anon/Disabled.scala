package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: js.Array[String]
  
  var enabled: js.Array[String]
  
  var readOnly: js.Array[String]
}
object Disabled {
  
  inline def apply(disabled: js.Array[String], enabled: js.Array[String], readOnly: js.Array[String]): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: js.Array[String]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledVarargs(value: String*): Self = StObject.set(x, "disabled", js.Array(value :_*))
    
    inline def setEnabled(value: js.Array[String]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledVarargs(value: String*): Self = StObject.set(x, "enabled", js.Array(value :_*))
    
    inline def setReadOnly(value: js.Array[String]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyVarargs(value: String*): Self = StObject.set(x, "readOnly", js.Array(value :_*))
  }
}
