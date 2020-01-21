package typings.sequelize

import typings.sequelize.mod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubtype extends js.Object {
  var subtype: DataTypeAbstract
}

object AnonSubtype {
  @scala.inline
  def apply(subtype: DataTypeAbstract): AnonSubtype = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSubtype]
  }
}

