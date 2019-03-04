package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxValidationError extends js.Object {
  var qContext: java.lang.String
  var qErrorCode: scala.Double
  var qExtendedMessage: java.lang.String
}

object NxValidationError {
  @scala.inline
  def apply(qContext: java.lang.String, qErrorCode: scala.Double, qExtendedMessage: java.lang.String): NxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext, qErrorCode = qErrorCode, qExtendedMessage = qExtendedMessage)
  
    __obj.asInstanceOf[NxValidationError]
  }
}

