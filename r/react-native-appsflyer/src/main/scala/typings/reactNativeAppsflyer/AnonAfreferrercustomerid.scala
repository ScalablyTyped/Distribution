package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.Organic
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`Non-organic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfreferrercustomerid
  extends /* key */ StringDictionary[js.Any] {
  var af_referrer_customer_id: js.UndefOr[String] = js.undefined
  var af_referrer_uid: js.UndefOr[String] = js.undefined
  var af_status: Organic | `Non-organic`
  var is_first_launch: Boolean
  var media_source: String
}

object AnonAfreferrercustomerid {
  @scala.inline
  def apply(
    af_status: Organic | `Non-organic`,
    is_first_launch: Boolean,
    media_source: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    af_referrer_customer_id: String = null,
    af_referrer_uid: String = null
  ): AnonAfreferrercustomerid = {
    val __obj = js.Dynamic.literal(af_status = af_status.asInstanceOf[js.Any], is_first_launch = is_first_launch.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (af_referrer_customer_id != null) __obj.updateDynamic("af_referrer_customer_id")(af_referrer_customer_id.asInstanceOf[js.Any])
    if (af_referrer_uid != null) __obj.updateDynamic("af_referrer_uid")(af_referrer_uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfreferrercustomerid]
  }
}

