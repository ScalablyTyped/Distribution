package typings.reactWebcam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamState extends js.Object {
  var hasUserMedia: Boolean
  var src: js.UndefOr[String] = js.undefined
}

object WebcamState {
  @scala.inline
  def apply(hasUserMedia: Boolean, src: String = null): WebcamState = {
    val __obj = js.Dynamic.literal(hasUserMedia = hasUserMedia.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamState]
  }
}

