package typings.ssri

import typings.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingleStrict extends js.Object {
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonSingleStrict {
  @scala.inline
  def apply(single: `true`, strict: js.UndefOr[Boolean] = js.undefined): AnonSingleStrict = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingleStrict]
  }
}

