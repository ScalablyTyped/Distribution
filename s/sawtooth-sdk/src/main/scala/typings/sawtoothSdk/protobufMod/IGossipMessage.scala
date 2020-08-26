package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGossipMessage extends js.Object {
  /** GossipMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
  /** GossipMessage contentType */
  var contentType: js.UndefOr[ContentType | Null] = js.native
  /** GossipMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}

object IGossipMessage {
  @scala.inline
  def apply(): IGossipMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipMessage]
  }
  @scala.inline
  implicit class IGossipMessageOps[Self <: IGossipMessage] (val x: Self) extends AnyVal {
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
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setContentTypeNull: Self = this.set("contentType", null)
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    @scala.inline
    def setTimeToLiveNull: Self = this.set("timeToLive", null)
  }
  
}

