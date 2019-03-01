package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupBuild extends js.Object {
  var cache: RollupCache
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  var watchFiles: js.Array[java.lang.String]
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  def write(options: OutputOptions): js.Promise[RollupOutput]
}

object RollupBuild {
  @scala.inline
  def apply(
    cache: RollupCache,
    generate: js.Function1[OutputOptions, js.Promise[RollupOutput]],
    watchFiles: js.Array[java.lang.String],
    write: js.Function1[OutputOptions, js.Promise[RollupOutput]],
    getTimings: js.Function0[SerializedTimings] = null
  ): RollupBuild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("generate")(generate)
    __obj.updateDynamic("watchFiles")(watchFiles)
    __obj.updateDynamic("write")(write)
    if (getTimings != null) __obj.updateDynamic("getTimings")(getTimings)
    __obj.asInstanceOf[RollupBuild]
  }
}

