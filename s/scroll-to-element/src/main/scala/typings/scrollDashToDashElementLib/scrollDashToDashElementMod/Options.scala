package typings
package scrollDashToDashElementLib.scrollDashToDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var align: js.UndefOr[
    scrollDashToDashElementLib.scrollDashToDashElementLibStrings.top | scrollDashToDashElementLib.scrollDashToDashElementLibStrings.middle | scrollDashToDashElementLib.scrollDashToDashElementLibStrings.bottom
  ] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var ease: js.UndefOr[java.lang.String] = js.undefined
  var offset: scala.Double
}

object Options {
  @scala.inline
  def apply(
    offset: scala.Double,
    align: scrollDashToDashElementLib.scrollDashToDashElementLibStrings.top | scrollDashToDashElementLib.scrollDashToDashElementLibStrings.middle | scrollDashToDashElementLib.scrollDashToDashElementLibStrings.bottom = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(offset = offset)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease)
    __obj.asInstanceOf[Options]
  }
}

