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
  var resolvedIds: IdMap
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
    resolvedIds: IdMap,
    sourcemapChain: js.Array[RawSourceMap],
    transformAssets: js.Array[Asset] | scala.Unit,
    transformDependencies: js.Array[java.lang.String] = null
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("customTransformCache")(customTransformCache)
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("originalCode")(originalCode)
    __obj.updateDynamic("originalSourcemap")(originalSourcemap.asInstanceOf[js.Any])
    __obj.updateDynamic("resolvedIds")(resolvedIds)
    __obj.updateDynamic("sourcemapChain")(sourcemapChain)
    __obj.updateDynamic("transformAssets")(transformAssets.asInstanceOf[js.Any])
    if (transformDependencies != null) __obj.updateDynamic("transformDependencies")(transformDependencies)
    __obj.asInstanceOf[ModuleJSON]
  }
}

