package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxValidationError extends js.Object {
  var qContext: String
  var qErrorCode: Double
  var qExtendedMessage: String
}

object NxValidationError {
  @scala.inline
  def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): NxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxValidationError]
  }
}

