package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RollupSingleFileBuild extends js.Object {
  var cache: RollupCache
  var exports: js.Array[rollupLib.Anon_ModuleId]
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  // TODO: consider deprecating to match code splitting
  var imports: js.Array[java.lang.String]
  var modules: js.Array[ModuleJSON]
  var watchFiles: js.Array[java.lang.String]
  def generate(outputOptions: OutputOptions): stdLib.Promise[OutputChunk]
  def write(options: OutputOptions): stdLib.Promise[OutputChunk]
}

