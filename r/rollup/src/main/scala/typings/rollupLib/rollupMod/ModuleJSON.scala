package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleJSON extends TransformModuleJSON {
  var dependencies: js.Array[java.lang.String]
  var id: java.lang.String
  var transformAssets: js.UndefOr[js.Array[Asset]] = js.undefined
  var transformChunks: js.UndefOr[js.Array[EmittedChunk]] = js.undefined
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
    sourcemapChain: js.Array[RawSourceMap | rollupLib.Anon_Missing],
    moduleSideEffects: js.UndefOr[scala.Boolean] = js.undefined,
    originalSourcemap: RawSourceMap = null,
    resolvedIds: ResolvedIdMap = null,
    transformAssets: js.Array[Asset] = null,
    transformChunks: js.Array[EmittedChunk] = null,
    transformDependencies: js.Array[java.lang.String] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, dependencies = dependencies, id = id, originalCode = originalCode, sourcemapChain = sourcemapChain)
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap)
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds)
    if (transformAssets != null) __obj.updateDynamic("transformAssets")(transformAssets)
    if (transformChunks != null) __obj.updateDynamic("transformChunks")(transformChunks)
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[ModuleJSON]
  }
}

