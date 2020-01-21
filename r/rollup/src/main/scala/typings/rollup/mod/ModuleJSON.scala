package typings.rollup.mod

import typings.estree.mod.Program
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
    transformDependencies: js.Array[String],
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined,
    originalSourcemap: ExistingDecodedSourceMap = null,
    resolvedIds: ResolvedIdMap = null,
    syntheticNamedExports: js.UndefOr[Boolean] = js.undefined,
    transformFiles: js.Array[EmittedFile] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap.asInstanceOf[js.Any])
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds.asInstanceOf[js.Any])
    if (!js.isUndefined(syntheticNamedExports)) __obj.updateDynamic("syntheticNamedExports")(syntheticNamedExports.asInstanceOf[js.Any])
    if (transformFiles != null) __obj.updateDynamic("transformFiles")(transformFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleJSON]
  }
}

