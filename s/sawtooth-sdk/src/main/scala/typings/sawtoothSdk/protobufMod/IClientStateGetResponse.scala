package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientStateGetResponse extends js.Object {
  /** ClientStateGetResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
  /** ClientStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  /** ClientStateGetResponse value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IClientStateGetResponse {
  @scala.inline
  def apply(
    stateRoot: js.UndefOr[Null | String] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined,
    value: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IClientStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateRoot)) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateGetResponse]
  }
}

