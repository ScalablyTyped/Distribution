package typings.radius.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusverify_responseargs} for more info.
  **/
@js.native
trait VerifyResponseArgs extends js.Object {
  var request: Buffer = js.native
  var response: Buffer = js.native
  var secret: String = js.native
}

object VerifyResponseArgs {
  @scala.inline
  def apply(request: Buffer, response: Buffer, secret: String): VerifyResponseArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResponseArgs]
  }
  @scala.inline
  implicit class VerifyResponseArgsOps[Self <: VerifyResponseArgs] (val x: Self) extends AnyVal {
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
    def setRequest(value: Buffer): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Buffer): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

