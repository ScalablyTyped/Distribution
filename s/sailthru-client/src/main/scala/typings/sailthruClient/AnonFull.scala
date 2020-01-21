package typings.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: js.UndefOr[AnonUrl] = js.undefined
  var thumb: js.UndefOr[AnonUrl] = js.undefined
}

object AnonFull {
  @scala.inline
  def apply(full: AnonUrl = null, thumb: AnonUrl = null): AnonFull = {
    val __obj = js.Dynamic.literal()
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
}

