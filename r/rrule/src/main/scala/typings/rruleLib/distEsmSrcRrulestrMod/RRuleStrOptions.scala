package typings
package rruleLib.distEsmSrcRrulestrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RRuleStrOptions extends js.Object {
  var cache: scala.Boolean
  var compatible: scala.Boolean
  var dtstart: stdLib.Date | scala.Null
  var forceset: scala.Boolean
  var tzid: java.lang.String | scala.Null
  var unfold: scala.Boolean
}

object RRuleStrOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    compatible: scala.Boolean,
    forceset: scala.Boolean,
    unfold: scala.Boolean,
    dtstart: stdLib.Date = null,
    tzid: java.lang.String = null
  ): RRuleStrOptions = {
    val __obj = js.Dynamic.literal(cache = cache, compatible = compatible, forceset = forceset, unfold = unfold)
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart)
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    __obj.asInstanceOf[RRuleStrOptions]
  }
}

