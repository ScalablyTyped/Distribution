package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsServer extends js.Object {
  /**
    * `true` if this is agent is handling a ShareDB client in the same
    * Node process.
    */
  var isServer: js.UndefOr[Boolean] = js.undefined
}

object AnonIsServer {
  @scala.inline
  def apply(isServer: js.UndefOr[Boolean] = js.undefined): AnonIsServer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServer)) __obj.updateDynamic("isServer")(isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsServer]
  }
}

