package typings
package stellarDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTime extends js.Object {
  var maxTime: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minTime: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_MaxTime {
  @scala.inline
  def apply(maxTime: scala.Double | java.lang.String = null, minTime: scala.Double | java.lang.String = null): Anon_MaxTime = {
    val __obj = js.Dynamic.literal()
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxTime]
  }
}

