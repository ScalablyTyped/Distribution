package typings.rollup.rollupMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleJSON extends TransformModuleJSON {
  var dependencies: js.Array[String]
  var id: String
  var transformFiles: js.UndefOr[js.Array[EmittedFile]] = js.undefined
}

object ModuleJSON {
  @scala.inline
  def apply(
    ast: Program,
    code: String,
    customTransformCache: Boolean,
    dependencies: js.Array[String],
    id: String,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined,
    originalSourcemap: ExistingDecodedSourceMap = null,
    resolvedIds: ResolvedIdMap = null,
    transformDependencies: js.Array[String] = null,
    transformFiles: js.Array[EmittedFile] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, dependencies = dependencies, id = id, originalCode = originalCode, sourcemapChain = sourcemapChain)
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap)
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds)
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    if (transformFiles != null) __obj.updateDynamic("transformFiles")(transformFiles)
    __obj.asInstanceOf[ModuleJSON]
  }
}

