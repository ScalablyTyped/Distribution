package typings.readdirDashEnhanced.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "readdirAsyncStat")
@js.native
object readdirAsyncStat extends js.Object {
  def apply(root: String): js.Promise[js.Array[Stats]] = js.native
  def apply(root: String, callback: StatsArrayCallback): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[Stats]] = js.native
  def apply(root: String, options: Options, callback: StatsArrayCallback): Unit = js.native
}

