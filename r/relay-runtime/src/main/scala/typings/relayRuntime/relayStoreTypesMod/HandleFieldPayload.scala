package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleFieldPayload extends js.Object {
  // The arguments that were fetched.
  val args: Variables = js.native
  // The __id of the record containing the source/handle field.
  val dataID: DataID = js.native
  // The (storage) key at which the original server data was written.
  val fieldKey: String = js.native
  // The name of the handle.
  val handle: String = js.native
  // The (storage) key at which the handle's data should be written by the
  // handler.
  val handleKey: String = js.native
}

object HandleFieldPayload {
  @scala.inline
  def apply(args: Variables, dataID: DataID, fieldKey: String, handle: String, handleKey: String): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], handleKey = handleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFieldPayload]
  }
  @scala.inline
  implicit class HandleFieldPayloadOps[Self <: HandleFieldPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: Variables): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataID(value: DataID): Self = this.set("dataID", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleKey(value: String): Self = this.set("handleKey", value.asInstanceOf[js.Any])
  }
  
}

