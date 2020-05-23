package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturningOptions extends js.Object {
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] = js.undefined
}

object ReturningOptions {
  @scala.inline
  def apply(returning: js.UndefOr[Boolean] = js.undefined): ReturningOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturningOptions]
  }
}

