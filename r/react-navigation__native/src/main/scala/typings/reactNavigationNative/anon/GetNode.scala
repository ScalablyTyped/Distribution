package typings.reactNavigationNative.anon

import typings.reactNavigationNative.useScrollToTopMod.ScrollableView
import typings.reactNavigationNative.useScrollToTopMod.ScrollableWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNode extends ScrollableWrapper {
  
  def getNode(): ScrollableView = js.native
}
object GetNode {
  
  @scala.inline
  def apply(getNode: () => ScrollableView): GetNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[GetNode]
  }
  
  @scala.inline
  implicit class GetNodeOps[Self <: GetNode] (val x: Self) extends AnyVal {
    
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
    def setGetNode(value: () => ScrollableView): Self = this.set("getNode", js.Any.fromFunction0(value))
  }
}
