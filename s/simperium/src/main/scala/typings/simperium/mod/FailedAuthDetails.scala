package typings.simperium.mod

import typings.simperium.simperiumNumbers.`400`
import typings.simperium.simperiumNumbers.`401`
import typings.simperium.simperiumNumbers.`500`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedAuthDetails extends js.Object {
  var code: `400` | `401` | `500`
  var msg: String
}

object FailedAuthDetails {
  @scala.inline
  def apply(code: `400` | `401` | `500`, msg: String): FailedAuthDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAuthDetails]
  }
}

