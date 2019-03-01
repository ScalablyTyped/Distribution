package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRulesOptions extends js.Object {
  var localeMatcher: js.UndefOr[stdLib.stdLibStrings.lookup | (stdLib.stdLibStrings.`best fit`)] = js.undefined
  var `type`: js.UndefOr[stdLib.stdLibStrings.cardinal | stdLib.stdLibStrings.ordinal] = js.undefined
}

object PluralRulesOptions {
  @scala.inline
  def apply(
    localeMatcher: stdLib.stdLibStrings.lookup | (stdLib.stdLibStrings.`best fit`) = null,
    `type`: stdLib.stdLibStrings.cardinal | stdLib.stdLibStrings.ordinal = null
  ): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralRulesOptions]
  }
}

