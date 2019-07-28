package typings.std.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollatorOptions extends js.Object {
  var caseFirst: js.UndefOr[java.lang.String] = js.undefined
  var ignorePunctuation: js.UndefOr[scala.Boolean] = js.undefined
  var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var sensitivity: js.UndefOr[java.lang.String] = js.undefined
  var usage: js.UndefOr[java.lang.String] = js.undefined
}

object CollatorOptions {
  @scala.inline
  def apply(
    caseFirst: java.lang.String = null,
    ignorePunctuation: js.UndefOr[scala.Boolean] = js.undefined,
    localeMatcher: java.lang.String = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    sensitivity: java.lang.String = null,
    usage: java.lang.String = null
  ): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst)
    if (!js.isUndefined(ignorePunctuation)) __obj.updateDynamic("ignorePunctuation")(ignorePunctuation)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[CollatorOptions]
  }
}

