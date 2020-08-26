package typings.reactNativeMaps.mod

import typings.reactNativeMaps.reactNativeMapsStrings.base64
import typings.reactNativeMaps.reactNativeMapsStrings.file
import typings.reactNativeMaps.reactNativeMapsStrings.jpg
import typings.reactNativeMaps.reactNativeMapsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptions extends js.Object {
  /** image formats, defaults to 'png' */
  var format: js.UndefOr[png | jpg] = js.native
  /** optional, when omitted the view-height is used */
  var height: js.UndefOr[Double] = js.native
  /** image quality: 0..1 (only relevant for jpg, default: 1) */
  var quality: js.UndefOr[Double] = js.native
  /** __iOS only__, optional region to render */
  var region: js.UndefOr[Region] = js.native
  /** result types, defaults to 'file' */
  var result: js.UndefOr[file | base64] = js.native
  /** optional, when omitted the view-width is used */
  var width: js.UndefOr[Double] = js.native
}

object SnapshotOptions {
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: png | jpg): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setResult(value: file | base64): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

