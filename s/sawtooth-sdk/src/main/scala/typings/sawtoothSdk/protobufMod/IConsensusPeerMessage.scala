package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusPeerMessage extends js.Object {
  /** ConsensusPeerMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
  /** ConsensusPeerMessage messageType */
  var messageType: js.UndefOr[String | Null] = js.native
  /** ConsensusPeerMessage name */
  var name: js.UndefOr[String | Null] = js.native
  /** ConsensusPeerMessage version */
  var version: js.UndefOr[String | Null] = js.native
}

object IConsensusPeerMessage {
  @scala.inline
  def apply(): IConsensusPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusPeerMessage]
  }
  @scala.inline
  implicit class IConsensusPeerMessageOps[Self <: IConsensusPeerMessage] (val x: Self) extends AnyVal {
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
    def setContent(value: Uint8Array): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    @scala.inline
    def setMessageTypeNull: Self = this.set("messageType", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
  
}

