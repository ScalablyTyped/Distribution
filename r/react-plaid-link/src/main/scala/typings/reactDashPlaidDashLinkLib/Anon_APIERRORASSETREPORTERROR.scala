package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APIERRORASSETREPORTERROR extends js.Object {
  var error_code: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var error_message: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var error_type: js.UndefOr[
    reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_REQUEST | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_INPUT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INSTITUTION_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RATE_LIMIT_EXCEEDED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.API_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ITEM_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ASSET_REPORT_ERROR | scala.Null
  ] = js.undefined
  var exit_status: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  var institution_id: java.lang.String
  var institution_name: java.lang.String
  var institution_search_query: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var link_session_id: java.lang.String
  var mfa_type: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var request_id: java.lang.String
  var timestamp: java.lang.String
  var view_name: js.UndefOr[
    reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.CONNECTED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.CREDENTIAL | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.EXIT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.LOADING | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.MFA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RECAPTCHA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_ACCOUNT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_INSTITUTION | scala.Null
  ] = js.undefined
}

object Anon_APIERRORASSETREPORTERROR {
  @scala.inline
  def apply(
    institution_id: java.lang.String,
    institution_name: java.lang.String,
    link_session_id: java.lang.String,
    request_id: java.lang.String,
    timestamp: java.lang.String,
    error_code: java.lang.String = null,
    error_message: java.lang.String = null,
    error_type: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_REQUEST | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INVALID_INPUT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.INSTITUTION_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RATE_LIMIT_EXCEEDED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.API_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ITEM_ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ASSET_REPORT_ERROR = null,
    exit_status: java.lang.String | scala.Double = null,
    institution_search_query: java.lang.String = null,
    mfa_type: java.lang.String = null,
    view_name: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.CONNECTED | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.CREDENTIAL | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.ERROR | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.EXIT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.LOADING | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.MFA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.RECAPTCHA | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_ACCOUNT | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.SELECT_INSTITUTION = null
  ): Anon_APIERRORASSETREPORTERROR = {
    val __obj = js.Dynamic.literal(institution_id = institution_id, institution_name = institution_name, link_session_id = link_session_id, request_id = request_id, timestamp = timestamp)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code)
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    if (error_type != null) __obj.updateDynamic("error_type")(error_type.asInstanceOf[js.Any])
    if (exit_status != null) __obj.updateDynamic("exit_status")(exit_status.asInstanceOf[js.Any])
    if (institution_search_query != null) __obj.updateDynamic("institution_search_query")(institution_search_query)
    if (mfa_type != null) __obj.updateDynamic("mfa_type")(mfa_type)
    if (view_name != null) __obj.updateDynamic("view_name")(view_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_APIERRORASSETREPORTERROR]
  }
}

