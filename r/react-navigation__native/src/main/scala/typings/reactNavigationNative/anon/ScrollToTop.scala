package typings.reactNavigationNative.anon

import typings.reactNavigationNative.useScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToTop
  extends StObject
     with ScrollableView {
  
  def scrollToTop(): Unit
}
object ScrollToTop {
  
  @scala.inline
  def apply(scrollToTop: () => Unit): ScrollToTop = {
    val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
    __obj.asInstanceOf[ScrollToTop]
  }
  
  @scala.inline
  implicit class ScrollToTopMutableBuilder[Self <: ScrollToTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollToTop(value: () => Unit): Self = StObject.set(x, "scrollToTop", js.Any.fromFunction0(value))
  }
}
