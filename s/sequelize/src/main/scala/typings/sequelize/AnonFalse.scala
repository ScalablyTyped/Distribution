package typings.sequelize

import typings.sequelize.sequelizeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var returning: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(returning: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

