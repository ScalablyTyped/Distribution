package typings.sawtoothSdk.protobufMod.ClientStateListResponse

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Entry. */
trait IEntry extends js.Object {
  /** Entry address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** Entry data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IEntry {
  @scala.inline
  def apply(address: String = null, data: Uint8Array = null): IEntry = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

