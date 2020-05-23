package typings.sawtoothSdk.protobufMod.ClientStatusGetResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Peer. */
trait IPeer extends js.Object {
  /** Peer endpoint */
  var endpoint: js.UndefOr[String | Null] = js.undefined
}

object IPeer {
  @scala.inline
  def apply(endpoint: js.UndefOr[Null | String] = js.undefined): IPeer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endpoint)) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeer]
  }
}

