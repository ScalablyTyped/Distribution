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
  def apply(name: String = null, version: String = null): IConsensusRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusRegisterRequest]
  }
}

