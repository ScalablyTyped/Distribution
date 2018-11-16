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

