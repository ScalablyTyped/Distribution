package typings.rrule

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/rrulestr.RRuleStrOptions> */
trait PartialRRuleStrOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var compatible: js.UndefOr[Boolean] = js.undefined
  var dtstart: js.UndefOr[Date] = js.undefined
  var forceset: js.UndefOr[Boolean] = js.undefined
  var tzid: js.UndefOr[String] = js.undefined
  var unfold: js.UndefOr[Boolean] = js.undefined
}

object PartialRRuleStrOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    compatible: js.UndefOr[Boolean] = js.undefined,
    dtstart: Date = null,
    forceset: js.UndefOr[Boolean] = js.undefined,
    tzid: String = null,
    unfold: js.UndefOr[Boolean] = js.undefined
  ): PartialRRuleStrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(compatible)) __obj.updateDynamic("compatible")(compatible.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (!js.isUndefined(forceset)) __obj.updateDynamic("forceset")(forceset.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    if (!js.isUndefined(unfold)) __obj.updateDynamic("unfold")(unfold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRRuleStrOptions]
  }
}

