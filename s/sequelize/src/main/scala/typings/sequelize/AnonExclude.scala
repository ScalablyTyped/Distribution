package typings.sequelize

import typings.sequelize.mod.FindOptionsAttributesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclude extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[FindOptionsAttributesArray] = js.undefined
}

object AnonExclude {
  @scala.inline
  def apply(exclude: js.Array[String] = null, include: FindOptionsAttributesArray = null): AnonExclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclude]
  }
}

