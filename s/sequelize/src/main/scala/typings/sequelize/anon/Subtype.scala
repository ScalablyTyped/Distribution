package typings.sequelize.anon

import typings.sequelize.mod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subtype extends js.Object {
  var subtype: DataTypeAbstract
}

object Subtype {
  @scala.inline
  def apply(subtype: DataTypeAbstract): Subtype = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtype]
  }
}

