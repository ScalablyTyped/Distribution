package typings.reactDashAdal.reactDashAdalMod

import typings.reactDashAdal.Anon_0
import typings.reactDashAdal.Anon_01
import typings.reactDashAdal.Anon_ACCESSTOKENKEY
import typings.reactDashAdal.reactDashAdalNumbers.`483`
import typings.reactDashAdal.reactDashAdalNumbers.`600`
import typings.reactDashAdal.reactDashAdalStrings.Canceled
import typings.reactDashAdal.reactDashAdalStrings.Completed
import typings.reactDashAdal.reactDashAdalStrings.`6000`
import typings.reactDashAdal.reactDashAdalStrings.`In Progress`
import typings.reactDashAdal.reactDashAdalStrings.access_token
import typings.reactDashAdal.reactDashAdalStrings.error_description
import typings.reactDashAdal.reactDashAdalStrings.expires_in
import typings.reactDashAdal.reactDashAdalStrings.id_token
import typings.reactDashAdal.reactDashAdalStrings.session_state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var ACCESS_TOKEN: access_token
  var ERROR_DESCRIPTION: error_description
  var EXPIRES_IN: expires_in
  var ID_TOKEN: id_token
  var LEVEL_STRING_MAP: Anon_01
  var LOADFRAME_TIMEOUT: `6000`
  var LOGGING_LEVEL: Anon_0
  var POPUP_HEIGHT: `600`
  var POPUP_WIDTH: `483`
  var RESOURCE_DELIMETER: typings.reactDashAdal.reactDashAdalStrings.`|`
  var SESSION_STATE: session_state
  var STORAGE: Anon_ACCESSTOKENKEY
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
    LEVEL_STRING_MAP: Anon_01,
    LOADFRAME_TIMEOUT: `6000`,
    LOGGING_LEVEL: Anon_0,
    POPUP_HEIGHT: `600`,
    POPUP_WIDTH: `483`,
    RESOURCE_DELIMETER: typings.reactDashAdal.reactDashAdalStrings.`|`,
    SESSION_STATE: session_state,
    STORAGE: Anon_ACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN, ERROR_DESCRIPTION = ERROR_DESCRIPTION, EXPIRES_IN = EXPIRES_IN, ID_TOKEN = ID_TOKEN, LEVEL_STRING_MAP = LEVEL_STRING_MAP, LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT, LOGGING_LEVEL = LOGGING_LEVEL, POPUP_HEIGHT = POPUP_HEIGHT, POPUP_WIDTH = POPUP_WIDTH, RESOURCE_DELIMETER = RESOURCE_DELIMETER, SESSION_STATE = SESSION_STATE, STORAGE = STORAGE, TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED, TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED, TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS)
  
    __obj.asInstanceOf[Constants]
  }
}

