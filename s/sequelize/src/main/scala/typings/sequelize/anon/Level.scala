package typings.sequelize.anon

import typings.sequelize.mod.Model
import typings.sequelize.mod.TransactionLockLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: TransactionLockLevel
  var of: Model[_, _, _]
}

object Level {
  @scala.inline
  def apply(level: TransactionLockLevel, of: Model[_, _, _]): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

