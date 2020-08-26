package typings.prosemirrorView.anon

import typings.prosemirrorView.prosemirrorViewStrings.selection
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var target: Element = js.native
  var `type`: selection = js.native
}

object Target {
  @scala.inline
  def apply(target: Element, `type`: selection): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: selection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

