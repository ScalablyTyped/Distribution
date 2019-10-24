package typings.sailthruDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: String
  var errormsg: String
  var statusCode: String
}

object Anon_Error {
  @scala.inline
  def apply(error: String, errormsg: String, statusCode: String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, errormsg = errormsg, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

