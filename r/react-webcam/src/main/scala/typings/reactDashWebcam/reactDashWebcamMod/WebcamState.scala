package typings.reactDashWebcam.reactDashWebcamMod

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
    val __obj = js.Dynamic.literal(hasUserMedia = hasUserMedia)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[WebcamState]
  }
}

