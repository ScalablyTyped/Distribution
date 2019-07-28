package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledMfaDelete extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var mfaDelete: js.UndefOr[Boolean] = js.undefined
}

object Anon_EnabledMfaDelete {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, mfaDelete: js.UndefOr[Boolean] = js.undefined): Anon_EnabledMfaDelete = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(mfaDelete)) __obj.updateDynamic("mfaDelete")(mfaDelete)
    __obj.asInstanceOf[Anon_EnabledMfaDelete]
  }
}

