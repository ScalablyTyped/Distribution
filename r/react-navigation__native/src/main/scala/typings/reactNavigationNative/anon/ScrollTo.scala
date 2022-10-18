package typings.reactNavigationNative.anon

import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollOptions
import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollTo(options: ScrollOptions): Unit
}
object ScrollTo {
  
  inline def apply(scrollTo: ScrollOptions => Unit): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollTo]
  }
  
  extension [Self <: ScrollTo](x: Self) {
    
    inline def setScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
  }
}
