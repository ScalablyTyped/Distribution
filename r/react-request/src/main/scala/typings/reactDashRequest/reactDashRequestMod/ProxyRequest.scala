package typings.reactDashRequest.reactDashRequestMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyRequest extends js.Object {
  var requestKey: String
  var res: Response
}

object ProxyRequest {
  @scala.inline
  def apply(requestKey: String, res: Response): ProxyRequest = {
    val __obj = js.Dynamic.literal(requestKey = requestKey, res = res)
  
    __obj.asInstanceOf[ProxyRequest]
  }
}

