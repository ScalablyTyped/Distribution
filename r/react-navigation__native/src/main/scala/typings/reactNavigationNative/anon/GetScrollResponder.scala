package typings.reactNavigationNative.anon

import typings.react.mod.ReactNode
import typings.reactNavigationNative.useScrollToTopMod.ScrollableWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScrollResponder extends ScrollableWrapper {
  
  def getScrollResponder(): ReactNode = js.native
}
object GetScrollResponder {
  
  @scala.inline
  def apply(getScrollResponder: () => ReactNode): GetScrollResponder = {
    val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
    __obj.asInstanceOf[GetScrollResponder]
  }
  
  @scala.inline
  implicit class GetScrollResponderOps[Self <: GetScrollResponder] (val x: Self) extends AnyVal {
    
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
    def setGetScrollResponder(value: () => ReactNode): Self = this.set("getScrollResponder", js.Any.fromFunction0(value))
  }
}
