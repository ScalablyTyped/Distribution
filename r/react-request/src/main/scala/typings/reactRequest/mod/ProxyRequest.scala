package typings.reactRequest.mod

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
    val __obj = js.Dynamic.literal(requestKey = requestKey.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyRequest]
  }
}

