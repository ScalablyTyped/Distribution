package typings.radius.radiusMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusverify_responseargs} for more info.
  **/
trait VerifyResponseArgs extends js.Object {
  var request: Buffer
  var response: Buffer
  var secret: String
}

object VerifyResponseArgs {
  @scala.inline
  def apply(request: Buffer, response: Buffer, secret: String): VerifyResponseArgs = {
    val __obj = js.Dynamic.literal(request = request, response = response, secret = secret)
  
    __obj.asInstanceOf[VerifyResponseArgs]
  }
}

