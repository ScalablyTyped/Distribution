package typings.recursiveDashReaddir.recursiveDashReaddirMod.RecursiveReaddirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait readDir extends js.Object {
  def apply(path: String): js.Promise[js.Array[String]] = js.native
  def apply(path: String, callback: Callback): Unit = js.native
  def apply(path: String, ignores: Ignores): js.Promise[js.Array[String]] = js.native
  def apply(path: String, ignores: Ignores, callback: Callback): Unit = js.native
}

