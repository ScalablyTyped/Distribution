package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResult extends js.Object {
  var created: Double
}

object CreateResult {
  @scala.inline
  def apply(created: Double): CreateResult = {
    val __obj = js.Dynamic.literal(created = created)
  
    __obj.asInstanceOf[CreateResult]
  }
}

