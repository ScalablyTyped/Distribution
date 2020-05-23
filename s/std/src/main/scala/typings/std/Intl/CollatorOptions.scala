package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollatorOptions extends js.Object {
  var caseFirst: js.UndefOr[String] = js.undefined
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
  var localeMatcher: js.UndefOr[String] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var sensitivity: js.UndefOr[String] = js.undefined
  var usage: js.UndefOr[String] = js.undefined
}

object CollatorOptions {
  @scala.inline
  def apply(
    caseFirst: String = null,
    ignorePunctuation: js.UndefOr[Boolean] = js.undefined,
    localeMatcher: String = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    sensitivity: String = null,
    usage: String = null
  ): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePunctuation)) __obj.updateDynamic("ignorePunctuation")(ignorePunctuation.get.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.get.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollatorOptions]
  }
}

