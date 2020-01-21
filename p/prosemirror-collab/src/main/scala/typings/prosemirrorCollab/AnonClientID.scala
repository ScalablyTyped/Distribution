package typings.prosemirrorCollab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientID extends js.Object {
  var clientID: js.UndefOr[Double | String | Null] = js.undefined
  var version: js.UndefOr[Double | Null] = js.undefined
}

object AnonClientID {
  @scala.inline
  def apply(clientID: Double | String = null, version: Int | Double = null): AnonClientID = {
    val __obj = js.Dynamic.literal()
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientID]
  }
}

