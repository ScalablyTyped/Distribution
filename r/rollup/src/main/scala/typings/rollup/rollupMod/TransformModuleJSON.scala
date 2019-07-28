package typings.rollup.rollupMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformModuleJSON extends js.Object {
  var ast: Program
  var code: String
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: Boolean
  var moduleSideEffects: Boolean | Null
  var originalCode: String
  var originalSourcemap: ExistingDecodedSourceMap | Null
  var resolvedIds: js.UndefOr[ResolvedIdMap] = js.undefined
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing]
  var transformDependencies: js.Array[String] | Null
}

object TransformModuleJSON {
  @scala.inline
  def apply(
    ast: Program,
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined,
    originalSourcemap: ExistingDecodedSourceMap = null,
    resolvedIds: ResolvedIdMap = null,
    transformDependencies: js.Array[String] = null
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, originalCode = originalCode, sourcemapChain = sourcemapChain)
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap)
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds)
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[TransformModuleJSON]
  }
}

