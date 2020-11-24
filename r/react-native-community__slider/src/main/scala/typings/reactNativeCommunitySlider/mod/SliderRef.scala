package typings.reactNativeCommunitySlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderRef extends js.Object {
  
  def updateValue(value: Double): Unit = js.native
}
object SliderRef {
  
  @scala.inline
  def apply(updateValue: Double => Unit): SliderRef = {
    val __obj = js.Dynamic.literal(updateValue = js.Any.fromFunction1(updateValue))
    __obj.asInstanceOf[SliderRef]
  }
  
  @scala.inline
  implicit class SliderRefOps[Self <: SliderRef] (val x: Self) extends AnyVal {
    
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
    def setUpdateValue(value: Double => Unit): Self = this.set("updateValue", js.Any.fromFunction1(value))
  }
}
