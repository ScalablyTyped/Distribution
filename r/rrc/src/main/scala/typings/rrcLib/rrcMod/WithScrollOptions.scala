package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithScrollOptions extends js.Object {
  var alignToTop: js.UndefOr[scala.Boolean] = js.undefined
  var propId: js.UndefOr[PropIdCallback] = js.undefined
}

object WithScrollOptions {
  @scala.inline
  def apply(alignToTop: js.UndefOr[scala.Boolean] = js.undefined, propId: PropIdCallback = null): WithScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop)
    if (propId != null) __obj.updateDynamic("propId")(propId)
    __obj.asInstanceOf[WithScrollOptions]
  }
}

