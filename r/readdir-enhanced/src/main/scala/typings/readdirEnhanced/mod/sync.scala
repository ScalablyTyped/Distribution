package typings.readdirEnhanced.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "sync")
@js.native
object sync extends js.Object {
  def apply(root: String): js.Array[String] = js.native
  def apply(root: String, options: Options): js.Array[String] = js.native
  def stat(root: String): js.Array[Stats] = js.native
  def stat(root: String, options: Options): js.Array[Stats] = js.native
}

