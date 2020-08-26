package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGossipBatchByBatchIdRequest extends js.Object {
  /** GossipBatchByBatchIdRequest id */
  var id: js.UndefOr[String | Null] = js.native
  /** GossipBatchByBatchIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  /** GossipBatchByBatchIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}

object IGossipBatchByBatchIdRequest {
  @scala.inline
  def apply(): IGossipBatchByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchByBatchIdRequest]
  }
  @scala.inline
  implicit class IGossipBatchByBatchIdRequestOps[Self <: IGossipBatchByBatchIdRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setNonceNull: Self = this.set("nonce", null)
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    @scala.inline
    def setTimeToLiveNull: Self = this.set("timeToLive", null)
  }
  
}

