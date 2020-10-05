package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNode extends js.Object {
  def getNode(): js.Any = js.native
}

object GetNode {
  @scala.inline
  def apply(getNode: () => js.Any): GetNode = {
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
    def setGetNode(value: () => js.Any): Self = this.set("getNode", js.Any.fromFunction0(value))
  }
  
}

