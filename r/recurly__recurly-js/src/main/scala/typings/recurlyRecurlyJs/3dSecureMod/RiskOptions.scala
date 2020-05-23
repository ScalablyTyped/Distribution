package typings.recurlyRecurlyJs.`3dSecureMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiskOptions extends js.Object {
  var actionTokenId: js.UndefOr[String] = js.undefined
}

object RiskOptions {
  @scala.inline
  def apply(actionTokenId: String = null): RiskOptions = {
    val __obj = js.Dynamic.literal()
    if (actionTokenId != null) __obj.updateDynamic("actionTokenId")(actionTokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskOptions]
  }
}

