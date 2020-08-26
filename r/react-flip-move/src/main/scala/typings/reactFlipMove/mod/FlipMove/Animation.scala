package typings.reactFlipMove.mod.FlipMove

import typings.reactFlipMove.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends _AnimationProp {
  var from: PartialCSSStyleDeclaratio = js.native
  var to: PartialCSSStyleDeclaratio = js.native
}

object Animation {
  @scala.inline
  def apply(from: PartialCSSStyleDeclaratio, to: PartialCSSStyleDeclaratio): Animation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
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
    def setFrom(value: PartialCSSStyleDeclaratio): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: PartialCSSStyleDeclaratio): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

