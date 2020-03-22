package typings.ramda

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValObj extends js.Object {
  def apply[V](`val`: V): js.Function1[/* obj */ Record[String, V], Boolean] = js.native
  def apply[V](`val`: V, obj: Record[String, V]): Boolean = js.native
}

