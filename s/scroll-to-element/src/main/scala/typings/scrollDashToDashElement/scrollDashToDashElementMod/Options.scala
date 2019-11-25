package typings.scrollDashToDashElement.scrollDashToDashElementMod

import typings.scrollDashToDashElement.scrollDashToDashElementStrings.bottom
import typings.scrollDashToDashElement.scrollDashToDashElementStrings.middle
import typings.scrollDashToDashElement.scrollDashToDashElementStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[String] = js.undefined
  var offset: Double
}

object Options {
  @scala.inline
  def apply(
    offset: Double,
    align: top | middle | bottom = null,
    duration: Int | Double = null,
    ease: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

