package typings.spotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(position: Int | Double = null, uri: String = null): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

