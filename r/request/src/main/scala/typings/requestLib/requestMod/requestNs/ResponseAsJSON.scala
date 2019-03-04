package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseAsJSON extends js.Object {
  var body: js.Any
  var headers: Headers
  var request: RequestAsJSON
  var statusCode: scala.Double
}

object ResponseAsJSON {
  @scala.inline
  def apply(body: js.Any, headers: Headers, request: RequestAsJSON, statusCode: scala.Double): ResponseAsJSON = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, request = request, statusCode = statusCode)
  
    __obj.asInstanceOf[ResponseAsJSON]
  }
}

