package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusResult[Target] extends StObject {
  
  /** Props to spread onto the target element. */
  var focusProps: DOMAttributes[Target]
}
object FocusResult {
  
  inline def apply[Target](focusProps: DOMAttributes[Target]): FocusResult[Target] = {
    val __obj = js.Dynamic.literal(focusProps = focusProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusResult[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusResult[?], Target] (val x: Self & FocusResult[Target]) extends AnyVal {
    
    inline def setFocusProps(value: DOMAttributes[Target]): Self = StObject.set(x, "focusProps", value.asInstanceOf[js.Any])
  }
}
