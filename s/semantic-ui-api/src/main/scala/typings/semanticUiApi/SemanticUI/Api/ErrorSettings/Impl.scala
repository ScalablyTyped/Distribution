package typings.semanticUiApi.SemanticUI.Api.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'JSON could not be parsed during error handling'
    */
  var JSONParse: String = js.native
  /**
    * @default 'The before send function has aborted the request'
    */
  var beforeSend: String = js.native
  /**
    * @default 'There was an error with your request'
    */
  var error: String = js.native
  /**
    * @default 'API Request Aborted. Exit conditions met'
    */
  var exitConditions: String = js.native
  /**
    * @default 'You are using legacy API success callback names'
    */
  var legacyParameters: String = js.native
  /**
    * @default 'API action used but no url was defined'
    */
  var missingAction: String = js.native
  /**
    * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
    */
  var missingSerialize: String = js.native
  /**
    * @default 'No URL specified for API event'
    */
  var missingURL: String = js.native
  /**
    * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
    */
  var noReturnedValue: String = js.native
  /**
    * @default 'There was an error parsing your request'
    */
  var parseError: String = js.native
  /**
    * @default 'Missing a required URL parameter: '
    */
  var requiredParameter: String = js.native
  /**
    * @default 'Server gave an error: '
    */
  var statusMessage: String = js.native
  /**
    * @default 'Your request timed out'
    */
  var timeout: String = js.native
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
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setJSONParse(value: String): Self = this.set("JSONParse", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeSend(value: String): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitConditions(value: String): Self = this.set("exitConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegacyParameters(value: String): Self = this.set("legacyParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingAction(value: String): Self = this.set("missingAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingSerialize(value: String): Self = this.set("missingSerialize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingURL(value: String): Self = this.set("missingURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoReturnedValue(value: String): Self = this.set("noReturnedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseError(value: String): Self = this.set("parseError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredParameter(value: String): Self = this.set("requiredParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

