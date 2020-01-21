package typings.reactAdal.mod

import typings.reactAdal.Anon0
import typings.reactAdal.Anon01
import typings.reactAdal.AnonACCESSTOKENKEY
import typings.reactAdal.reactAdalNumbers.`483`
import typings.reactAdal.reactAdalNumbers.`600`
import typings.reactAdal.reactAdalStrings.Canceled
import typings.reactAdal.reactAdalStrings.Completed
import typings.reactAdal.reactAdalStrings.Verticalline
import typings.reactAdal.reactAdalStrings.`6000`
import typings.reactAdal.reactAdalStrings.`In Progress`
import typings.reactAdal.reactAdalStrings.access_token
import typings.reactAdal.reactAdalStrings.error_description
import typings.reactAdal.reactAdalStrings.expires_in
import typings.reactAdal.reactAdalStrings.id_token
import typings.reactAdal.reactAdalStrings.session_state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var ACCESS_TOKEN: access_token
  var ERROR_DESCRIPTION: error_description
  var EXPIRES_IN: expires_in
  var ID_TOKEN: id_token
  var LEVEL_STRING_MAP: Anon01
  var LOADFRAME_TIMEOUT: `6000`
  var LOGGING_LEVEL: Anon0
  var POPUP_HEIGHT: `600`
  var POPUP_WIDTH: `483`
  var RESOURCE_DELIMETER: Verticalline
  var SESSION_STATE: session_state
  var STORAGE: AnonACCESSTOKENKEY
  var TOKEN_RENEW_STATUS_CANCELED: Canceled
  var TOKEN_RENEW_STATUS_COMPLETED: Completed
  var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: access_token,
    ERROR_DESCRIPTION: error_description,
    EXPIRES_IN: expires_in,
    ID_TOKEN: id_token,
    LEVEL_STRING_MAP: Anon01,
    LOADFRAME_TIMEOUT: `6000`,
    LOGGING_LEVEL: Anon0,
    POPUP_HEIGHT: `600`,
    POPUP_WIDTH: `483`,
    RESOURCE_DELIMETER: Verticalline,
    SESSION_STATE: session_state,
    STORAGE: AnonACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRES_IN = EXPIRES_IN.asInstanceOf[js.Any], ID_TOKEN = ID_TOKEN.asInstanceOf[js.Any], LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT.asInstanceOf[js.Any], LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = POPUP_HEIGHT.asInstanceOf[js.Any], POPUP_WIDTH = POPUP_WIDTH.asInstanceOf[js.Any], RESOURCE_DELIMETER = RESOURCE_DELIMETER.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

