package typings.prosemirrorDashCollab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientID extends js.Object {
  var clientID: js.UndefOr[Double | String | Null] = js.undefined
  var version: js.UndefOr[Double | Null] = js.undefined
}

object Anon_ClientID {
  @scala.inline
  def apply(clientID: Double | String = null, version: Int | Double = null): Anon_ClientID = {
    val __obj = js.Dynamic.literal()
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientID]
  }
}

