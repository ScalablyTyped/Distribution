package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'JSON could not be parsed during error handling'
    */
  var JSONParse: java.lang.String
  /**
    * @default 'The before send function has aborted the request'
    */
  var beforeSend: java.lang.String
  /**
    * @default 'There was an error with your request'
    */
  var error: java.lang.String
  /**
    * @default 'API Request Aborted. Exit conditions met'
    */
  var exitConditions: java.lang.String
  /**
    * @default 'You are using legacy API success callback names'
    */
  var legacyParameters: java.lang.String
  /**
    * @default 'API action used but no url was defined'
    */
  var missingAction: java.lang.String
  /**
    * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
    */
  var missingSerialize: java.lang.String
  /**
    * @default 'No URL specified for API event'
    */
  var missingURL: java.lang.String
  /**
    * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
    */
  var noReturnedValue: java.lang.String
  /**
    * @default 'There was an error parsing your request'
    */
  var parseError: java.lang.String
  /**
    * @default 'Missing a required URL parameter: '
    */
  var requiredParameter: java.lang.String
  /**
    * @default 'Server gave an error: '
    */
  var statusMessage: java.lang.String
  /**
    * @default 'Your request timed out'
    */
  var timeout: java.lang.String
}

