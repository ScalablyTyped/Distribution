package typings.sipDotJs.libReferContextMod.ReferServerContext

import typings.sipDotJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /** If true, accept REFER request and automatically attempt to follow it. */
  var followRefer: js.UndefOr[Boolean] = js.undefined
  /** If followRefer is true, options to following INVITE request. */
  var inviteOptions: js.UndefOr[Options] = js.undefined
}

object AcceptOptions {
  @scala.inline
  def apply(followRefer: js.UndefOr[Boolean] = js.undefined, inviteOptions: Options = null): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followRefer)) __obj.updateDynamic("followRefer")(followRefer.asInstanceOf[js.Any])
    if (inviteOptions != null) __obj.updateDynamic("inviteOptions")(inviteOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptOptions]
  }
}

