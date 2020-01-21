package typings.reactRouterRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsExact extends js.Object {
  var isExact: Boolean
  var params: js.Any
  var path: String
  var url: String
}

object AnonIsExact {
  @scala.inline
  def apply(isExact: Boolean, params: js.Any, path: String, url: String): AnonIsExact = {
    val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsExact]
  }
}

