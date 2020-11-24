package typings.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToOptions extends js.Object {
  
  def callback(): Unit = js.native
  
  def easing(percent: Double): Double = js.native
}
object ScrollToOptions {
  
  @scala.inline
  def apply(callback: () => Unit, easing: Double => Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), easing = js.Any.fromFunction1(easing))
    __obj.asInstanceOf[ScrollToOptions]
  }
  
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEasing(value: Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
  }
}
