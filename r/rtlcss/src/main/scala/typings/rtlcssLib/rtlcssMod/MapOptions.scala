package typings
package rtlcssLib.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var greedy: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: scala.Boolean
  var scope: java.lang.String
}

object MapOptions {
  @scala.inline
  def apply(
    ignoreCase: scala.Boolean,
    scope: java.lang.String,
    greedy: js.UndefOr[scala.Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreCase")(ignoreCase)
    __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    __obj.asInstanceOf[MapOptions]
  }
}

