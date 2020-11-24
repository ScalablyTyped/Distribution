package typings.reactNavigationNative.anon

import typings.reactNavigationNative.useScrollToTopMod.ScrollOptions
import typings.reactNavigationNative.useScrollToTopMod.ScrollableView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTo extends ScrollableView {
  
  def scrollTo(options: ScrollOptions): Unit = js.native
}
object ScrollTo {
  
  @scala.inline
  def apply(scrollTo: ScrollOptions => Unit): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollTo]
  }
  
  @scala.inline
  implicit class ScrollToOps[Self <: ScrollTo] (val x: Self) extends AnyVal {
    
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
    def setScrollTo(value: ScrollOptions => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
  }
}
