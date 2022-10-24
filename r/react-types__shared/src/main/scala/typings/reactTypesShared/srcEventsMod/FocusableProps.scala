package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusableProps
  extends StObject
     with FocusEvents
     with KeyboardEvents {
  
  /** Whether the element should receive focus on render. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
}
object FocusableProps {
  
  inline def apply(): FocusableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusableProps]
  }
  
  extension [Self <: FocusableProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
  }
}
