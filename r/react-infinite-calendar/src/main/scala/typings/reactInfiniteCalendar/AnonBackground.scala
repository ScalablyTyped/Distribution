package typings.reactInfiniteCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var chevron: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnonBackground {
  @scala.inline
  def apply(background: String = null, chevron: String = null, color: String = null): AnonBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

