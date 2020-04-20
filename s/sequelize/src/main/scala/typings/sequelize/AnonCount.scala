package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount[TInstance] extends js.Object {
  var count: Double
  var rows: js.Array[TInstance]
}

object AnonCount {
  @scala.inline
  def apply[TInstance](count: Double, rows: js.Array[TInstance]): AnonCount[TInstance] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount[TInstance]]
  }
}

