package typings.sailsIoJs

import typings.sailsIoJs.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.Any
  var headers: Headers
  var statusCode: Double
}

object AnonBody {
  @scala.inline
  def apply(body: js.Any, headers: Headers, statusCode: Double): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

