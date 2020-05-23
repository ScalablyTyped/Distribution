package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count[TInstance] extends js.Object {
  var count: Double
  var rows: js.Array[TInstance]
}

object Count {
  @scala.inline
  def apply[TInstance](count: Double, rows: js.Array[TInstance]): Count[TInstance] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count[TInstance]]
  }
}

