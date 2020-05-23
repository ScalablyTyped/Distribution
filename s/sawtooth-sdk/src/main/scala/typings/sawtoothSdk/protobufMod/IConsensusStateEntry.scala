package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusStateEntry extends js.Object {
  /** ConsensusStateEntry address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** ConsensusStateEntry data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusStateEntry {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | String] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IConsensusStateEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusStateEntry]
  }
}

