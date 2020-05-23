package typings.rrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithScrollOptions extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.undefined
  var propId: js.UndefOr[PropIdCallback] = js.undefined
}

object WithScrollOptions {
  @scala.inline
  def apply(alignToTop: js.UndefOr[Boolean] = js.undefined, propId: () => String = null): WithScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.get.asInstanceOf[js.Any])
    if (propId != null) __obj.updateDynamic("propId")(js.Any.fromFunction0(propId))
    __obj.asInstanceOf[WithScrollOptions]
  }
}

