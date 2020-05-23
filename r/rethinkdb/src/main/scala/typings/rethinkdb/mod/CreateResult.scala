package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResult extends js.Object {
  var created: Double
}

object CreateResult {
  @scala.inline
  def apply(created: Double): CreateResult = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResult]
  }
}

