package typings.string.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var encloseNumbers: js.UndefOr[Boolean] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[Boolean] = js.undefined
  var qualifier: js.UndefOr[String] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(
    delimiter: String = null,
    encloseNumbers: js.UndefOr[Boolean] = js.undefined,
    escape: String = null,
    keys: js.UndefOr[Boolean] = js.undefined,
    qualifier: String = null
  ): Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(encloseNumbers)) __obj.updateDynamic("encloseNumbers")(encloseNumbers.get.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.get.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

