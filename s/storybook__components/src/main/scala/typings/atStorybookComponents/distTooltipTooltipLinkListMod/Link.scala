package typings.atStorybookComponents.distTooltipTooltipLinkListMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String | js.Object] = js.undefined
  var id: String
  var isGatsby: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    id: String,
    active: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    isGatsby: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    title: ReactNode = null
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

