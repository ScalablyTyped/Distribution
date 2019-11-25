package typings.sequelize

import typings.sequelize.sequelizeMod.Model
import typings.sequelize.sequelizeMod.TransactionLockLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: TransactionLockLevel
  var of: Model[_, _, _]
}

object Anon_Level {
  @scala.inline
  def apply(level: TransactionLockLevel, of: Model[_, _, _]): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Level]
  }
}

