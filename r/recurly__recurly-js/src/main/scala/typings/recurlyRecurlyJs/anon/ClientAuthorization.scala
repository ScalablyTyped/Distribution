package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAuthorization extends js.Object {
  var clientAuthorization: String
}

object ClientAuthorization {
  @scala.inline
  def apply(clientAuthorization: String): ClientAuthorization = {
    val __obj = js.Dynamic.literal(clientAuthorization = clientAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAuthorization]
  }
}

