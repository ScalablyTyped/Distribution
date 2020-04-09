package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientAuthorization extends js.Object {
  var clientAuthorization: String
}

object AnonClientAuthorization {
  @scala.inline
  def apply(clientAuthorization: String): AnonClientAuthorization = {
    val __obj = js.Dynamic.literal(clientAuthorization = clientAuthorization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientAuthorization]
  }
}

