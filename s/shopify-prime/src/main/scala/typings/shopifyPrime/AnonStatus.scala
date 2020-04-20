package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var status: Double
  var statusText: String
}

object AnonStatus {
  @scala.inline
  def apply(status: Double, statusText: String): AnonStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

