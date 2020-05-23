package typings.regexpp.parserMod.RegExpParser

import typings.regexpp.regexppNumbers.`2015`
import typings.regexpp.regexppNumbers.`2016`
import typings.regexpp.regexppNumbers.`2017`
import typings.regexpp.regexppNumbers.`2018`
import typings.regexpp.regexppNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[`5` | `2015` | `2016` | `2017` | `2018`] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ecmaVersion: `5` | `2015` | `2016` | `2017` | `2018` = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

