package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInviteContent extends js.Object {
  /**
    * An app link target that will be used as a target when the user accepts the invite.
    */
  var applinkUrl: java.lang.String
  /**
    * A URL to a preview image that will be displayed with the app invite.
    * This is optional. If you don't include it, a fallback image will be used.
    */
  var previewImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Promotional code to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 10 characters long and can contain
    * alphanumeric characters only. To set a promo code, you need to set promo text.
    */
  var promotionCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Promotional text to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 80 characters long and can contain
    * alphanumeric and spaces only.
    */
  var promotionText: js.UndefOr[java.lang.String] = js.undefined
}

object AppInviteContent {
  @scala.inline
  def apply(
    applinkUrl: java.lang.String,
    previewImageUrl: java.lang.String = null,
    promotionCode: java.lang.String = null,
    promotionText: java.lang.String = null
  ): AppInviteContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applinkUrl")(applinkUrl)
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl)
    if (promotionCode != null) __obj.updateDynamic("promotionCode")(promotionCode)
    if (promotionText != null) __obj.updateDynamic("promotionText")(promotionText)
    __obj.asInstanceOf[AppInviteContent]
  }
}

