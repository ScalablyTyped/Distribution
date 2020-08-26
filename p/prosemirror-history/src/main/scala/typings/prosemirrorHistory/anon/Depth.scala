package typings.prosemirrorHistory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Depth extends js.Object {
  var depth: js.UndefOr[Double | Null] = js.native
  var newGroupDelay: js.UndefOr[Double | Null] = js.native
}

object Depth {
  @scala.inline
  def apply(): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Depth]
  }
  @scala.inline
  implicit class DepthOps[Self <: Depth] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDepthNull: Self = this.set("depth", null)
    @scala.inline
    def setNewGroupDelay(value: Double): Self = this.set("newGroupDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewGroupDelay: Self = this.set("newGroupDelay", js.undefined)
    @scala.inline
    def setNewGroupDelayNull: Self = this.set("newGroupDelay", null)
  }
  
}

