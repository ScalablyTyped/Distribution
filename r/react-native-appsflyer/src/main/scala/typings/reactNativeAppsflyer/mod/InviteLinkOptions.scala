package typings.reactNativeAppsflyer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteLinkOptions extends js.Object {
  var baseDeeplink: js.UndefOr[String] = js.undefined
  var campaign: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var customerID: js.UndefOr[String] = js.undefined
  var deeplinkPath: js.UndefOr[String] = js.undefined
  var referrerImageUrl: js.UndefOr[String] = js.undefined
  var referrerName: js.UndefOr[String] = js.undefined
  var userParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object InviteLinkOptions {
  @scala.inline
  def apply(
    baseDeeplink: String = null,
    campaign: String = null,
    channel: String = null,
    customerID: String = null,
    deeplinkPath: String = null,
    referrerImageUrl: String = null,
    referrerName: String = null,
    userParams: StringDictionary[js.Any] = null
  ): InviteLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDeeplink != null) __obj.updateDynamic("baseDeeplink")(baseDeeplink.asInstanceOf[js.Any])
    if (campaign != null) __obj.updateDynamic("campaign")(campaign.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (customerID != null) __obj.updateDynamic("customerID")(customerID.asInstanceOf[js.Any])
    if (deeplinkPath != null) __obj.updateDynamic("deeplinkPath")(deeplinkPath.asInstanceOf[js.Any])
    if (referrerImageUrl != null) __obj.updateDynamic("referrerImageUrl")(referrerImageUrl.asInstanceOf[js.Any])
    if (referrerName != null) __obj.updateDynamic("referrerName")(referrerName.asInstanceOf[js.Any])
    if (userParams != null) __obj.updateDynamic("userParams")(userParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteLinkOptions]
  }
}

