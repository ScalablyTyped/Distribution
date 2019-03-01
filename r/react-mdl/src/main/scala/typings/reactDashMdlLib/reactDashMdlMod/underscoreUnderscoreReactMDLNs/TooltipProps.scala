package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[Tooltip] {
  var label: reactLib.reactMod.ReactNs.ReactNode
  var large: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[Tooltip] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    position: java.lang.String = null,
    title: java.lang.String = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TooltipProps]
  }
}

