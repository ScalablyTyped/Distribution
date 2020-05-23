package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clone extends js.Object {
  @JSName("clone")
  var clone_FClone: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
}

object Clone {
  @scala.inline
  def apply(clone: js.UndefOr[Boolean] = js.undefined, plain: js.UndefOr[Boolean] = js.undefined): Clone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clone]
  }
}

