package typings
package reactDashIconsLib.libIconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends reactLib.reactMod.ReactNs.SVGAttributes[stdLib.SVGElement] {
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGAttributes: reactLib.reactMod.ReactNs.SVGAttributes[stdLib.SVGElement] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: java.lang.String = null,
    size: java.lang.String | scala.Double = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}

