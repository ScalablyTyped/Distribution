package typings.storybookComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLink extends js.Object {
  var isLink: Boolean = js.native
}

object IsLink {
  @scala.inline
  def apply(isLink: Boolean): IsLink = {
    val __obj = js.Dynamic.literal(isLink = isLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLink]
  }
  @scala.inline
  implicit class IsLinkOps[Self <: IsLink] (val x: Self) extends AnyVal {
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
    def setIsLink(value: Boolean): Self = this.set("isLink", value.asInstanceOf[js.Any])
  }
  
}

