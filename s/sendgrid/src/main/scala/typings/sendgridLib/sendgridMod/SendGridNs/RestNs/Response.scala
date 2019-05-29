package typings
package sendgridLib.sendgridMod.SendGridNs.RestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: java.lang.String
  var headers: java.lang.String
  var statusCode: scala.Double
}

object Response {
  @scala.inline
  def apply(body: java.lang.String, headers: java.lang.String, statusCode: scala.Double): Response = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[Response]
  }
}

