package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

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
  var qContext: java.lang.String
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: scala.Double
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: java.lang.String
}

object INxValidationError {
  @scala.inline
  def apply(qContext: java.lang.String, qErrorCode: scala.Double, qExtendedMessage: java.lang.String): INxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext, qErrorCode = qErrorCode, qExtendedMessage = qExtendedMessage)
  
    __obj.asInstanceOf[INxValidationError]
  }
}

