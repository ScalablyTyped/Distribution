package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenCameraDialogOptions extends js.Object {
  /** Defaults to false */
  var videoMode: js.UndefOr[Boolean] = js.native
}

object OpenCameraDialogOptions {
  @scala.inline
  def apply(): OpenCameraDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCameraDialogOptions]
  }
  @scala.inline
  implicit class OpenCameraDialogOptionsOps[Self <: OpenCameraDialogOptions] (val x: Self) extends AnyVal {
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
    def setVideoMode(value: Boolean): Self = this.set("videoMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoMode: Self = this.set("videoMode", js.undefined)
  }
  
}

