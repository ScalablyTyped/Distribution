package typings.reactNavigationNative.anon

import typings.reactNavigationNative.useScrollToTopMod.ScrollableView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToTop extends ScrollableView {
  
  def scrollToTop(): Unit = js.native
}
object ScrollToTop {
  
  @scala.inline
  def apply(scrollToTop: () => Unit): ScrollToTop = {
    val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
    __obj.asInstanceOf[ScrollToTop]
  }
  
  @scala.inline
  implicit class ScrollToTopOps[Self <: ScrollToTop] (val x: Self) extends AnyVal {
    
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
    def setScrollToTop(value: () => Unit): Self = this.set("scrollToTop", js.Any.fromFunction0(value))
  }
}
