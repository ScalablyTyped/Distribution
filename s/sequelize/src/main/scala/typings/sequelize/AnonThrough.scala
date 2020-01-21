package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThrough[TJoinTableAttributes] extends js.Object {
  var through: TJoinTableAttributes
}

object AnonThrough {
  @scala.inline
  def apply[TJoinTableAttributes](through: TJoinTableAttributes): AnonThrough[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonThrough[TJoinTableAttributes]]
  }
}

