package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var chevron: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    chevron: java.lang.String = null,
    color: java.lang.String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (chevron != null) __obj.updateDynamic("chevron")(chevron)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_Background]
  }
}

