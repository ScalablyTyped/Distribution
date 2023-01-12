package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.FocusEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusProps
  extends StObject
     with FocusEvents {
  
  /** Whether the focus events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}
object FocusProps {
  
  inline def apply(): FocusProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusProps] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
  }
}
