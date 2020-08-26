package typings.reactSketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInAParentText extends js.Object {
  var isInAParentText: Boolean = js.native
}

object IsInAParentText {
  @scala.inline
  def apply(isInAParentText: Boolean): IsInAParentText = {
    val __obj = js.Dynamic.literal(isInAParentText = isInAParentText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInAParentText]
  }
  @scala.inline
  implicit class IsInAParentTextOps[Self <: IsInAParentText] (val x: Self) extends AnyVal {
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
    def setIsInAParentText(value: Boolean): Self = this.set("isInAParentText", value.asInstanceOf[js.Any])
  }
  
}

