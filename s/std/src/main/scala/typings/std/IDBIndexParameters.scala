package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBIndexParameters extends js.Object {
  var multiEntry: js.UndefOr[scala.Boolean] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object IDBIndexParameters {
  @scala.inline
  def apply(
    multiEntry: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiEntry)) __obj.updateDynamic("multiEntry")(multiEntry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBIndexParameters]
  }
}

