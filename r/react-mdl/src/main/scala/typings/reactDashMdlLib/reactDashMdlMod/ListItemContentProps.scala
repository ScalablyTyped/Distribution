package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.DOMAttributes[ListItemContent] {
  var avatar: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var subtitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var useBodyClass: js.UndefOr[scala.Boolean] = js.undefined
}

object ListItemContentProps {
  @scala.inline
  def apply(
    DOMAttributes: reactLib.reactMod.DOMAttributes[ListItemContent] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    avatar: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    icon: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    subtitle: reactLib.reactMod.ReactNode = null,
    useBodyClass: js.UndefOr[scala.Boolean] = js.undefined
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

