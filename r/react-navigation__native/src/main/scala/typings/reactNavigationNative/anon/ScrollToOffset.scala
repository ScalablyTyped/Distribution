package typings.reactNavigationNative.anon

import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToOffset
  extends StObject
     with ScrollableView {
  
  def scrollToOffset(options: Animated): Unit
}
object ScrollToOffset {
  
  inline def apply(scrollToOffset: Animated => Unit): ScrollToOffset = {
    val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
    __obj.asInstanceOf[ScrollToOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollToOffset] (val x: Self) extends AnyVal {
    
    inline def setScrollToOffset(value: Animated => Unit): Self = StObject.set(x, "scrollToOffset", js.Any.fromFunction1(value))
  }
}
