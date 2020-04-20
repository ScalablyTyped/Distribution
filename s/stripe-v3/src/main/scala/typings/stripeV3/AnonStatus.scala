package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var status: String
  var url: String
}

object AnonStatus {
  @scala.inline
  def apply(status: String, url: String): AnonStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

