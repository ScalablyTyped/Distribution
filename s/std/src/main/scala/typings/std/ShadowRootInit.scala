package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootInit extends StObject {
  
  /* standard dom */
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var mode: ShadowRootMode
  
  /* standard dom */
  var slotAssignment: js.UndefOr[SlotAssignmentMode] = js.undefined
}
object ShadowRootInit {
  
  inline def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowRootInit] (val x: Self) extends AnyVal {
    
    inline def setDelegatesFocus(value: scala.Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
    
    inline def setMode(value: ShadowRootMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSlotAssignment(value: SlotAssignmentMode): Self = StObject.set(x, "slotAssignment", value.asInstanceOf[js.Any])
    
    inline def setSlotAssignmentUndefined: Self = StObject.set(x, "slotAssignment", js.undefined)
  }
}
