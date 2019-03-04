package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFieldPayload extends js.Object {
  // The arguments that were fetched.
  var args: Variables
  // The __id of the record containing the source/handle field.
  var dataID: DataID
  // The (storage) key at which the original server data was written.
  var fieldKey: java.lang.String
  // The name of the handle
  var handle: java.lang.String
  // The (storage) key at which the handle's data should be written by the
  // handler
  var handleKey: java.lang.String
}

object HandleFieldPayload {
  @scala.inline
  def apply(
    args: Variables,
    dataID: DataID,
    fieldKey: java.lang.String,
    handle: java.lang.String,
    handleKey: java.lang.String
  ): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args, dataID = dataID, fieldKey = fieldKey, handle = handle, handleKey = handleKey)
  
    __obj.asInstanceOf[HandleFieldPayload]
  }
}

