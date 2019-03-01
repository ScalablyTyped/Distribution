package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray] = js.undefined
}

object Anon_Exclude {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String] = null,
    include: sequelizeLib.sequelizeMod.sequelizeNs.FindOptionsAttributesArray = null
  ): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Anon_Exclude]
  }
}

