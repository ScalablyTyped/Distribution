package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: java.lang.String = js.native
  def rollup(options: rollupLib.rollupMod.RollupOptions): js.Promise[rollupLib.rollupMod.RollupBuild] = js.native
  def watch(configs: js.Array[rollupLib.rollupMod.RollupWatchOptions]): rollupLib.rollupMod.RollupWatcher = js.native
}

