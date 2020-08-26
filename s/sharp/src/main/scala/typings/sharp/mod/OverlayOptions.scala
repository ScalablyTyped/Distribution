package typings.sharp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOptions extends js.Object {
  /** how to blend this image with the image below. (optional, default `'over'`) */
  var blend: js.UndefOr[Blend] = js.native
  /** number representing the DPI for vector overlay image. (optional, default 72) */
  var density: js.UndefOr[Double] = js.native
  /** gravity at which to place the overlay. (optional, default 'centre') */
  var gravity: js.UndefOr[Gravity_] = js.native
  /** Buffer containing image data, String containing the path to an image file, or Create object  */
  var input: js.UndefOr[String | Buffer | typings.sharp.anon.Create] = js.native
  /** the pixel offset from the left edge. */
  var left: js.UndefOr[Double] = js.native
  /** Set to true to avoid premultipling the image below. Equivalent to the --premultiplied vips option. */
  var premultiplied: js.UndefOr[Boolean] = js.native
  /** describes overlay when using raw pixel data. */
  var raw: js.UndefOr[Raw] = js.native
  /** set to true to repeat the overlay image across the entire image with the given  gravity. (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.native
  /** the pixel offset from the top edge. */
  var top: js.UndefOr[Double] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
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
    def setBlend(value: Blend): Self = this.set("blend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlend: Self = this.set("blend", js.undefined)
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    @scala.inline
    def setGravity(value: Gravity_): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setInput(value: String | Buffer | typings.sharp.anon.Create): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setPremultiplied(value: Boolean): Self = this.set("premultiplied", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremultiplied: Self = this.set("premultiplied", js.undefined)
    @scala.inline
    def setRaw(value: Raw): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setTile(value: Boolean): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

