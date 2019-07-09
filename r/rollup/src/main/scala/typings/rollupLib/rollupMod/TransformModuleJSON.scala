package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformModuleJSON extends js.Object {
  var ast: estreeLib.estreeMod.Program
  var code: java.lang.String
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: scala.Boolean
  var moduleSideEffects: scala.Boolean | scala.Null
  var originalCode: java.lang.String
  var originalSourcemap: ExistingDecodedSourceMap | scala.Null
  var resolvedIds: js.UndefOr[ResolvedIdMap] = js.undefined
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing]
  var transformDependencies: js.Array[java.lang.String] | scala.Null
}

object TransformModuleJSON {
  @scala.inline
  def apply(
    ast: estreeLib.estreeMod.Program,
    code: java.lang.String,
    customTransformCache: scala.Boolean,
    originalCode: java.lang.String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    moduleSideEffects: js.UndefOr[scala.Boolean] = js.undefined,
    originalSourcemap: ExistingDecodedSourceMap = null,
    resolvedIds: ResolvedIdMap = null,
    transformDependencies: js.Array[java.lang.String] = null
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(ast = ast, code = code, customTransformCache = customTransformCache, originalCode = originalCode, sourcemapChain = sourcemapChain)
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    if (originalSourcemap != null) __obj.updateDynamic("originalSourcemap")(originalSourcemap)
    if (resolvedIds != null) __obj.updateDynamic("resolvedIds")(resolvedIds)
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[TransformModuleJSON]
  }
}

