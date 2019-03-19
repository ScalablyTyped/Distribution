package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var model: sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _]
}

object Anon_As {
  @scala.inline
  def apply(model: sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _], as: java.lang.String = null): Anon_As = {
    val __obj = js.Dynamic.literal(model = model)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[Anon_As]
  }
}

