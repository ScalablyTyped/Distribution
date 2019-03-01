package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: java.lang.String | nodeLib.Buffer | js.Array[scala.Double]
  var includeDelimiter: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: java.lang.String | nodeLib.Buffer | js.Array[scala.Double],
    includeDelimiter: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDelimiter)) __obj.updateDynamic("includeDelimiter")(includeDelimiter)
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

