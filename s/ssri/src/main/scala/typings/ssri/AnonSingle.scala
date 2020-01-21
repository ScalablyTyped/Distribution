package typings.ssri

import typings.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingle extends js.Object {
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonSingle {
  @scala.inline
  def apply(single: `true`, strict: js.UndefOr[Boolean] = js.undefined): AnonSingle = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingle]
  }
}

