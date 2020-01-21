package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveKeys extends js.Object {
  var preserveKeys: js.UndefOr[Boolean] = js.undefined
}

object AnonPreserveKeys {
  @scala.inline
  def apply(preserveKeys: js.UndefOr[Boolean] = js.undefined): AnonPreserveKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveKeys)) __obj.updateDynamic("preserveKeys")(preserveKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveKeys]
  }
}

