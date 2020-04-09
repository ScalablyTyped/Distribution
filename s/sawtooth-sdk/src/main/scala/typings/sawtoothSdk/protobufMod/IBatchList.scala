package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchList extends js.Object {
  /** BatchList batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}

object IBatchList {
  @scala.inline
  def apply(batches: js.Array[IBatch] = null): IBatchList = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchList]
  }
}

