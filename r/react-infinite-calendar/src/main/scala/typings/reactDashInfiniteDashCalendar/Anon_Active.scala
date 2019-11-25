package typings.reactDashInfiniteDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(active: String = null, default: String = null): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

