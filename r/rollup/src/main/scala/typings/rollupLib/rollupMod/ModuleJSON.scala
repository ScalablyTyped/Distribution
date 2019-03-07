package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleJSON extends js.Object {
  var ast: estreeLib.estreeMod.Program
  var code: java.lang.String
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: scala.Boolean
  var dependencies: js.Array[java.lang.String]
  var id: java.lang.String
  var originalCode: java.lang.String
  var originalSourcemap: RawSourceMap | scala.Unit
  var resolvedIds: ResolvedIdMap
  var sourcemapChain: js.Array[RawSourceMap]
  var transformAssets: js.Array[Asset] | scala.Unit
  var transformDependencies: js.Array[java.lang.String] | scala.Null
}

object ModuleJSON {
  @scala.inline
  def apply(
    ast: estreeLib.estreeMod.Program,
    code: java.lang.String,
    customTransformCache: scala.Boolean,
    dependencies: js.Array[java.lang.String],
    id: java.lang.String,
    originalCode: java.lang.String,
    originalSourcemap: RawSourceMap | scala.Unit,
    resolvedIds: ResolvedIdMap,
    sourcemapChain: js.Array[RawSourceMap],
    transformAssets: js.Array[Asset] | scala.Unit,
    transformDependencies: js.Array[java.lang.String] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, dependencies = dependencies, id = id, originalCode = originalCode, originalSourcemap = originalSourcemap.asInstanceOf[js.Any], resolvedIds = resolvedIds, sourcemapChain = sourcemapChain, transformAssets = transformAssets.asInstanceOf[js.Any])
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[ModuleJSON]
  }
}

