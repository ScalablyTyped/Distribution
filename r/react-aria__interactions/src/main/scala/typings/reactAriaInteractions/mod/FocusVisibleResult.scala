package typings.reactAriaInteractions.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisibleResult extends StObject {
  
  /** Whether keyboard focus is visible globally. */
  var isFocusVisible: Boolean
}
object FocusVisibleResult {
  
  inline def apply(isFocusVisible: Boolean): FocusVisibleResult = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisibleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusVisibleResult] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
