package typings.sha.shaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha", "get")
@js.native
object get extends js.Object {
  def apply(fileName: String, cb: GetCallback): Unit = js.native
  def apply(fileName: String, options: ShaOptions, cb: GetCallback): Unit = js.native
}

