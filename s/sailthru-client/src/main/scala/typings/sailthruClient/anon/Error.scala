package typings.sailthruClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var errormsg: String
  var statusCode: String
}

object Error {
  @scala.inline
  def apply(error: String, errormsg: String, statusCode: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errormsg = errormsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

