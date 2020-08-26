package typings.reactPlaidLink.anon

import typings.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.CONNECTED
import typings.reactPlaidLink.reactPlaidLinkStrings.CREDENTIAL
import typings.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typings.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typings.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.LOADING
import typings.reactPlaidLink.reactPlaidLinkStrings.MFA
import typings.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import typings.reactPlaidLink.reactPlaidLinkStrings.RECAPTCHA
import typings.reactPlaidLink.reactPlaidLinkStrings.SELECT_ACCOUNT
import typings.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errorcode extends js.Object {
  var error_code: js.UndefOr[String | Null] = js.native
  var error_message: js.UndefOr[String | Null] = js.native
  var error_type: js.UndefOr[
    INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR | Null
  ] = js.native
  var exit_status: js.UndefOr[String | Double | Null] = js.native
  var institution_id: String = js.native
  var institution_name: String = js.native
  var institution_search_query: js.UndefOr[String | Null] = js.native
  var link_session_id: String = js.native
  var mfa_type: js.UndefOr[String | Null] = js.native
  var request_id: String = js.native
  var timestamp: String = js.native
  var view_name: js.UndefOr[
    CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION | Null
  ] = js.native
}

object Errorcode {
  @scala.inline
  def apply(
    institution_id: String,
    institution_name: String,
    link_session_id: String,
    request_id: String,
    timestamp: String
  ): Errorcode = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcode]
  }
  @scala.inline
  implicit class ErrorcodeOps[Self <: Errorcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstitution_id(value: String): Self = this.set("institution_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstitution_name(value: String): Self = this.set("institution_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_session_id(value: String): Self = this.set("link_session_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_code: Self = this.set("error_code", js.undefined)
    @scala.inline
    def setError_codeNull: Self = this.set("error_code", null)
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_message: Self = this.set("error_message", js.undefined)
    @scala.inline
    def setError_messageNull: Self = this.set("error_message", null)
    @scala.inline
    def setError_type(
      value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Self = this.set("error_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_type: Self = this.set("error_type", js.undefined)
    @scala.inline
    def setError_typeNull: Self = this.set("error_type", null)
    @scala.inline
    def setExit_status(value: String | Double): Self = this.set("exit_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit_status: Self = this.set("exit_status", js.undefined)
    @scala.inline
    def setExit_statusNull: Self = this.set("exit_status", null)
    @scala.inline
    def setInstitution_search_query(value: String): Self = this.set("institution_search_query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstitution_search_query: Self = this.set("institution_search_query", js.undefined)
    @scala.inline
    def setInstitution_search_queryNull: Self = this.set("institution_search_query", null)
    @scala.inline
    def setMfa_type(value: String): Self = this.set("mfa_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfa_type: Self = this.set("mfa_type", js.undefined)
    @scala.inline
    def setMfa_typeNull: Self = this.set("mfa_type", null)
    @scala.inline
    def setView_name(
      value: CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION
    ): Self = this.set("view_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView_name: Self = this.set("view_name", js.undefined)
    @scala.inline
    def setView_nameNull: Self = this.set("view_name", null)
  }
  
}

