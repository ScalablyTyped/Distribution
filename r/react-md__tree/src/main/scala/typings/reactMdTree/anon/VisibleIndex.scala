package typings.reactMdTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibleIndex extends js.Object {
  var visibleIndex: Double = js.native
}

object VisibleIndex {
  @scala.inline
  def apply(visibleIndex: Double): VisibleIndex = {
    val __obj = js.Dynamic.literal(visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleIndex]
  }
  @scala.inline
  implicit class VisibleIndexOps[Self <: VisibleIndex] (val x: Self) extends AnyVal {
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
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

