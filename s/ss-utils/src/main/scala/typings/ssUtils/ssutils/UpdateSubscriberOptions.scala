package typings.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubscriberOptions extends js.Object {
  var SubscribeChannels: js.UndefOr[String] = js.undefined
  var UnsubscribeChannels: js.UndefOr[String] = js.undefined
}

object UpdateSubscriberOptions {
  @scala.inline
  def apply(SubscribeChannels: String = null, UnsubscribeChannels: String = null): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    if (SubscribeChannels != null) __obj.updateDynamic("SubscribeChannels")(SubscribeChannels.asInstanceOf[js.Any])
    if (UnsubscribeChannels != null) __obj.updateDynamic("UnsubscribeChannels")(UnsubscribeChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
}

