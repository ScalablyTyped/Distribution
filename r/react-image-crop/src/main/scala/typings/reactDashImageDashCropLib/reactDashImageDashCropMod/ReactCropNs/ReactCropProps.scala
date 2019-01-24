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

