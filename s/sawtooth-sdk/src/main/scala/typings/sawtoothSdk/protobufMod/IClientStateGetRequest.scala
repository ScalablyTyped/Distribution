package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientStateGetRequest extends js.Object {
  /** ClientStateGetRequest address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** ClientStateGetRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
}

object IClientStateGetRequest {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | String] = js.undefined,
    stateRoot: js.UndefOr[Null | String] = js.undefined
  ): IClientStateGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(stateRoot)) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateGetRequest]
  }
}

