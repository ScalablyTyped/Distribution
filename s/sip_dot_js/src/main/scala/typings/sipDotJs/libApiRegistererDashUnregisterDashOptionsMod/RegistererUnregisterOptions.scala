package typings.sipDotJs.libApiRegistererDashUnregisterDashOptionsMod

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistererUnregisterOptions extends js.Object {
  /**
    * If true, unregister all contacts.
    * @defaultValue false
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}

object RegistererUnregisterOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    requestDelegate: OutgoingRequestDelegate = null,
    requestOptions: RequestOptions = null
  ): RegistererUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    __obj.asInstanceOf[RegistererUnregisterOptions]
  }
}

