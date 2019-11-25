package typings.sequelize

import typings.sequelize.sequelizeMod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subtype extends js.Object {
  var subtype: DataTypeAbstract
}

object Anon_Subtype {
  @scala.inline
  def apply(subtype: DataTypeAbstract): Anon_Subtype = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Subtype]
  }
}

