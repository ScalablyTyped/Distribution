package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTextInputFocus extends StObject {
  
  var forceTextInputFocus: Boolean
}
object ForceTextInputFocus {
  
  inline def apply(forceTextInputFocus: Boolean): ForceTextInputFocus = {
    val __obj = js.Dynamic.literal(forceTextInputFocus = forceTextInputFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTextInputFocus]
  }
  
  extension [Self <: ForceTextInputFocus](x: Self) {
    
    inline def setForceTextInputFocus(value: Boolean): Self = StObject.set(x, "forceTextInputFocus", value.asInstanceOf[js.Any])
  }
}
