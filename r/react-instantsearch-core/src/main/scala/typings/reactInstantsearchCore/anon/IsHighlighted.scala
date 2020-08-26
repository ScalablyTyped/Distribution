package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsHighlighted extends js.Object {
  var isHighlighted: Boolean = js.native
  var value: String = js.native
}

object IsHighlighted {
  @scala.inline
  def apply(isHighlighted: Boolean, value: String): IsHighlighted = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  @scala.inline
  implicit class IsHighlightedOps[Self <: IsHighlighted] (val x: Self) extends AnyVal {
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
    def setIsHighlighted(value: Boolean): Self = this.set("isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

