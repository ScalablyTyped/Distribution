package typings.sipDotJs.libApiReferrerDashReferDashOptionsMod

import typings.sipDotJs.libApiReferrerDashDelegateMod.ReferrerDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferrerReferOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[ReferrerDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}

object ReferrerReferOptions {
  @scala.inline
  def apply(requestDelegate: ReferrerDelegate = null, requestOptions: RequestOptions = null): ReferrerReferOptions = {
    val __obj = js.Dynamic.literal()
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferrerReferOptions]
  }
}

