package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGossipBlockResponse extends js.Object {
  /** GossipBlockResponse content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
}

object IGossipBlockResponse {
  @scala.inline
  def apply(): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockResponse]
  }
  @scala.inline
  implicit class IGossipBlockResponseOps[Self <: IGossipBlockResponse] (val x: Self) extends AnyVal {
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
  }
  
}

