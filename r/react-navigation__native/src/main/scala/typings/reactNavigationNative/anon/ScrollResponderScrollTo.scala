package typings.reactNavigationNative.anon

import typings.reactNavigationNative.useScrollToTopMod.ScrollOptions
import typings.reactNavigationNative.useScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollResponderScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit
}
object ScrollResponderScrollTo {
  
  @scala.inline
  def apply(scrollResponderScrollTo: ScrollOptions => Unit): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  @scala.inline
  implicit class ScrollResponderScrollToMutableBuilder[Self <: ScrollResponderScrollTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollResponderScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollResponderScrollTo", js.Any.fromFunction1(value))
  }
}
