package typings.prosemirrorCollab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientID extends js.Object {
  var clientID: js.UndefOr[Double | String | Null] = js.undefined
  var version: js.UndefOr[Double | Null] = js.undefined
}

object ClientID {
  @scala.inline
  def apply(
    clientID: js.UndefOr[Null | Double | String] = js.undefined,
    version: js.UndefOr[Null | Double] = js.undefined
  ): ClientID = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientID)) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientID]
  }
}

