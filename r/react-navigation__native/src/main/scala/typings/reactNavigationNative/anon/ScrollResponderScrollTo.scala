package typings.reactNavigationNative.anon

import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollOptions
import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollResponderScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit
}
object ScrollResponderScrollTo {
  
  inline def apply(scrollResponderScrollTo: ScrollOptions => Unit): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  extension [Self <: ScrollResponderScrollTo](x: Self) {
    
    inline def setScrollResponderScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollResponderScrollTo", js.Any.fromFunction1(value))
  }
}
