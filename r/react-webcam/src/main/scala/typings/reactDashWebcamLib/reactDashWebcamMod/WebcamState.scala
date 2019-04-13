package typings
package reactDashWebcamLib.reactDashWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamState extends js.Object {
  var hasUserMedia: scala.Boolean
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object WebcamState {
  @scala.inline
  def apply(hasUserMedia: scala.Boolean, src: java.lang.String = null): WebcamState = {
    val __obj = js.Dynamic.literal(hasUserMedia = hasUserMedia)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[WebcamState]
  }
}

