package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var back: js.UndefOr[java.lang.String] = js.undefined
  var close: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[java.lang.String] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    back: java.lang.String = null,
    close: java.lang.String = null,
    last: java.lang.String = null,
    next: java.lang.String = null,
    skip: java.lang.String = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back)
    if (close != null) __obj.updateDynamic("close")(close)
    if (last != null) __obj.updateDynamic("last")(last)
    if (next != null) __obj.updateDynamic("next")(next)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Locale]
  }
}

