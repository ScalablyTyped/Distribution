package typings.rsocketCore.rsocketframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorSource extends js.Object {
  /** The error code returned by the server. */
  var code: Double
  /** Human-readable explanation of the code (this value is not standardized and may change). */
  var explanation: String
  /** The error string returned by the server. */
  var message: String
}

object ErrorSource {
  @scala.inline
  def apply(code: Double, explanation: String, message: String): ErrorSource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorSource]
  }
}

