package typings.reactWebcam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebcamState extends js.Object {
  var hasUserMedia: Boolean = js.native
  var src: js.UndefOr[String] = js.native
}

object WebcamState {
  @scala.inline
  def apply(hasUserMedia: Boolean): WebcamState = {
    val __obj = js.Dynamic.literal(hasUserMedia = hasUserMedia.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamState]
  }
  @scala.inline
  implicit class WebcamStateOps[Self <: WebcamState] (val x: Self) extends AnyVal {
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
    def setHasUserMedia(value: Boolean): Self = this.set("hasUserMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

