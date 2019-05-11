package typings
package reactDashIconsLib.libEsmIconContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconContext extends js.Object {
  var attr: js.UndefOr[reactLib.reactMod.SVGAttributes[stdLib.SVGElement]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object IconContext {
  @scala.inline
  def apply(
    attr: reactLib.reactMod.SVGAttributes[stdLib.SVGElement] = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    size: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
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

