package typings
package routeDashNodeLib.routeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteNodeState extends js.Object {
  var meta: RouteNodeStateMeta
  var name: java.lang.String
  var params: js.Object
}

object RouteNodeState {
  @scala.inline
  def apply(meta: RouteNodeStateMeta, name: java.lang.String, params: js.Object): RouteNodeState = {
    val __obj = js.Dynamic.literal(meta = meta, name = name, params = params)
  
    __obj.asInstanceOf[RouteNodeState]
  }
}

