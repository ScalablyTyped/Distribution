package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFieldPayload extends js.Object {
  // The arguments that were fetched.
  val args: Variables
  // The __id of the record containing the source/handle field.
  val dataID: DataID
  // The (storage) key at which the original server data was written.
  val fieldKey: String
  // The name of the handle.
  val handle: String
  // The (storage) key at which the handle's data should be written by the
  // handler.
  val handleKey: String
}

object HandleFieldPayload {
  @scala.inline
  def apply(args: Variables, dataID: DataID, fieldKey: String, handle: String, handleKey: String): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], handleKey = handleKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandleFieldPayload]
  }
}

