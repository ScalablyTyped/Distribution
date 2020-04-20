package typings.restangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: String
  var params: js.Any
  var url: String
}

object AnonMethod {
  @scala.inline
  def apply(method: String, params: js.Any, url: String): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

