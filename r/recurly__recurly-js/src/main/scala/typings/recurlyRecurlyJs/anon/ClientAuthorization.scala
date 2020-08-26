package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAuthorization extends js.Object {
  var clientAuthorization: String = js.native
}

object ClientAuthorization {
  @scala.inline
  def apply(clientAuthorization: String): ClientAuthorization = {
    val __obj = js.Dynamic.literal(clientAuthorization = clientAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAuthorization]
  }
  @scala.inline
  implicit class ClientAuthorizationOps[Self <: ClientAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientAuthorization(value: String): Self = this.set("clientAuthorization", value.asInstanceOf[js.Any])
  }
  
}

