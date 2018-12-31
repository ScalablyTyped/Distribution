package typings
package qsLib.qsMod.QueryStringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var allowDots: js.UndefOr[scala.Boolean] = js.undefined
  var arrayFormat: js.UndefOr[
    qsLib.qsLibStrings.indices | qsLib.qsLibStrings.brackets | qsLib.qsLibStrings.repeat
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[scala.Boolean] = js.undefined
  var encoder: js.UndefOr[js.Function1[/* str */ java.lang.String, _]] = js.undefined
  var filter: js.UndefOr[
    (js.Array[java.lang.String | scala.Double]) | (js.Function2[/* prefix */ java.lang.String, /* value */ js.Any, _])
  ] = js.undefined
  var format: js.UndefOr[qsLib.qsLibStrings.RFC1738 | qsLib.qsLibStrings.RFC3986] = js.undefined
  var indices: js.UndefOr[scala.Boolean] = js.undefined
  var serializeDate: js.UndefOr[js.Function1[/* d */ stdLib.Date, java.lang.String]] = js.undefined
  var skipNulls: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  var strictNullHandling: js.UndefOr[scala.Boolean] = js.undefined
}

