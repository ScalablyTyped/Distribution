package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", JSImport.Namespace)
@js.native
object rollupModMembers extends js.Object {
  val VERSION: java.lang.String = js.native
  def rollup(options: RollupDirOptions): js.Promise[RollupBuild] = js.native
  def rollup(options: RollupFileOptions): js.Promise[RollupSingleFileBuild] = js.native
  def watch(configs: js.Array[RollupWatchOptions]): Watcher = js.native
}

