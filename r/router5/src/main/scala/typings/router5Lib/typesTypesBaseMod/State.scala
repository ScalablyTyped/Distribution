package typings
package router5Lib.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var meta: js.UndefOr[StateMeta] = js.undefined
  var name: java.lang.String
  var params: Params
  var path: java.lang.String
}

object State {
  @scala.inline
  def apply(name: java.lang.String, params: Params, path: java.lang.String, meta: StateMeta = null): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[State]
  }
}

