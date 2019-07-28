package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFieldPayload extends js.Object {
  val args: Variables
  val dataID: DataID
  val fieldKey: String
  val handle: String
  val handleKey: String
}

object HandleFieldPayload {
  @scala.inline
  def apply(args: Variables, dataID: DataID, fieldKey: String, handle: String, handleKey: String): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args, dataID = dataID, fieldKey = fieldKey, handle = handle, handleKey = handleKey)
  
    __obj.asInstanceOf[HandleFieldPayload]
  }
}

