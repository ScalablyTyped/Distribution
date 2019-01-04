package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[
    (js.Function2[/* m */ java.lang.String, /* n */ java.lang.String, scala.Boolean]) | scala.Boolean
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

