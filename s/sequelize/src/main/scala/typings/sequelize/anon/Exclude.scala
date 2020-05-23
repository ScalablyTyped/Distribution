package typings.sequelize.anon

import typings.sequelize.mod.FindOptionsAttributesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclude extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[FindOptionsAttributesArray] = js.undefined
}

object Exclude {
  @scala.inline
  def apply(exclude: js.Array[String] = null, include: FindOptionsAttributesArray = null): Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclude]
  }
}

