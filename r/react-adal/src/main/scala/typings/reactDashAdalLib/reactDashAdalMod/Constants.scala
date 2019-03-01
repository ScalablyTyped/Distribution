package typings
package reactDashAdalLib.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var ACCESS_TOKEN: reactDashAdalLib.reactDashAdalLibStrings.access_token
  var ERROR_DESCRIPTION: reactDashAdalLib.reactDashAdalLibStrings.error_description
  var EXPIRES_IN: reactDashAdalLib.reactDashAdalLibStrings.expires_in
  var ID_TOKEN: reactDashAdalLib.reactDashAdalLibStrings.id_token
  var LEVEL_STRING_MAP: reactDashAdalLib.Anon_01
  var LOADFRAME_TIMEOUT: reactDashAdalLib.reactDashAdalLibStrings.`6000`
  var LOGGING_LEVEL: reactDashAdalLib.Anon_0
  var POPUP_HEIGHT: reactDashAdalLib.reactDashAdalLibNumbers.`600`
  var POPUP_WIDTH: reactDashAdalLib.reactDashAdalLibNumbers.`483`
  var RESOURCE_DELIMETER: reactDashAdalLib.reactDashAdalLibStrings.`|`
  var SESSION_STATE: reactDashAdalLib.reactDashAdalLibStrings.session_state
  var STORAGE: reactDashAdalLib.Anon_ACCESSTOKENKEY
  var TOKEN_RENEW_STATUS_CANCELED: reactDashAdalLib.reactDashAdalLibStrings.Canceled
  var TOKEN_RENEW_STATUS_COMPLETED: reactDashAdalLib.reactDashAdalLibStrings.Completed
  var TOKEN_RENEW_STATUS_IN_PROGRESS: reactDashAdalLib.reactDashAdalLibStrings.`In Progress`
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: reactDashAdalLib.reactDashAdalLibStrings.access_token,
    ERROR_DESCRIPTION: reactDashAdalLib.reactDashAdalLibStrings.error_description,
    EXPIRES_IN: reactDashAdalLib.reactDashAdalLibStrings.expires_in,
    ID_TOKEN: reactDashAdalLib.reactDashAdalLibStrings.id_token,
    LEVEL_STRING_MAP: reactDashAdalLib.Anon_01,
    LOADFRAME_TIMEOUT: reactDashAdalLib.reactDashAdalLibStrings.`6000`,
    LOGGING_LEVEL: reactDashAdalLib.Anon_0,
    POPUP_HEIGHT: reactDashAdalLib.reactDashAdalLibNumbers.`600`,
    POPUP_WIDTH: reactDashAdalLib.reactDashAdalLibNumbers.`483`,
    RESOURCE_DELIMETER: reactDashAdalLib.reactDashAdalLibStrings.`|`,
    SESSION_STATE: reactDashAdalLib.reactDashAdalLibStrings.session_state,
    STORAGE: reactDashAdalLib.Anon_ACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: reactDashAdalLib.reactDashAdalLibStrings.Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: reactDashAdalLib.reactDashAdalLibStrings.Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: reactDashAdalLib.reactDashAdalLibStrings.`In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACCESS_TOKEN")(ACCESS_TOKEN)
    __obj.updateDynamic("ERROR_DESCRIPTION")(ERROR_DESCRIPTION)
    __obj.updateDynamic("EXPIRES_IN")(EXPIRES_IN)
    __obj.updateDynamic("ID_TOKEN")(ID_TOKEN)
    __obj.updateDynamic("LEVEL_STRING_MAP")(LEVEL_STRING_MAP)
    __obj.updateDynamic("LOADFRAME_TIMEOUT")(LOADFRAME_TIMEOUT)
    __obj.updateDynamic("LOGGING_LEVEL")(LOGGING_LEVEL)
    __obj.updateDynamic("POPUP_HEIGHT")(POPUP_HEIGHT)
    __obj.updateDynamic("POPUP_WIDTH")(POPUP_WIDTH)
    __obj.updateDynamic("RESOURCE_DELIMETER")(RESOURCE_DELIMETER)
    __obj.updateDynamic("SESSION_STATE")(SESSION_STATE)
    __obj.updateDynamic("STORAGE")(STORAGE)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_CANCELED")(TOKEN_RENEW_STATUS_CANCELED)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_COMPLETED")(TOKEN_RENEW_STATUS_COMPLETED)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_IN_PROGRESS")(TOKEN_RENEW_STATUS_IN_PROGRESS)
    __obj.asInstanceOf[Constants]
  }
}

