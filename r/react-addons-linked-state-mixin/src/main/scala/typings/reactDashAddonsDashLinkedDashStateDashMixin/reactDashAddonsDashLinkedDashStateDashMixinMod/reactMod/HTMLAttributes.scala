package typings.reactDashAddonsDashLinkedDashStateDashMixin.reactDashAddonsDashLinkedDashStateDashMixinMod.reactMod

import typings.reactDashAddonsDashLinkedDashStateDashMixin.reactDashAddonsDashLinkedDashStateDashMixinMod.ReactLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var checkedLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  var valueLink: js.UndefOr[ReactLink[Boolean | String | Double]] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](checkedLink: ReactLink[Boolean] = null, valueLink: ReactLink[Boolean | String | Double] = null): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (checkedLink != null) __obj.updateDynamic("checkedLink")(checkedLink)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

