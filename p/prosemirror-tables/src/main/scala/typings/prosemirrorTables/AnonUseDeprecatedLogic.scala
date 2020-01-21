package typings.prosemirrorTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseDeprecatedLogic extends js.Object {
  var useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined
}

object AnonUseDeprecatedLogic {
  @scala.inline
  def apply(useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined): AnonUseDeprecatedLogic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeprecatedLogic)) __obj.updateDynamic("useDeprecatedLogic")(useDeprecatedLogic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseDeprecatedLogic]
  }
}

