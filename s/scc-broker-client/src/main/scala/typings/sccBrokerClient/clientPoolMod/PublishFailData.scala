package typings.sccBrokerClient.clientPoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishFailData extends js.Object {
  var channel: String = js.native
  var error: Error = js.native
  var poolIndex: Double = js.native
  var targetURI: String = js.native
}

object PublishFailData {
  @scala.inline
  def apply(channel: String, error: Error, poolIndex: Double, targetURI: String): PublishFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFailData]
  }
  @scala.inline
  implicit class PublishFailDataOps[Self <: PublishFailData] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoolIndex(value: Double): Self = this.set("poolIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetURI(value: String): Self = this.set("targetURI", value.asInstanceOf[js.Any])
  }
  
}

