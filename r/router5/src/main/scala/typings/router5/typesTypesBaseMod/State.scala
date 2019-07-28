package typings.router5.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var meta: js.UndefOr[StateMeta] = js.undefined
  var name: String
  var params: Params
  var path: String
}

object State {
  @scala.inline
  def apply(name: String, params: Params, path: String, meta: StateMeta = null): State = {
    val __obj = js.Dynamic.literal(name = name, params = params, path = path)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[State]
  }
}

