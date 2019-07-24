package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APIERROR extends js.Object {
  var display_message: java.lang.String | scala.Null
  var error_code: java.lang.String
  var error_message: java.lang.String
  var error_type: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_REQUEST | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_INPUT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INSTITUTION_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RATE_LIMIT_EXCEEDED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.API_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ITEM_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ASSET_REPORT_ERROR
}

object Anon_APIERROR {
  @scala.inline
  def apply(
    error_code: java.lang.String,
    error_message: java.lang.String,
    error_type: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_REQUEST | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_INPUT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INSTITUTION_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RATE_LIMIT_EXCEEDED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.API_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ITEM_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ASSET_REPORT_ERROR,
    display_message: java.lang.String = null
  ): Anon_APIERROR = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, error_type = error_type.asInstanceOf[js.Any])
    if (display_message != null) __obj.updateDynamic("display_message")(display_message)
    __obj.asInstanceOf[Anon_APIERROR]
  }
}

