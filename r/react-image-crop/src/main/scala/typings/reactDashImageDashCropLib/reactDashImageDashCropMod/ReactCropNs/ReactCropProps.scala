package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCropProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var crop: js.UndefOr[Crop] = js.undefined
  var crossorigin: js.UndefOr[
    reactDashImageDashCropLib.reactDashImageDashCropLibStrings.anonymous | reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`use-credentials`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var imageAlt: js.UndefOr[java.lang.String] = js.undefined
  var imageStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var keepSelection: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* pixelCrop */ PixelCrop, scala.Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onImageError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onImageLoaded: js.UndefOr[
    js.Function2[/* target */ reactLib.HTMLImageElement, /* pixelCrop */ PixelCrop, scala.Unit]
  ] = js.undefined
  var src: java.lang.String
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  def onChange(crop: Crop, pixelCrop: PixelCrop): scala.Unit
}

object ReactCropProps {
  @scala.inline
  def apply(
    onChange: js.Function2[Crop, PixelCrop, scala.Unit],
    src: java.lang.String,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    crop: Crop = null,
    crossorigin: reactDashImageDashCropLib.reactDashImageDashCropLibStrings.anonymous | reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`use-credentials` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageAlt: java.lang.String = null,
    imageStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    keepSelection: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    onComplete: js.Function2[/* crop */ Crop, /* pixelCrop */ PixelCrop, scala.Unit] = null,
    onDragEnd: js.Function0[scala.Unit] = null,
    onDragStart: js.Function0[scala.Unit] = null,
    onImageError: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ] = null,
    onImageLoaded: js.Function2[/* target */ reactLib.HTMLImageElement, /* pixelCrop */ PixelCrop, scala.Unit] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ReactCropProps = {
    val __obj = js.Dynamic.literal(onChange = onChange, src = src)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crop != null) __obj.updateDynamic("crop")(crop)
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt)
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle)
    if (!js.isUndefined(keepSelection)) __obj.updateDynamic("keepSelection")(keepSelection)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onImageError != null) __obj.updateDynamic("onImageError")(onImageError)
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(onImageLoaded)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ReactCropProps]
  }
}

