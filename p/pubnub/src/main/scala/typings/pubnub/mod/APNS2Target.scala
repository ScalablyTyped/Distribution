package typings.pubnub.mod

import typings.pubnub.pubnubStrings.development
import typings.pubnub.pubnubStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNS2Target extends js.Object {
  var environment: js.UndefOr[development | production] = js.undefined
  var excludedDevices: js.UndefOr[js.Array[String]] = js.undefined
  var topic: String
}

object APNS2Target {
  @scala.inline
  def apply(
    topic: String,
    environment: development | production = null,
    excludedDevices: js.Array[String] = null
  ): APNS2Target = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (excludedDevices != null) __obj.updateDynamic("excludedDevices")(excludedDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Target]
  }
}

