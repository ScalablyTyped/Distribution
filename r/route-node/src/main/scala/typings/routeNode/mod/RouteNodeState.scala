package typings.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteNodeState extends js.Object {
  var meta: RouteNodeStateMeta
  var name: String
  var params: js.Object
}

object RouteNodeState {
  @scala.inline
  def apply(meta: RouteNodeStateMeta, name: String, params: js.Object): RouteNodeState = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteNodeState]
  }
}

