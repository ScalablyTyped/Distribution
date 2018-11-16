package typings
package streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilterOptions
  extends nodeLib.streamMod.internalNs.TransformOptions {
  var allowEmptyReplacement: js.UndefOr[scala.Boolean] = js.undefined
  var filter: java.lang.String | stdLib.RegExp | FilterFunction
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var pathSeparator: js.UndefOr[java.lang.String] = js.undefined
  var replacement: js.UndefOr[js.Array[Token] | ReplacementFunction] = js.undefined
  var streamKeys: js.UndefOr[scala.Boolean] = js.undefined
  var streamValues: js.UndefOr[scala.Boolean] = js.undefined
}

