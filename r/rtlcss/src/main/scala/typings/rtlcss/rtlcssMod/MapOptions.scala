package typings.rtlcss.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var greedy: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: Boolean
  var scope: String
}

object MapOptions {
  @scala.inline
  def apply(ignoreCase: Boolean, scope: String, greedy: js.UndefOr[Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase, scope = scope)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    __obj.asInstanceOf[MapOptions]
  }
}

