package typings.sequelize

import typings.sequelize.sequelizeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var returning: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(returning: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

