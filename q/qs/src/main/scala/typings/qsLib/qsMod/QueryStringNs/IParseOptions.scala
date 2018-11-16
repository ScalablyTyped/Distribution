package typings
package qsLib.qsMod.QueryStringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IParseOptions extends js.Object {
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined
  var arrayLimit: js.UndefOr[scala.Double] = js.undefined
  var decoder: js.UndefOr[js.Function1[/* str */ java.lang.String, _]] = js.undefined
  var delimiter: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var parameterLimit: js.UndefOr[scala.Double] = js.undefined
  var parseArrays: js.UndefOr[scala.Boolean] = js.undefined
  var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

