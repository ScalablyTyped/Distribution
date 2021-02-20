package typings.reactNative.anon

import typings.reactNative.mod.Animated.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y extends StObject {
  
  var x: Double | AnimatedValue = js.native
  
  var y: Double | AnimatedValue = js.native
}
object Y {
  
  @scala.inline
  def apply(x: Double | AnimatedValue, y: Double | AnimatedValue): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double | AnimatedValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | AnimatedValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
