package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTimestamp extends js.Object {
  var contextTime: js.UndefOr[scala.Double] = js.undefined
  var performanceTime: js.UndefOr[scala.Double] = js.undefined
}

object AudioTimestamp {
  @scala.inline
  def apply(contextTime: scala.Int | scala.Double = null, performanceTime: scala.Int | scala.Double = null): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    if (contextTime != null) __obj.updateDynamic("contextTime")(contextTime.asInstanceOf[js.Any])
    if (performanceTime != null) __obj.updateDynamic("performanceTime")(performanceTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTimestamp]
  }
}

