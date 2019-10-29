package typings.readdirDashEnhanced.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "async")
@js.native
object async extends js.Object {
  def apply(root: String): js.Promise[js.Array[String]] = js.native
  def apply(root: String, callback: PathsArrayCallback): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  def apply(root: String, options: Options, callback: PathsArrayCallback): Unit = js.native
  def stat(root: String): js.Promise[js.Array[Stats]] = js.native
  def stat(root: String, callback: StatsArrayCallback): Unit = js.native
  def stat(root: String, options: Options): js.Promise[js.Array[Stats]] = js.native
  def stat(root: String, options: Options, callback: StatsArrayCallback): Unit = js.native
}

