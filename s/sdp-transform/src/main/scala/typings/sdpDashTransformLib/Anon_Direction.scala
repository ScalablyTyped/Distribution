package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: java.lang.String
  var id: scala.Double | java.lang.String
  var params: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(direction: java.lang.String, id: scala.Double | java.lang.String, params: java.lang.String = null): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, id = id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Direction]
  }
}

