package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.HoverEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverProps
  extends StObject
     with HoverEvents {
  
  /** Whether the hover events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}
object HoverProps {
  
  inline def apply(): HoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverProps] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
  }
}
