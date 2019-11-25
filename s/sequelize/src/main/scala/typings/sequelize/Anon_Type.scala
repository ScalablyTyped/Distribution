package typings.sequelize

import typings.sequelize.sequelizeMod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: DataTypeAbstract
}

object Anon_Type {
  @scala.inline
  def apply(`type`: DataTypeAbstract): Anon_Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

