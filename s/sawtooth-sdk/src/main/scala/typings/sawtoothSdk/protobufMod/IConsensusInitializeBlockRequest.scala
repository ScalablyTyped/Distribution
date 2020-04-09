package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusInitializeBlockRequest extends js.Object {
  /** ConsensusInitializeBlockRequest previousId */
  var previousId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusInitializeBlockRequest {
  @scala.inline
  def apply(previousId: Uint8Array = null): IConsensusInitializeBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (previousId != null) __obj.updateDynamic("previousId")(previousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusInitializeBlockRequest]
  }
}

