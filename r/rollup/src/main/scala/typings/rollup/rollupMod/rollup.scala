package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", "rollup")
@js.native
object rollup extends js.Object {
  def apply(options: RollupOptions): js.Promise[RollupBuild] = js.native
}

