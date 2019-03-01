package typings
package reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends js.Object {
  var checkedLink: js.UndefOr[
    reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs.ReactLink[scala.Boolean]
  ] = js.undefined
  var valueLink: js.UndefOr[
    reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs.ReactLink[scala.Boolean | java.lang.String | scala.Double]
  ] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](
    checkedLink: reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs.ReactLink[scala.Boolean] = null,
    valueLink: reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs.ReactLink[scala.Boolean | java.lang.String | scala.Double] = null
  ): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (checkedLink != null) __obj.updateDynamic("checkedLink")(checkedLink)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

