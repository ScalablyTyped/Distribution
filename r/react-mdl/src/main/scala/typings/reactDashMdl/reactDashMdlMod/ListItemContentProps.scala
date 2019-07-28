package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentProps
  extends MDLHTMLAttributes
     with DOMAttributes[ListItemContent] {
  var avatar: js.UndefOr[String | Element] = js.undefined
  var icon: js.UndefOr[String | Element] = js.undefined
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  var useBodyClass: js.UndefOr[Boolean] = js.undefined
}

object ListItemContentProps {
  @scala.inline
  def apply(
    DOMAttributes: DOMAttributes[ListItemContent] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    avatar: String | Element = null,
    icon: String | Element = null,
    subtitle: ReactNode = null,
    useBodyClass: js.UndefOr[Boolean] = js.undefined
  ): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(useBodyClass)) __obj.updateDynamic("useBodyClass")(useBodyClass)
    __obj.asInstanceOf[ListItemContentProps]
  }
}

