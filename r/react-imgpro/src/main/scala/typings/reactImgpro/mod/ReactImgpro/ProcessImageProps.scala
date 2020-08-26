package typings.reactImgpro.mod.ReactImgpro

import typings.reactImgpro.anon.Blue
import typings.reactImgpro.anon.Degree
import typings.reactImgpro.anon.Height
import typings.reactImgpro.anon.Horizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[Double] = js.native
  var brightness: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[Blue] = js.native
  var contain: js.UndefOr[Size] = js.native
   /* should be -1 to 1 */ var contrast: js.UndefOr[Double] = js.native
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.native
  var customCdn: js.UndefOr[String] = js.native
  var disableRerender: js.UndefOr[Boolean] = js.native
  var disableWebWorker: js.UndefOr[Boolean] = js.native
  var dither565: js.UndefOr[Boolean] = js.native
   /* should be -1 to 1 */ var fade: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Horizontal] = js.native
  var greyscale: js.UndefOr[Boolean] = js.native
  var image: String = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
   /* should be 0 - 1 */ var opacity: js.UndefOr[Double] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
   /* should be 0 - 100 */ var posterize: js.UndefOr[Double] = js.native
  var quality: js.UndefOr[Double] = js.native
  var resize: js.UndefOr[Shape] = js.native
  var rotate: js.UndefOr[Degree] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var scaleToFitImage: js.UndefOr[Height] = js.native
  var sepia: js.UndefOr[Boolean] = js.native
  var storage: js.UndefOr[Boolean] = js.native
  def onProcessFinish(): Unit = js.native
}

object ProcessImageProps {
  @scala.inline
  def apply(image: String, onProcessFinish: () => Unit): ProcessImageProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    __obj.asInstanceOf[ProcessImageProps]
  }
  @scala.inline
  implicit class ProcessImagePropsOps[Self <: ProcessImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnProcessFinish(value: () => Unit): Self = this.set("onProcessFinish", js.Any.fromFunction0(value))
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    @scala.inline
    def setColors(value: Blue): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setContain(value: Size): Self = this.set("contain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    @scala.inline
    def setCover(value: Size): Self = this.set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    @scala.inline
    def setCustomCdn(value: String): Self = this.set("customCdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCdn: Self = this.set("customCdn", js.undefined)
    @scala.inline
    def setDisableRerender(value: Boolean): Self = this.set("disableRerender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRerender: Self = this.set("disableRerender", js.undefined)
    @scala.inline
    def setDisableWebWorker(value: Boolean): Self = this.set("disableWebWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWebWorker: Self = this.set("disableWebWorker", js.undefined)
    @scala.inline
    def setDither565(value: Boolean): Self = this.set("dither565", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDither565: Self = this.set("dither565", js.undefined)
    @scala.inline
    def setFade(value: Double): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setFlip(value: Horizontal): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setGreyscale(value: Boolean): Self = this.set("greyscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreyscale: Self = this.set("greyscale", js.undefined)
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpaque(value: Boolean): Self = this.set("opaque", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpaque: Self = this.set("opaque", js.undefined)
    @scala.inline
    def setPosterize(value: Double): Self = this.set("posterize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterize: Self = this.set("posterize", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setResize(value: Shape): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRotate(value: Degree): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleToFitImage(value: Height): Self = this.set("scaleToFitImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleToFitImage: Self = this.set("scaleToFitImage", js.undefined)
    @scala.inline
    def setSepia(value: Boolean): Self = this.set("sepia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepia: Self = this.set("sepia", js.undefined)
    @scala.inline
    def setStorage(value: Boolean): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

