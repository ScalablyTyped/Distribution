package typings.prosemirrorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  var anchor: Double = js.native
  var head: Double = js.native
}

object Anchor {
  @scala.inline
  def apply(anchor: Double, head: Double): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
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
    def setAnchor(value: Double): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead(value: Double): Self = this.set("head", value.asInstanceOf[js.Any])
  }
  
}

