package typings.sailsIoJs.mod

import typings.sailsIoJs.anon.Body
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWR extends js.Object {
  var body: js.Any
  var error: js.UndefOr[Error] = js.undefined
  var headers: Headers
  var statusCode: Double
  def pipe(): Error
  def toPOJO(): Body
}

object JWR {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Headers,
    pipe: () => Error,
    statusCode: Double,
    toPOJO: () => Body,
    error: Error = null
  ): JWR = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pipe = js.Any.fromFunction0(pipe), statusCode = statusCode.asInstanceOf[js.Any], toPOJO = js.Any.fromFunction0(toPOJO))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWR]
  }
}

