package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", "watch")
@js.native
object watch extends js.Object {
  def apply(config: js.Array[RollupWatchOptions]): RollupWatcher = js.native
  def apply(config: RollupWatchOptions): RollupWatcher = js.native
}

