package typings.readdirEnhanced.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String): js.Promise[js.Array[String]] = js.native
  def apply(root: String, callback: PathsArrayCallback): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  def apply(root: String, options: Options, callback: PathsArrayCallback): Unit = js.native
}

