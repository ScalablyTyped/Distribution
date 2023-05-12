package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.FocusEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusProps[Target]
  extends StObject
     with FocusEvents[Target] {
  
  /** Whether the focus events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}
object FocusProps {
  
  inline def apply[Target](): FocusProps[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusProps[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusProps[?], Target] (val x: Self & FocusProps[Target]) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
  }
}
