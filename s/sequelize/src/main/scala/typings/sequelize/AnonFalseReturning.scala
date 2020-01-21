package typings.sequelize

import typings.sequelize.sequelizeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseReturning extends js.Object {
  var returning: js.UndefOr[`false`] = js.undefined
}

object AnonFalseReturning {
  @scala.inline
  def apply(returning: `false` = null): AnonFalseReturning = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalseReturning]
  }
}

