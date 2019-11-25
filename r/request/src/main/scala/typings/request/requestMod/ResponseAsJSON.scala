package typings.request.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseAsJSON extends js.Object {
  var body: js.Any
  var headers: Headers
  var request: RequestAsJSON
  var statusCode: Double
}

object ResponseAsJSON {
  @scala.inline
  def apply(body: js.Any, headers: Headers, request: RequestAsJSON, statusCode: Double): ResponseAsJSON = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseAsJSON]
  }
}

