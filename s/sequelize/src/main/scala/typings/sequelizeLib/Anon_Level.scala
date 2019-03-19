package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: sequelizeLib.sequelizeMod.sequelizeNs.TransactionLockLevel
  var of: sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _]
}

object Anon_Level {
  @scala.inline
  def apply(
    level: sequelizeLib.sequelizeMod.sequelizeNs.TransactionLockLevel,
    of: sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _, _]
  ): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

