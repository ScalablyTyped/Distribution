package typings.sipJs.simpleUserOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserMedia extends js.Object {
  /**
    * Offer/Answer constraints determine of audio and/or video are utilized.
    * If not specified, only audio is offered (audio is true, video is false).
    */
  var constraints: js.UndefOr[SimpleUserMediaConstraints] = js.undefined
  /** HTML elements for local media streams. */
  var local: js.UndefOr[SimpleUserMediaLocal] = js.undefined
  /** Local HTML media elements. */
  var remote: js.UndefOr[SimpleUserMediaRemote] = js.undefined
}

object SimpleUserMedia {
  @scala.inline
  def apply(
    constraints: SimpleUserMediaConstraints = null,
    local: SimpleUserMediaLocal = null,
    remote: SimpleUserMediaRemote = null
  ): SimpleUserMedia = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserMedia]
  }
}

