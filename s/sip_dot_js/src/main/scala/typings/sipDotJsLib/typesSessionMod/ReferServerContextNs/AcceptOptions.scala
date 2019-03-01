package typings
package sipDotJsLib.typesSessionMod.ReferServerContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /** If true, accept REFER request and automatically attempt to follow it. */
  var followRefer: js.UndefOr[scala.Boolean] = js.undefined
  /** If followRefer is true, options to following INVITE request. */
  var inviteOptions: js.UndefOr[sipDotJsLib.typesSessionMod.InviteClientContextNs.Options] = js.undefined
}

object AcceptOptions {
  @scala.inline
  def apply(
    followRefer: js.UndefOr[scala.Boolean] = js.undefined,
    inviteOptions: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options = null
  ): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followRefer)) __obj.updateDynamic("followRefer")(followRefer)
    if (inviteOptions != null) __obj.updateDynamic("inviteOptions")(inviteOptions)
    __obj.asInstanceOf[AcceptOptions]
  }
}

