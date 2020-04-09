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
  def apply(stateRoot: String = null, status: Status = null, value: Uint8Array = null): IClientStateGetResponse = {
    val __obj = js.Dynamic.literal()
    if (stateRoot != null) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateGetResponse]
  }
}

