package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSettingsEntry extends js.Object {
  /** ConsensusSettingsEntry key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** ConsensusSettingsEntry value */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IConsensusSettingsEntry {
  @scala.inline
  def apply(key: js.UndefOr[Null | String] = js.undefined, value: js.UndefOr[Null | String] = js.undefined): IConsensusSettingsEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSettingsEntry]
  }
}

