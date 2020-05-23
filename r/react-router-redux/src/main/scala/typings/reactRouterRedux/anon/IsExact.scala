package typings.reactRouterRedux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsExact extends js.Object {
  var isExact: Boolean
  var params: js.Any
  var path: String
  var url: String
}

object IsExact {
  @scala.inline
  def apply(isExact: Boolean, params: js.Any, path: String, url: String): IsExact = {
    val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExact]
  }
}

