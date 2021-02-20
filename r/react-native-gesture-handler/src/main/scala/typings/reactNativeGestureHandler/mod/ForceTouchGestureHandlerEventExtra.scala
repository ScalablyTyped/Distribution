package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTouchGestureHandlerEventExtra extends StObject {
  
  var absoluteX: Double = js.native
  
  var absoluteY: Double = js.native
  
  var force: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ForceTouchGestureHandlerEventExtra {
  
  @scala.inline
  def apply(absoluteX: Double, absoluteY: Double, force: Double, x: Double, y: Double): ForceTouchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerEventExtra]
  }
  
  @scala.inline
  implicit class ForceTouchGestureHandlerEventExtraMutableBuilder[Self <: ForceTouchGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
