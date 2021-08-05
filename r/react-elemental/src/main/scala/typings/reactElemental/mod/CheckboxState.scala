package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxState extends StObject {
  
  val isFocus: Boolean
  
  val isHover: Boolean
}
object CheckboxState {
  
  inline def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxState]
  }
  
  extension [Self <: CheckboxState](x: Self) {
    
    inline def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
    
    inline def setIsHover(value: Boolean): Self = StObject.set(x, "isHover", value.asInstanceOf[js.Any])
  }
}
