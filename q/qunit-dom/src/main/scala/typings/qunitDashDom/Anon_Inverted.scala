package typings.qunitDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.undefined
}

object Anon_Inverted {
  @scala.inline
  def apply(inverted: js.UndefOr[Boolean] = js.undefined): Anon_Inverted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Inverted]
  }
}

