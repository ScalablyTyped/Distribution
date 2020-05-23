package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusPeerInfo extends js.Object {
  /** ConsensusPeerInfo peerId */
  var peerId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusPeerInfo {
  @scala.inline
  def apply(peerId: js.UndefOr[Null | Uint8Array] = js.undefined): IConsensusPeerInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(peerId)) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusPeerInfo]
  }
}

