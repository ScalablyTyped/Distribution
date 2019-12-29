package typings.sequelize

import typings.sequelize.sequelizeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseReturning extends js.Object {
  var returning: js.UndefOr[`false`] = js.undefined
}

object Anon_FalseReturning {
  @scala.inline
  def apply(returning: `false` = null): Anon_FalseReturning = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FalseReturning]
  }
}

