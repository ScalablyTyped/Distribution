package typings
package radiusLib.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusverify_responseargs} for more info.
  **/
trait VerifyResponseArgs extends js.Object {
  var request: nodeLib.Buffer
  var response: nodeLib.Buffer
  var secret: java.lang.String
}

object VerifyResponseArgs {
  @scala.inline
  def apply(request: nodeLib.Buffer, response: nodeLib.Buffer, secret: java.lang.String): VerifyResponseArgs = {
    val __obj = js.Dynamic.literal(request = request, response = response, secret = secret)
  
    __obj.asInstanceOf[VerifyResponseArgs]
  }
}

