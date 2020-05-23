package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSettingsGetRequest extends js.Object {
  /** ConsensusSettingsGetRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusSettingsGetRequest keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IConsensusSettingsGetRequest {
  @scala.inline
  def apply(
    blockId: js.UndefOr[Null | Uint8Array] = js.undefined,
    keys: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): IConsensusSettingsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSettingsGetRequest]
  }
}

