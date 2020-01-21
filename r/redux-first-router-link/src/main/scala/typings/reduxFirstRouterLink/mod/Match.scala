package typings.reduxFirstRouterLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match[P] extends js.Object {
  var isExact: Boolean
  var params: P
  var path: String
  var url: String
}

object Match {
  @scala.inline
  def apply[P](isExact: Boolean, params: P, path: String, url: String): Match[P] = {
    val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Match[P]]
  }
}

