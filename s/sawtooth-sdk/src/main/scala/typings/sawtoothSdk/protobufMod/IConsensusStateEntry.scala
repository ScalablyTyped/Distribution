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
  def apply(address: String = null, data: Uint8Array = null): IConsensusStateEntry = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusStateEntry]
  }
}

