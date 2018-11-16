package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RollupDirOptions extends InputOptions {
  @JSName("cache")
  var cache_RollupDirOptions: js.UndefOr[RollupCache] = js.undefined
  @JSName("input")
  var input_RollupDirOptions: js.Array[java.lang.String] | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var output: js.UndefOr[OutputOptionsDir] = js.undefined
}

