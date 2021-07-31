package typings.reactNavigationNative.anon

import typings.react.mod.ReactNode
import typings.reactNavigationNative.useScrollToTopMod.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScrollResponder
  extends StObject
     with ScrollableWrapper {
  
  def getScrollResponder(): ReactNode
}
object GetScrollResponder {
  
  @scala.inline
  def apply(getScrollResponder: () => ReactNode): GetScrollResponder = {
    val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
    __obj.asInstanceOf[GetScrollResponder]
  }
  
  @scala.inline
  implicit class GetScrollResponderMutableBuilder[Self <: GetScrollResponder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScrollResponder(value: () => ReactNode): Self = StObject.set(x, "getScrollResponder", js.Any.fromFunction0(value))
  }
}
