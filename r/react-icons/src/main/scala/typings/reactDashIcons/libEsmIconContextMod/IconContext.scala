package typings.reactDashIcons.libEsmIconContextMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconContext extends js.Object {
  var attr: js.UndefOr[SVGAttributes[SVGElement]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IconContext {
  @scala.inline
  def apply(
    attr: SVGAttributes[SVGElement] = null,
    className: String = null,
    color: String = null,
    size: String = null,
    style: CSSProperties = null
  ): IconContext = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconContext]
  }
}

