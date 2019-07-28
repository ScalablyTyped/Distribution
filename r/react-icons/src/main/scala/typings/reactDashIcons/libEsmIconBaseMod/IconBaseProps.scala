package typings.reactDashIcons.libEsmIconBaseMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps extends SVGAttributes[SVGElement] {
  var size: js.UndefOr[String | Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    children: ReactNode = null,
    color: String = null,
    size: String | Double = null,
    title: String = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IconBaseProps]
  }
}

