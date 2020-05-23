package typings.qunitDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.undefined
}

object Inverted {
  @scala.inline
  def apply(inverted: js.UndefOr[Boolean] = js.undefined): Inverted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverted]
  }
}

