package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInviteContent extends js.Object {
  /**
    * An app link target that will be used as a target when the user accepts the invite.
    */
  var applinkUrl: String
  /**
    * A URL to a preview image that will be displayed with the app invite.
    * This is optional. If you don't include it, a fallback image will be used.
    */
  var previewImageUrl: js.UndefOr[String] = js.undefined
  /**
    * Promotional code to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 10 characters long and can contain
    * alphanumeric characters only. To set a promo code, you need to set promo text.
    */
  var promotionCode: js.UndefOr[String] = js.undefined
  /**
    * Promotional text to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 80 characters long and can contain
    * alphanumeric and spaces only.
    */
  var promotionText: js.UndefOr[String] = js.undefined
}

object AppInviteContent {
  @scala.inline
  def apply(
    applinkUrl: String,
    previewImageUrl: String = null,
    promotionCode: String = null,
    promotionText: String = null
  ): AppInviteContent = {
    val __obj = js.Dynamic.literal(applinkUrl = applinkUrl.asInstanceOf[js.Any])
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl.asInstanceOf[js.Any])
    if (promotionCode != null) __obj.updateDynamic("promotionCode")(promotionCode.asInstanceOf[js.Any])
    if (promotionText != null) __obj.updateDynamic("promotionText")(promotionText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInviteContent]
  }
}

