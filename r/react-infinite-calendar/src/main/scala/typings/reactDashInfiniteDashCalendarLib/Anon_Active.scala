package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(active: java.lang.String = null, default: java.lang.String = null): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[Anon_Active]
  }
}

