package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subtype extends js.Object {
  var subtype: sequelizeLib.sequelizeMod.sequelizeNs.DataTypeAbstract
}

object Anon_Subtype {
  @scala.inline
  def apply(subtype: sequelizeLib.sequelizeMod.sequelizeNs.DataTypeAbstract): Anon_Subtype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[Anon_Subtype]
  }
}

