package typings
package regexppLib.parserMod.RegExpParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[
    regexppLib.regexppLibNumbers.`5` | regexppLib.regexppLibNumbers.`2015` | regexppLib.regexppLibNumbers.`2016` | regexppLib.regexppLibNumbers.`2017` | regexppLib.regexppLibNumbers.`2018`
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ecmaVersion: regexppLib.regexppLibNumbers.`5` | regexppLib.regexppLibNumbers.`2015` | regexppLib.regexppLibNumbers.`2016` | regexppLib.regexppLibNumbers.`2017` | regexppLib.regexppLibNumbers.`2018` = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

