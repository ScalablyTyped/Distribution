package typings.reactImgpro.mod.ReactImgpro

import typings.reactImgpro.anon.Blue
import typings.reactImgpro.anon.Degree
import typings.reactImgpro.anon.Height
import typings.reactImgpro.anon.Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[Double] = js.undefined
  var brightness: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[Blue] = js.undefined
  var contain: js.UndefOr[Size] = js.undefined
   /* should be -1 to 1 */ var contrast: js.UndefOr[Double] = js.undefined
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.undefined
  var customCdn: js.UndefOr[String] = js.undefined
  var disableRerender: js.UndefOr[Boolean] = js.undefined
  var disableWebWorker: js.UndefOr[Boolean] = js.undefined
  var dither565: js.UndefOr[Boolean] = js.undefined
   /* should be -1 to 1 */ var fade: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Horizontal] = js.undefined
  var greyscale: js.UndefOr[Boolean] = js.undefined
  var image: String
  var invert: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 1 */ var opacity: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 100 */ var posterize: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var resize: js.UndefOr[Shape] = js.undefined
  var rotate: js.UndefOr[Degree] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var scaleToFitImage: js.UndefOr[Height] = js.undefined
  var sepia: js.UndefOr[Boolean] = js.undefined
  var storage: js.UndefOr[Boolean] = js.undefined
  def onProcessFinish(): Unit
}

object ProcessImageProps {
  @scala.inline
  def apply(
    image: String,
    onProcessFinish: () => Unit,
    blur: js.UndefOr[Double] = js.undefined,
    brightness: js.UndefOr[Double] = js.undefined,
    colors: Blue = null,
    contain: Size = null,
    contrast: js.UndefOr[Double] = js.undefined,
    cover: Size = null,
    customCdn: String = null,
    disableRerender: js.UndefOr[Boolean] = js.undefined,
    disableWebWorker: js.UndefOr[Boolean] = js.undefined,
    dither565: js.UndefOr[Boolean] = js.undefined,
    fade: js.UndefOr[Double] = js.undefined,
    flip: Horizontal = null,
    greyscale: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    opaque: js.UndefOr[Boolean] = js.undefined,
    posterize: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    resize: Shape = null,
    rotate: Degree = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    scaleToFitImage: Height = null,
    sepia: js.UndefOr[Boolean] = js.undefined,
    storage: js.UndefOr[Boolean] = js.undefined
  ): ProcessImageProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (contain != null) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (customCdn != null) __obj.updateDynamic("customCdn")(customCdn.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRerender)) __obj.updateDynamic("disableRerender")(disableRerender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebWorker)) __obj.updateDynamic("disableWebWorker")(disableWebWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dither565)) __obj.updateDynamic("dither565")(dither565.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.get.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posterize)) __obj.updateDynamic("posterize")(posterize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (scaleToFitImage != null) __obj.updateDynamic("scaleToFitImage")(scaleToFitImage.asInstanceOf[js.Any])
    if (!js.isUndefined(sepia)) __obj.updateDynamic("sepia")(sepia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessImageProps]
  }
}

