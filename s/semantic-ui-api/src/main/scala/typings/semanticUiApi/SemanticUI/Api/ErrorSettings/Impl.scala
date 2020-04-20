package typings.semanticUiApi.SemanticUI.Api.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
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
  ): Impl = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitConditions = exitConditions.asInstanceOf[js.Any], legacyParameters = legacyParameters.asInstanceOf[js.Any], missingAction = missingAction.asInstanceOf[js.Any], missingSerialize = missingSerialize.asInstanceOf[js.Any], missingURL = missingURL.asInstanceOf[js.Any], noReturnedValue = noReturnedValue.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], requiredParameter = requiredParameter.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

