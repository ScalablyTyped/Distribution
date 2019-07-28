package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends MDLHTMLAttributes
     with DOMAttributes[Tooltip] {
  var label: ReactNode
  var large: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    label: ReactNode,
    DOMAttributes: DOMAttributes[Tooltip] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    large: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    position: String = null,
    title: String = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TooltipProps]
  }
}

