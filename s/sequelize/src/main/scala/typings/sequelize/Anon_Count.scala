package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count[TInstance] extends js.Object {
  var count: Double
  var rows: js.Array[TInstance]
}

object Anon_Count {
  @scala.inline
  def apply[TInstance](count: Double, rows: js.Array[TInstance]): Anon_Count[TInstance] = {
    val __obj = js.Dynamic.literal(count = count, rows = rows)
  
    __obj.asInstanceOf[Anon_Count[TInstance]]
  }
}

