package typings.reactAdal

import typings.reactAdal.reactAdalStrings.adalDotaccessDottokenDotkey
import typings.reactAdal.reactAdalStrings.adalDoterror
import typings.reactAdal.reactAdalStrings.adalDoterrorDotdescription
import typings.reactAdal.reactAdalStrings.adalDotexpirationDotkey
import typings.reactAdal.reactAdalStrings.adalDotidtoken
import typings.reactAdal.reactAdalStrings.adalDotloginDoterror
import typings.reactAdal.reactAdalStrings.adalDotloginDotrequest
import typings.reactAdal.reactAdalStrings.adalDotnonceDotidtoken
import typings.reactAdal.reactAdalStrings.adalDotsessionDotstate
import typings.reactAdal.reactAdalStrings.adalDotstateDotlogin
import typings.reactAdal.reactAdalStrings.adalDotstateDotrenew
import typings.reactAdal.reactAdalStrings.adalDottokenDotkeys
import typings.reactAdal.reactAdalStrings.adalDottokenDotrenewDotstatus
import typings.reactAdal.reactAdalStrings.adalDotusername
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonACCESSTOKENKEY extends js.Object {
  var ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey
  var ERROR: adalDoterror
  var ERROR_DESCRIPTION: adalDoterrorDotdescription
  var EXPIRATION_KEY: adalDotexpirationDotkey
  var IDTOKEN: adalDotidtoken
  var LOGIN_ERROR: adalDotloginDoterror
  var LOGIN_REQUEST: adalDotloginDotrequest
  var NONCE_IDTOKEN: adalDotnonceDotidtoken
  var RENEW_STATUS: adalDottokenDotrenewDotstatus
  var SESSION_STATE: adalDotsessionDotstate
  var STATE_LOGIN: adalDotstateDotlogin
  var STATE_RENEW: adalDotstateDotrenew
  var TOKEN_KEYS: adalDottokenDotkeys
  var USERNAME: adalDotusername
}

object AnonACCESSTOKENKEY {
  @scala.inline
  def apply(
    ACCESS_TOKEN_KEY: adalDotaccessDottokenDotkey,
    ERROR: adalDoterror,
    ERROR_DESCRIPTION: adalDoterrorDotdescription,
    EXPIRATION_KEY: adalDotexpirationDotkey,
    IDTOKEN: adalDotidtoken,
    LOGIN_ERROR: adalDotloginDoterror,
    LOGIN_REQUEST: adalDotloginDotrequest,
    NONCE_IDTOKEN: adalDotnonceDotidtoken,
    RENEW_STATUS: adalDottokenDotrenewDotstatus,
    SESSION_STATE: adalDotsessionDotstate,
    STATE_LOGIN: adalDotstateDotlogin,
    STATE_RENEW: adalDotstateDotrenew,
    TOKEN_KEYS: adalDottokenDotkeys,
    USERNAME: adalDotusername
  ): AnonACCESSTOKENKEY = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN_KEY = ACCESS_TOKEN_KEY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRATION_KEY = EXPIRATION_KEY.asInstanceOf[js.Any], IDTOKEN = IDTOKEN.asInstanceOf[js.Any], LOGIN_ERROR = LOGIN_ERROR.asInstanceOf[js.Any], LOGIN_REQUEST = LOGIN_REQUEST.asInstanceOf[js.Any], NONCE_IDTOKEN = NONCE_IDTOKEN.asInstanceOf[js.Any], RENEW_STATUS = RENEW_STATUS.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STATE_LOGIN = STATE_LOGIN.asInstanceOf[js.Any], STATE_RENEW = STATE_RENEW.asInstanceOf[js.Any], TOKEN_KEYS = TOKEN_KEYS.asInstanceOf[js.Any], USERNAME = USERNAME.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonACCESSTOKENKEY]
  }
}

