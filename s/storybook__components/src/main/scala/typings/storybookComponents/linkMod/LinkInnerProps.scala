package typings.storybookComponents.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkInnerProps extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.native
  var withArrow: js.UndefOr[Boolean] = js.native
}

object LinkInnerProps {
  @scala.inline
  def apply(): LinkInnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkInnerProps]
  }
  @scala.inline
  implicit class LinkInnerPropsOps[Self <: LinkInnerProps] (val x: Self) extends AnyVal {
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
    def setContainsIcon(value: Boolean): Self = this.set("containsIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsIcon: Self = this.set("containsIcon", js.undefined)
    @scala.inline
    def setWithArrow(value: Boolean): Self = this.set("withArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithArrow: Self = this.set("withArrow", js.undefined)
  }
  
}

