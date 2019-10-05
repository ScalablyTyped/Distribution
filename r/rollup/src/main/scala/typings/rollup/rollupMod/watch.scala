package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", "watch")
@js.native
object watch extends js.Object {
  def apply(configs: js.Array[RollupWatchOptions]): RollupWatcher = js.native
}

