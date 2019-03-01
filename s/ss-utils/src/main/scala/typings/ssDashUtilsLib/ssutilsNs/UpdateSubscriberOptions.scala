package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubscriberOptions extends js.Object {
  var SubscribeChannels: js.UndefOr[java.lang.String] = js.undefined
  var UnsubscribeChannels: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateSubscriberOptions {
  @scala.inline
  def apply(SubscribeChannels: java.lang.String = null, UnsubscribeChannels: java.lang.String = null): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    if (SubscribeChannels != null) __obj.updateDynamic("SubscribeChannels")(SubscribeChannels)
    if (UnsubscribeChannels != null) __obj.updateDynamic("UnsubscribeChannels")(UnsubscribeChannels)
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
}

