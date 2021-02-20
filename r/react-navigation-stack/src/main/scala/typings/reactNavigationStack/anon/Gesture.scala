package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gesture extends StObject {
  
  var closing: Boolean = js.native
  
  var gesture: Boolean = js.native
}
object Gesture {
  
  @scala.inline
  def apply(closing: Boolean, gesture: Boolean): Gesture = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gesture]
  }
  
  @scala.inline
  implicit class GestureMutableBuilder[Self <: Gesture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGesture(value: Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
  }
}
