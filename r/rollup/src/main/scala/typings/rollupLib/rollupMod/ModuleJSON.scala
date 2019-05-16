package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleJSON extends TransformModuleJSON {
  var dependencies: js.Array[java.lang.String]
  var id: java.lang.String
  var transformAssets: js.Array[Asset] | scala.Unit
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
    sourcemapChain: js.Array[RawSourceMap | rollupLib.Anon_Missing],
    transformAssets: js.Array[Asset] | scala.Unit,
    moduleSideEffects: js.UndefOr[scala.Boolean] = js.undefined,
    resolvedIds: ResolvedIdMap = null,
    transformDependencies: js.Array[java.lang.String] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, dependencies = dependencies, id = id, originalCode = originalCode, originalSourcemap = originalSourcemap.asInstanceOf[js.Any], sourcemapChain = sourcemapChain, transformAssets = transformAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds)
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[ModuleJSON]
  }
}

