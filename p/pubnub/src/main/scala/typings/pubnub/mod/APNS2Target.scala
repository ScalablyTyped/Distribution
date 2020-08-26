package typings.pubnub.mod

import typings.pubnub.pubnubStrings.development
import typings.pubnub.pubnubStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNS2Target extends js.Object {
  var environment: js.UndefOr[development | production] = js.native
  var excludedDevices: js.UndefOr[js.Array[String]] = js.native
  var topic: String = js.native
}

object APNS2Target {
  @scala.inline
  def apply(topic: String): APNS2Target = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Target]
  }
  @scala.inline
  implicit class APNS2TargetOps[Self <: APNS2Target] (val x: Self) extends AnyVal {
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: development | production): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setExcludedDevicesVarargs(value: String*): Self = this.set("excludedDevices", js.Array(value :_*))
    @scala.inline
    def setExcludedDevices(value: js.Array[String]): Self = this.set("excludedDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedDevices: Self = this.set("excludedDevices", js.undefined)
  }
  
}

