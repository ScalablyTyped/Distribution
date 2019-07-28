package typings.reactDashPlaidDashLink

import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.API_ERROR
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.ASSET_REPORT_ERROR
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.INSTITUTION_ERROR
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.INVALID_INPUT
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.INVALID_REQUEST
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.ITEM_ERROR
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.RATE_LIMIT_EXCEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APIERROR extends js.Object {
  var display_message: String | Null
  var error_code: String
  var error_message: String
  var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
}

object Anon_APIERROR {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR,
    display_message: String = null
  ): Anon_APIERROR = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, error_type = error_type.asInstanceOf[js.Any])
    if (display_message != null) __obj.updateDynamic("display_message")(display_message)
    __obj.asInstanceOf[Anon_APIERROR]
  }
}

