package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod.SailsIOJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWR extends js.Object {
  var body: js.Any
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var headers: Headers
  var statusCode: scala.Double
  def pipe(): stdLib.Error
  def toPOJO(): sailsDotIoDotJsLib.Anon_Body
}

object JWR {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Headers,
    pipe: () => stdLib.Error,
    statusCode: scala.Double,
    toPOJO: () => sailsDotIoDotJsLib.Anon_Body,
    toString: () => java.lang.String,
    error: stdLib.Error = null
  ): JWR = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, pipe = js.Any.fromFunction0(pipe), statusCode = statusCode, toPOJO = js.Any.fromFunction0(toPOJO), toString = js.Any.fromFunction0(toString))
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[JWR]
  }
}

