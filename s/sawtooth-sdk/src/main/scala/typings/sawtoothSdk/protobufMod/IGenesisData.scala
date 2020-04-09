package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenesisData extends js.Object {
  /** GenesisData batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}

object IGenesisData {
  @scala.inline
  def apply(batches: js.Array[IBatch] = null): IGenesisData = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenesisData]
  }
}

