package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "dbDrop")
@js.native
object dbDrop extends js.Object {
  def apply(name: String): Operation[DropResult] = js.native
}

