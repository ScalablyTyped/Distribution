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
  var transformDependencies: js.Array[String]
}

object TransformModuleJSON {
  @scala.inline
  def apply(
    ast: Program,
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String],
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined,
    originalSourcemap: ExistingDecodedSourceMap = null,
    resolvedIds: ResolvedIdMap = null
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap.asInstanceOf[js.Any])
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformModuleJSON]
  }
}

