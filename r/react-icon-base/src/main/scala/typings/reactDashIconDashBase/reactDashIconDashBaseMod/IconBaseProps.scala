package typings.reactDashIconDashBase.reactDashIconDashBaseMod

import typings.react.reactMod.ReactSVGElement
import typings.react.reactMod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps extends SVGProps[ReactSVGElement] {
  var size: js.UndefOr[String | Double] = js.undefined
  @JSName("style")
  var style_IconBaseProps: js.UndefOr[js.Any] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGProps: SVGProps[ReactSVGElement] = null,
    color: String = null,
    size: String | Double = null,
    style: js.Any = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGProps)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconBaseProps]
  }
}

