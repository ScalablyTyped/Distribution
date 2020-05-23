package typings.prosemirrorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseDeprecatedLogic extends js.Object {
  var useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined
}

object UseDeprecatedLogic {
  @scala.inline
  def apply(useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined): UseDeprecatedLogic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeprecatedLogic)) __obj.updateDynamic("useDeprecatedLogic")(useDeprecatedLogic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDeprecatedLogic]
  }
}

