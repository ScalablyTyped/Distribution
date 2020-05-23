package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusRegisterRequest extends js.Object {
  /** ConsensusRegisterRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** ConsensusRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.undefined
}

object IConsensusRegisterRequest {
  @scala.inline
  def apply(name: js.UndefOr[Null | String] = js.undefined, version: js.UndefOr[Null | String] = js.undefined): IConsensusRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusRegisterRequest]
  }
}

