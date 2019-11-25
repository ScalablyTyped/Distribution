package typings.sendgrid.sendgridMod.SendGrid.Rest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: String
  var headers: String
  var statusCode: Double
}

object Response {
  @scala.inline
  def apply(body: String, headers: String, statusCode: Double): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

