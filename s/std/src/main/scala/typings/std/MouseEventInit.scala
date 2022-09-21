package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEventInit
  extends StObject
     with EventModifierInit {
  
  /* standard dom */
  var button: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var buttons: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var clientX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var clientY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var movementX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var movementY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
  
  /* standard dom */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var screenY: js.UndefOr[Double] = js.undefined
}
object MouseEventInit {
  
  inline def apply(): MouseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventInit]
  }
  
  extension [Self <: MouseEventInit](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
    
    inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    inline def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
    
    inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    inline def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
    
    inline def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
  }
}
