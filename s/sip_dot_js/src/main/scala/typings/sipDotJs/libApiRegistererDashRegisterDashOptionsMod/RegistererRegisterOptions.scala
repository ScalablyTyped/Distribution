package typings.sipDotJs.libApiRegistererDashRegisterDashOptionsMod

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistererRegisterOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}

object RegistererRegisterOptions {
  @scala.inline
  def apply(requestDelegate: OutgoingRequestDelegate = null, requestOptions: RequestOptions = null): RegistererRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    __obj.asInstanceOf[RegistererRegisterOptions]
  }
}

