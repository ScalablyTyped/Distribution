package typings.sailsDotIoDotJs

import typings.sailsDotIoDotJs.sailsDotIoDotJsMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Any
  var headers: Headers
  var statusCode: Double
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Any, headers: Headers, statusCode: Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

