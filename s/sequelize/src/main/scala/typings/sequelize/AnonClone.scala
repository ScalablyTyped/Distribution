package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClone extends js.Object {
  @JSName("clone")
  var clone_FAnonClone: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
}

object AnonClone {
  @scala.inline
  def apply(clone: js.UndefOr[Boolean] = js.undefined, plain: js.UndefOr[Boolean] = js.undefined): AnonClone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClone]
  }
}

