package typings
package reactDashIconDashBaseLib.reactDashIconDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends reactLib.reactMod.ReactNs.SVGProps[reactLib.reactMod.ReactNs.ReactSVGElement] {
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  @JSName("style")
  var style_IconBaseProps: js.UndefOr[js.Any] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGProps: reactLib.reactMod.ReactNs.SVGProps[reactLib.reactMod.ReactNs.ReactSVGElement] = null,
    color: java.lang.String = null,
    size: java.lang.String | scala.Double = null,
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

