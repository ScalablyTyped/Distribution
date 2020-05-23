package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Through[TJoinTableAttributes] extends js.Object {
  var through: TJoinTableAttributes
}

object Through {
  @scala.inline
  def apply[TJoinTableAttributes](through: TJoinTableAttributes): Through[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[Through[TJoinTableAttributes]]
  }
}

