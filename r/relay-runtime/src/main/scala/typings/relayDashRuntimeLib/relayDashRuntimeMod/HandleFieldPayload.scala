package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFieldPayload extends js.Object {
  val args: Variables
  val dataID: DataID
  val fieldKey: java.lang.String
  val handle: java.lang.String
  val handleKey: java.lang.String
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

