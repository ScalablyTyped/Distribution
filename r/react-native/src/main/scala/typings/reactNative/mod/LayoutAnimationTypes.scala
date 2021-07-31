package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationTypes extends StObject {
  
  var easeIn: String
  
  var easeInEaseOut: String
  
  var easeOut: String
  
  var keyboard: String
  
  var linear: String
  
  var spring: String
}
object LayoutAnimationTypes {
  
  @scala.inline
  def apply(
    easeIn: String,
    easeInEaseOut: String,
    easeOut: String,
    keyboard: String,
    linear: String,
    spring: String
  ): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
  
  @scala.inline
  implicit class LayoutAnimationTypesMutableBuilder[Self <: LayoutAnimationTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInEaseOut(value: String): Self = StObject.set(x, "easeInEaseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: String): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpring(value: String): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
  }
}
