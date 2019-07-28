package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends ImgHTMLAttributes[HTMLImageElement] {
  @JSName("alt")
  val alt_ImageProps: String
  @JSName("height")
  val height_ImageProps: js.UndefOr[String] = js.undefined
  val imgStyle: js.UndefOr[CSSProperties] = js.undefined
  val `lazy`: js.UndefOr[Boolean] = js.undefined
  val showIntermediate: js.UndefOr[Boolean] = js.undefined
  @JSName("width")
  val width_ImageProps: js.UndefOr[String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: String,
    ImgHTMLAttributes: ImgHTMLAttributes[HTMLImageElement] = null,
    color: String = null,
    height: String = null,
    imgStyle: CSSProperties = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    showIntermediate: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    width: String = null
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

