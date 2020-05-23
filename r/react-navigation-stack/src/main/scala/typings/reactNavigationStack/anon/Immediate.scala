package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Immediate extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object Immediate {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined): Immediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immediate]
  }
}

