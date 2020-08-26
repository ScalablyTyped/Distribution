package typings.rcTree.nodeListMod

import typings.rcTree.anon.Key
import typings.rcTree.interfaceMod.ScrollTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeListRef extends js.Object {
  var scrollTo: ScrollTo = js.native
}

object NodeListRef {
  @scala.inline
  def apply(scrollTo: /* scroll */ Key => Unit): NodeListRef = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[NodeListRef]
  }
  @scala.inline
  implicit class NodeListRefOps[Self <: NodeListRef] (val x: Self) extends AnyVal {
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
    def setScrollTo(value: /* scroll */ Key => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
  }
  
}

