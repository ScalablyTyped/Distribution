package typings
package seasonLib.seasonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allowDuplicateKeys: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(allowDuplicateKeys: js.UndefOr[scala.Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicateKeys)) __obj.updateDynamic("allowDuplicateKeys")(allowDuplicateKeys)
    __obj.asInstanceOf[ParseOptions]
  }
}

