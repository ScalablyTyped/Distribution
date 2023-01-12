package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.ScrollEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollWheelProps
  extends StObject
     with ScrollEvents {
  
  /** Whether the scroll listener should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}
object ScrollWheelProps {
  
  inline def apply(): ScrollWheelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollWheelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollWheelProps] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
  }
}
