package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsServer extends js.Object {
  /**
    * `true` if this is agent is handling a ShareDB client in the same
    * Node process.
    */
  var isServer: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsServer {
  @scala.inline
  def apply(isServer: js.UndefOr[Boolean] = js.undefined): Anon_IsServer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServer)) __obj.updateDynamic("isServer")(isServer)
    __obj.asInstanceOf[Anon_IsServer]
  }
}

