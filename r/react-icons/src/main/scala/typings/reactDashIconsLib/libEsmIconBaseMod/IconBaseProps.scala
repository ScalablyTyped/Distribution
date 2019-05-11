package typings
package reactDashIconsLib.libEsmIconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends reactLib.reactMod.SVGAttributes[stdLib.SVGElement] {
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    SVGAttributes: reactLib.reactMod.SVGAttributes[stdLib.SVGElement] = null,
    children: reactLib.reactMod.ReactNode = null,
    color: java.lang.String = null,
    size: java.lang.String | scala.Double = null,
    title: java.lang.String = null
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

