package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cast extends js.Object {
  var `type`: String
  var `val`: js.Any
}

object cast {
  @scala.inline
  def apply(`type`: String, `val`: js.Any): cast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cast]
  }
}

