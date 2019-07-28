package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qContext = qContext, qErrorCode = qErrorCode, qExtendedMessage = qExtendedMessage)
  
    __obj.asInstanceOf[NxValidationError]
  }
}

