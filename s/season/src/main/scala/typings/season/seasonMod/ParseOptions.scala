package typings.season.seasonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allowDuplicateKeys: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(allowDuplicateKeys: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicateKeys)) __obj.updateDynamic("allowDuplicateKeys")(allowDuplicateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

