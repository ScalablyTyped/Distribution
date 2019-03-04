package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyRequest extends js.Object {
  var requestKey: java.lang.String
  var res: stdLib.Response
}

object ProxyRequest {
  @scala.inline
  def apply(requestKey: java.lang.String, res: stdLib.Response): ProxyRequest = {
    val __obj = js.Dynamic.literal(requestKey = requestKey, res = res)
  
    __obj.asInstanceOf[ProxyRequest]
  }
}

