package typings.ssri.anon

import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleStrict extends js.Object {
  var single: js.UndefOr[`false`] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object SingleStrict {
  @scala.inline
  def apply(single: `false` = null, strict: js.UndefOr[Boolean] = js.undefined): SingleStrict = {
    val __obj = js.Dynamic.literal()
    if (single != null) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleStrict]
  }
}

