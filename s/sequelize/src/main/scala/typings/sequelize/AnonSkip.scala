package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkip extends js.Object {
  var skip: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonSkip {
  @scala.inline
  def apply(skip: js.Array[String] = null): AnonSkip = {
    val __obj = js.Dynamic.literal()
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkip]
  }
}

