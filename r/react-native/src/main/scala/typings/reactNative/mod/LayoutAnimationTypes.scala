package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutAnimationTypes extends js.Object {
  
  var easeIn: String = js.native
  
  var easeInEaseOut: String = js.native
  
  var easeOut: String = js.native
  
  var keyboard: String = js.native
  
  var linear: String = js.native
  
  var spring: String = js.native
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
  implicit class LayoutAnimationTypesOps[Self <: LayoutAnimationTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEaseIn(value: String): Self = this.set("easeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInEaseOut(value: String): Self = this.set("easeInEaseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOut(value: String): Self = this.set("easeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: String): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: String): Self = this.set("linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpring(value: String): Self = this.set("spring", value.asInstanceOf[js.Any])
  }
}
