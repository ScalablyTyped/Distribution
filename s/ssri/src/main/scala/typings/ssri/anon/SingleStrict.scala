package typings.ssri.anon

import typings.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleStrict extends js.Object {
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object SingleStrict {
  @scala.inline
  def apply(single: `true`, strict: js.UndefOr[Boolean] = js.undefined): SingleStrict = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleStrict]
  }
}

