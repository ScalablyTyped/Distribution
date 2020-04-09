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
  def apply(peerId: Uint8Array = null): IConsensusPeerInfo = {
    val __obj = js.Dynamic.literal()
    if (peerId != null) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusPeerInfo]
  }
}

