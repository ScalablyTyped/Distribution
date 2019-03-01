package typings
package stringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var encloseNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var escape: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[scala.Boolean] = js.undefined
  var qualifier: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    encloseNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    escape: java.lang.String = null,
    keys: js.UndefOr[scala.Boolean] = js.undefined,
    qualifier: java.lang.String = null
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(encloseNumbers)) __obj.updateDynamic("encloseNumbers")(encloseNumbers)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

