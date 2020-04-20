package typings.ssbKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignature extends js.Object {
  var signature: String
}

object AnonSignature {
  @scala.inline
  def apply(signature: String): AnonSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignature]
  }
}

