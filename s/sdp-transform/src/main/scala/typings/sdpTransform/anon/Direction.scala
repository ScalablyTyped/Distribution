package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: String
  var id: Double | String
  var params: js.UndefOr[String] = js.undefined
}

object Direction {
  @scala.inline
  def apply(direction: String, id: Double | String, params: String = null): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

