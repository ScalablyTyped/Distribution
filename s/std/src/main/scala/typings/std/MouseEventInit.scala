package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEventInit
  extends StObject
     with EventModifierInit {
  
  var button: js.UndefOr[Double] = js.undefined
  
  var buttons: js.UndefOr[Double] = js.undefined
  
  var clientX: js.UndefOr[Double] = js.undefined
  
  var clientY: js.UndefOr[Double] = js.undefined
  
  var movementX: js.UndefOr[Double] = js.undefined
  
  var movementY: js.UndefOr[Double] = js.undefined
  
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
  
  var screenX: js.UndefOr[Double] = js.undefined
  
  var screenY: js.UndefOr[Double] = js.undefined
}
object MouseEventInit {
  
  @scala.inline
  def apply(): MouseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventInit]
  }
  
  @scala.inline
  implicit class MouseEventInitMutableBuilder[Self <: MouseEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
    
    @scala.inline
    def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
    
    @scala.inline
    def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    @scala.inline
    def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
  }
}
