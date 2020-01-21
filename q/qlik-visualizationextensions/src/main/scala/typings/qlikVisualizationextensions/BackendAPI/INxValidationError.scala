package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxValidationError extends js.Object {
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: String
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: Double
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: String
}

object INxValidationError {
  @scala.inline
  def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): INxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxValidationError]
  }
}

