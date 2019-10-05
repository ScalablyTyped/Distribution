package typings.semanticDashUiDashApi.SemanticUI.Api.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'JSON could not be parsed during error handling'
    */
  var JSONParse: String
  /**
    * @default 'The before send function has aborted the request'
    */
  var beforeSend: String
  /**
    * @default 'There was an error with your request'
    */
  var error: String
  /**
    * @default 'API Request Aborted. Exit conditions met'
    */
  var exitConditions: String
  /**
    * @default 'You are using legacy API success callback names'
    */
  var legacyParameters: String
  /**
    * @default 'API action used but no url was defined'
    */
  var missingAction: String
  /**
    * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
    */
  var missingSerialize: String
  /**
    * @default 'No URL specified for API event'
    */
  var missingURL: String
  /**
    * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
    */
  var noReturnedValue: String
  /**
    * @default 'There was an error parsing your request'
    */
  var parseError: String
  /**
    * @default 'Missing a required URL parameter: '
    */
  var requiredParameter: String
  /**
    * @default 'Server gave an error: '
    */
  var statusMessage: String
  /**
    * @default 'Your request timed out'
    */
  var timeout: String
}

object _Impl {
  @scala.inline
  def apply(
    JSONParse: String,
    beforeSend: String,
    error: String,
    exitConditions: String,
    legacyParameters: String,
    missingAction: String,
    missingSerialize: String,
    missingURL: String,
    noReturnedValue: String,
    parseError: String,
    requiredParameter: String,
    statusMessage: String,
    timeout: String
  ): _Impl = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse, beforeSend = beforeSend, error = error, exitConditions = exitConditions, legacyParameters = legacyParameters, missingAction = missingAction, missingSerialize = missingSerialize, missingURL = missingURL, noReturnedValue = noReturnedValue, parseError = parseError, requiredParameter = requiredParameter, statusMessage = statusMessage, timeout = timeout)
  
    __obj.asInstanceOf[_Impl]
  }
}

