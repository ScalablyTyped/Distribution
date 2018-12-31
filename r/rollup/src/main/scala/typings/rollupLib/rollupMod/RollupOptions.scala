package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupOptions extends InputOptions {
  @JSName("cache")
  var cache_RollupOptions: js.UndefOr[RollupCache] = js.undefined
  @JSName("input")
  var input_RollupOptions: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var output: js.UndefOr[OutputOptions] = js.undefined
}

