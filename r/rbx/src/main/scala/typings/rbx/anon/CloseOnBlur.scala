package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOnBlur extends StObject {
  
  var closeOnBlur: Boolean
  
  var closeOnEsc: Boolean
}
object CloseOnBlur {
  
  inline def apply(closeOnBlur: Boolean, closeOnEsc: Boolean): CloseOnBlur = {
    val __obj = js.Dynamic.literal(closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnBlur]
  }
  
  extension [Self <: CloseOnBlur](x: Self) {
    
    inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
  }
}
