package typings.string

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var encloseNumbers: js.UndefOr[Boolean] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[Boolean] = js.undefined
  var qualifier: js.UndefOr[String] = js.undefined
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: String = null,
    encloseNumbers: js.UndefOr[Boolean] = js.undefined,
    escape: String = null,
    keys: js.UndefOr[Boolean] = js.undefined,
    qualifier: String = null
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(encloseNumbers)) __obj.updateDynamic("encloseNumbers")(encloseNumbers.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delimiter]
  }
}

