package typings.qIo.QioFS

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioFS.stat")
@js.native
object stat extends js.Object {
  def apply(path: String): Promise[Stats] = js.native
}

