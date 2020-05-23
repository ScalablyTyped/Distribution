package typings.sequelize.anon

import typings.sequelize.mod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: DataTypeAbstract
}

object Type {
  @scala.inline
  def apply(`type`: DataTypeAbstract): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

