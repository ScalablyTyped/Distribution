package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var headers: js.Any
  var status: Double
}

object AnonBody {
  @scala.inline
  def apply(body: String, headers: js.Any, status: Double): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

