package typings.relayRuntime.relayRuntimeTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfig extends js.Object {
  var force: js.UndefOr[Boolean | Null] = js.native
  var liveConfigId: js.UndefOr[String | Null] = js.native
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  var poll: js.UndefOr[Double | Null] = js.native
  var transactionId: js.UndefOr[String | Null] = js.native
}

object CacheConfig {
  @scala.inline
  def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setForceNull: Self = this.set("force", null)
    @scala.inline
    def setLiveConfigId(value: String): Self = this.set("liveConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveConfigId: Self = this.set("liveConfigId", js.undefined)
    @scala.inline
    def setLiveConfigIdNull: Self = this.set("liveConfigId", null)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPoll(value: Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
    @scala.inline
    def setPollNull: Self = this.set("poll", null)
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    @scala.inline
    def setTransactionIdNull: Self = this.set("transactionId", null)
  }
  
}

