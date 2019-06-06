package typings
package atStorybookComponentsLib.distTooltipTooltipLinkListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var id: java.lang.String
  var isGatsby: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    id: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String | js.Object = null,
    isGatsby: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: () => scala.Unit = null,
    title: reactLib.reactMod.ReactNode = null
  ): Link = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isGatsby)) __obj.updateDynamic("isGatsby")(isGatsby)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

