package typings.sha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha", "checkSync")
@js.native
object checkSync extends js.Object {
  def apply(fileName: String, expected: String): Unit = js.native
  def apply(fileName: String, expected: String, options: ShaOptions): Unit = js.native
}

