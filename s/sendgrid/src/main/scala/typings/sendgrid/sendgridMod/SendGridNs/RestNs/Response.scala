package typings.sendgrid.sendgridMod.SendGridNs.RestNs

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
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[Response]
  }
}

