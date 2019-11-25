package typings.sicDashEcies.sicDashEciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECIESOptions extends js.Object {
  var noKey: js.UndefOr[Boolean] = js.undefined
  var shortTag: js.UndefOr[Boolean] = js.undefined
}

object ECIESOptions {
  @scala.inline
  def apply(noKey: js.UndefOr[Boolean] = js.undefined, shortTag: js.UndefOr[Boolean] = js.undefined): ECIESOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noKey)) __obj.updateDynamic("noKey")(noKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shortTag)) __obj.updateDynamic("shortTag")(shortTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECIESOptions]
  }
}

