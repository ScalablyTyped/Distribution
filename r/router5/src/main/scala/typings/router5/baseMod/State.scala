package typings.router5.baseMod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

