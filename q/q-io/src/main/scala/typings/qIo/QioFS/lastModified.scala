package typings.qIo.QioFS

import typings.q.mod.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioFS.lastModified")
@js.native
object lastModified extends js.Object {
  def apply(path: String): Promise[Date] = js.native
}

