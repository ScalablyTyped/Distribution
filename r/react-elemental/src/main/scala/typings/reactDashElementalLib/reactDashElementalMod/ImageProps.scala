package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends reactLib.reactMod.ImgHTMLAttributes[stdLib.HTMLImageElement] {
  @JSName("alt")
  val alt_ImageProps: java.lang.String
  @JSName("height")
  val height_ImageProps: js.UndefOr[java.lang.String] = js.undefined
  val imgStyle: js.UndefOr[js.Object] = js.undefined
  val `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  val showIntermediate: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("width")
  val width_ImageProps: js.UndefOr[java.lang.String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: java.lang.String,
    ImgHTMLAttributes: reactLib.reactMod.ImgHTMLAttributes[stdLib.HTMLImageElement] = null,
    color: java.lang.String = null,
    height: java.lang.String = null,
    imgStyle: js.Object = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    showIntermediate: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    width: java.lang.String = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt)
    js.Dynamic.global.Object.assign(__obj, ImgHTMLAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height)
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(showIntermediate)) __obj.updateDynamic("showIntermediate")(showIntermediate)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ImageProps]
  }
}

