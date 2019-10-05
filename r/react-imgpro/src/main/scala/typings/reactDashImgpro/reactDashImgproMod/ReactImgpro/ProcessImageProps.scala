package typings.reactDashImgpro.reactDashImgproMod.ReactImgpro

import typings.reactDashImgpro.Anon_Blue
import typings.reactDashImgpro.Anon_Degree
import typings.reactDashImgpro.Anon_Height
import typings.reactDashImgpro.Anon_Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[Double] = js.undefined
  var brightness: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[Anon_Blue] = js.undefined
  var contain: js.UndefOr[Size] = js.undefined
   /* should be -1 to 1 */ var contrast: js.UndefOr[Double] = js.undefined
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.undefined
  var customCdn: js.UndefOr[String] = js.undefined
  var disableRerender: js.UndefOr[Boolean] = js.undefined
  var disableWebWorker: js.UndefOr[Boolean] = js.undefined
  var dither565: js.UndefOr[Boolean] = js.undefined
   /* should be -1 to 1 */ var fade: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Anon_Horizontal] = js.undefined
  var greyscale: js.UndefOr[Boolean] = js.undefined
  var image: String
  var invert: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 1 */ var opacity: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 100 */ var posterize: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var resize: js.UndefOr[Shape] = js.undefined
  var rotate: js.UndefOr[Anon_Degree] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var scaleToFitImage: js.UndefOr[Anon_Height] = js.undefined
  var sepia: js.UndefOr[Boolean] = js.undefined
  var storage: js.UndefOr[Boolean] = js.undefined
  def onProcessFinish(): Unit
}

object ProcessImageProps {
  @scala.inline
  def apply(
    image: String,
    onProcessFinish: () => Unit,
    blur: Int | Double = null,
    brightness: Int | Double = null,
    colors: Anon_Blue = null,
    contain: Size = null,
    contrast: Int | Double = null,
    cover: Size = null,
    customCdn: String = null,
    disableRerender: js.UndefOr[Boolean] = js.undefined,
    disableWebWorker: js.UndefOr[Boolean] = js.undefined,
    dither565: js.UndefOr[Boolean] = js.undefined,
    fade: Int | Double = null,
    flip: Anon_Horizontal = null,
    greyscale: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    posterize: Int | Double = null,
    quality: Int | Double = null,
    resize: Shape = null,
    rotate: Anon_Degree = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    scaleToFitImage: Anon_Height = null,
    sepia: js.UndefOr[Boolean] = js.undefined,
    storage: js.UndefOr[Boolean] = js.undefined
  ): ProcessImageProps = {
    val __obj = js.Dynamic.literal(image = image, onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (contain != null) __obj.updateDynamic("contain")(contain)
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover)
    if (customCdn != null) __obj.updateDynamic("customCdn")(customCdn)
    if (!js.isUndefined(disableRerender)) __obj.updateDynamic("disableRerender")(disableRerender)
    if (!js.isUndefined(disableWebWorker)) __obj.updateDynamic("disableWebWorker")(disableWebWorker)
    if (!js.isUndefined(dither565)) __obj.updateDynamic("dither565")(dither565)
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (posterize != null) __obj.updateDynamic("posterize")(posterize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (scaleToFitImage != null) __obj.updateDynamic("scaleToFitImage")(scaleToFitImage)
    if (!js.isUndefined(sepia)) __obj.updateDynamic("sepia")(sepia)
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[ProcessImageProps]
  }
}

