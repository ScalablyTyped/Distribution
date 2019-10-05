package typings.qDashIo.QioFS

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioFS.listTree")
@js.native
object listTree extends js.Object {
  def apply(path: String): Promise[js.Array[String]] = js.native
  def apply(path: String, guard: js.Function2[/* path */ String, /* stat */ js.Any, Boolean]): Promise[js.Array[String]] = js.native
}

