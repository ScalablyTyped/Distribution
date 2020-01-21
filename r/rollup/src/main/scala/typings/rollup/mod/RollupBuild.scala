package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupBuild extends js.Object {
  var cache: RollupCache
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  var watchFiles: js.Array[String]
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  def write(options: OutputOptions): js.Promise[RollupOutput]
}

object RollupBuild {
  @scala.inline
  def apply(
    cache: RollupCache,
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput],
    getTimings: () => SerializedTimings = null
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    if (getTimings != null) __obj.updateDynamic("getTimings")(js.Any.fromFunction0(getTimings))
    __obj.asInstanceOf[RollupBuild]
  }
}

