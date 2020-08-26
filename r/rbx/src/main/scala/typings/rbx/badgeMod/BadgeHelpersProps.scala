package typings.rbx.badgeMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeHelpersProps extends js.Object {
  var badge: js.UndefOr[Double | String] = js.native
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  var badgeRounded: js.UndefOr[Boolean] = js.native
  var badgeSize: js.UndefOr[small | medium | large] = js.native
}

object BadgeHelpersProps {
  @scala.inline
  def apply(): BadgeHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeHelpersProps]
  }
  @scala.inline
  implicit class BadgeHelpersPropsOps[Self <: BadgeHelpersProps] (val x: Self) extends AnyVal {
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
    def setBadge(value: Double | String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    @scala.inline
    def setBadgeOutlined(value: Boolean): Self = this.set("badgeOutlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeOutlined: Self = this.set("badgeOutlined", js.undefined)
    @scala.inline
    def setBadgeRounded(value: Boolean): Self = this.set("badgeRounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeRounded: Self = this.set("badgeRounded", js.undefined)
    @scala.inline
    def setBadgeSize(value: small | medium | large): Self = this.set("badgeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeSize: Self = this.set("badgeSize", js.undefined)
  }
  
}

