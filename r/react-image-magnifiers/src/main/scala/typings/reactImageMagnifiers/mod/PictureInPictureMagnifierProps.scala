package typings.reactImageMagnifiers.mod

import typings.reactImageMagnifiers.reactImageMagnifiersStrings.bottom
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.left
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.right
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureInPictureMagnifierProps extends CommonProps {
  var cursorStyleActive: js.UndefOr[String] = js.native
  var previewHorizontalPos: js.UndefOr[left | right] = js.native
  var previewOpacity: js.UndefOr[Double] = js.native
  var previewOverlayBackgroundColor: js.UndefOr[String] = js.native
  var previewOverlayBoxColor: js.UndefOr[String] = js.native
  var previewOverlayBoxImage: js.UndefOr[String] = js.native
  var previewOverlayBoxImageSize: js.UndefOr[String] = js.native
  var previewOverlayBoxOpacity: js.UndefOr[Double] = js.native
  var previewOverlayOpacity: js.UndefOr[Double] = js.native
  var previewSizePercentage: js.UndefOr[Double] = js.native
  var previewVerticalPos: js.UndefOr[top | bottom] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var shadowColor: js.UndefOr[String] = js.native
}

object PictureInPictureMagnifierProps {
  @scala.inline
  def apply(imageSrc: String): PictureInPictureMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureMagnifierProps]
  }
  @scala.inline
  implicit class PictureInPictureMagnifierPropsOps[Self <: PictureInPictureMagnifierProps] (val x: Self) extends AnyVal {
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
    def setCursorStyleActive(value: String): Self = this.set("cursorStyleActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStyleActive: Self = this.set("cursorStyleActive", js.undefined)
    @scala.inline
    def setPreviewHorizontalPos(value: left | right): Self = this.set("previewHorizontalPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewHorizontalPos: Self = this.set("previewHorizontalPos", js.undefined)
    @scala.inline
    def setPreviewOpacity(value: Double): Self = this.set("previewOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOpacity: Self = this.set("previewOpacity", js.undefined)
    @scala.inline
    def setPreviewOverlayBackgroundColor(value: String): Self = this.set("previewOverlayBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayBackgroundColor: Self = this.set("previewOverlayBackgroundColor", js.undefined)
    @scala.inline
    def setPreviewOverlayBoxColor(value: String): Self = this.set("previewOverlayBoxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayBoxColor: Self = this.set("previewOverlayBoxColor", js.undefined)
    @scala.inline
    def setPreviewOverlayBoxImage(value: String): Self = this.set("previewOverlayBoxImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayBoxImage: Self = this.set("previewOverlayBoxImage", js.undefined)
    @scala.inline
    def setPreviewOverlayBoxImageSize(value: String): Self = this.set("previewOverlayBoxImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayBoxImageSize: Self = this.set("previewOverlayBoxImageSize", js.undefined)
    @scala.inline
    def setPreviewOverlayBoxOpacity(value: Double): Self = this.set("previewOverlayBoxOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayBoxOpacity: Self = this.set("previewOverlayBoxOpacity", js.undefined)
    @scala.inline
    def setPreviewOverlayOpacity(value: Double): Self = this.set("previewOverlayOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewOverlayOpacity: Self = this.set("previewOverlayOpacity", js.undefined)
    @scala.inline
    def setPreviewSizePercentage(value: Double): Self = this.set("previewSizePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewSizePercentage: Self = this.set("previewSizePercentage", js.undefined)
    @scala.inline
    def setPreviewVerticalPos(value: top | bottom): Self = this.set("previewVerticalPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewVerticalPos: Self = this.set("previewVerticalPos", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
  }
  
}

