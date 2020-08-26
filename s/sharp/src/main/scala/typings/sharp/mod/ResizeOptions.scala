package typings.sharp.mod

import typings.sharp.sharpStrings.contain
import typings.sharp.sharpStrings.cover
import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.fill
import typings.sharp.sharpStrings.inside
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import typings.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeOptions extends js.Object {
  /** Background colour when using a fit of contain, parsed by the color module, defaults to black without transparency. (optional, default {r:0,g:0,b:0,alpha:1}) */
  var background: js.UndefOr[Color] = js.native
  /** Take greater advantage of the JPEG and WebP shrink-on-load feature, which can lead to a slight moiré pattern on some images. (optional, default true) */
  var fastShrinkOnLoad: js.UndefOr[Boolean] = js.native
  /** How the image should be resized to fit both provided dimensions, one of cover, contain, fill, inside or outside. (optional, default 'cover') */
  var fit: js.UndefOr[contain | cover | fill | inside | outside] = js.native
  /** Alternative means of specifying height. If both are present this take priority. */
  var height: js.UndefOr[Double] = js.native
  /** The kernel to use for image reduction. (optional, default 'lanczos3') */
  var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.native
  /** Position, gravity or strategy to use when fit is cover or contain. (optional, default 'centre') */
  var position: js.UndefOr[Double | String] = js.native
  /** Alternative means of specifying width. If both are present this take priority. */
  var width: js.UndefOr[Double] = js.native
  /** Do not enlarge if the width or height are already less than the specified dimensions, equivalent to GraphicsMagick's > geometry option. (optional, default false) */
  var withoutEnlargement: js.UndefOr[Boolean] = js.native
}

object ResizeOptions {
  @scala.inline
  def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  @scala.inline
  implicit class ResizeOptionsOps[Self <: ResizeOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setFastShrinkOnLoad(value: Boolean): Self = this.set("fastShrinkOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastShrinkOnLoad: Self = this.set("fastShrinkOnLoad", js.undefined)
    @scala.inline
    def setFit(value: contain | cover | fill | inside | outside): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = this.set("kernel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernel: Self = this.set("kernel", js.undefined)
    @scala.inline
    def setPosition(value: Double | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWithoutEnlargement(value: Boolean): Self = this.set("withoutEnlargement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutEnlargement: Self = this.set("withoutEnlargement", js.undefined)
  }
  
}

