package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputActionMeta extends StObject {
  
  var action: InputAction
  
  /** The previous value of the search input. */
  var prevInputValue: String
}
object InputActionMeta {
  
  inline def apply(action: InputAction, prevInputValue: String): InputActionMeta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], prevInputValue = prevInputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputActionMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputActionMeta] (val x: Self) extends AnyVal {
    
    inline def setAction(value: InputAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPrevInputValue(value: String): Self = StObject.set(x, "prevInputValue", value.asInstanceOf[js.Any])
  }
}
