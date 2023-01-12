package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capture extends StObject {
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var passive: js.UndefOr[Boolean] = js.undefined
}
object Capture {
  
  inline def apply(): Capture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
