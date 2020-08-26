package typings.reactNative.mod

import typings.reactNative.anon.Height
import typings.reactNative.anon.X
import typings.reactNative.reactNativeStrings.contain
import typings.reactNative.reactNativeStrings.cover
import typings.reactNative.reactNativeStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCropData extends js.Object {
  /**
    * (Optional) size to scale the cropped image to.
    */
  var displaySize: js.UndefOr[Height] = js.native
  /**
    * The top-left corner of the cropped image, specified in the original
    * image's coordinate space.
    */
  var offset: X = js.native
  /**
    * (Optional) the resizing mode to use when scaling the image. If the
    * `displaySize` param is not specified, this has no effect.
    */
  var resizeMode: js.UndefOr[contain | cover | stretch] = js.native
  /**
    * The size (dimensions) of the cropped image, specified in the original
    * image's coordinate space.
    */
  var size: Height = js.native
}

object ImageCropData {
  @scala.inline
  def apply(offset: X, size: Height): ImageCropData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCropData]
  }
  @scala.inline
  implicit class ImageCropDataOps[Self <: ImageCropData] (val x: Self) extends AnyVal {
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
    def setOffset(value: X): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplaySize(value: Height): Self = this.set("displaySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaySize: Self = this.set("displaySize", js.undefined)
    @scala.inline
    def setResizeMode(value: contain | cover | stretch): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
  }
  
}

