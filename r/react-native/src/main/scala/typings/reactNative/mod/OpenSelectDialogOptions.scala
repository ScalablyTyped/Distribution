package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenSelectDialogOptions extends js.Object {
  /** Defaults to true */
  var showImages: js.UndefOr[Boolean] = js.native
  /** Defaults to false */
  var showVideos: js.UndefOr[Boolean] = js.native
}

object OpenSelectDialogOptions {
  @scala.inline
  def apply(): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
  @scala.inline
  implicit class OpenSelectDialogOptionsOps[Self <: OpenSelectDialogOptions] (val x: Self) extends AnyVal {
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
    def setShowImages(value: Boolean): Self = this.set("showImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowImages: Self = this.set("showImages", js.undefined)
    @scala.inline
    def setShowVideos(value: Boolean): Self = this.set("showVideos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowVideos: Self = this.set("showVideos", js.undefined)
  }
  
}

