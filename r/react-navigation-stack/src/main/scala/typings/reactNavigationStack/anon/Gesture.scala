package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gesture extends StObject {
  
  var closing: Boolean
  
  var gesture: Boolean
}
object Gesture {
  
  inline def apply(closing: Boolean, gesture: Boolean): Gesture = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gesture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gesture] (val x: Self) extends AnyVal {
    
    inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setGesture(value: Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
  }
}
