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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RouteNodeState]
  }
}

