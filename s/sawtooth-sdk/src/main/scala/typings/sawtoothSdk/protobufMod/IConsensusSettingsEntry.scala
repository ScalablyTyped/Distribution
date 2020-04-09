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
  def apply(key: String = null, value: String = null): IConsensusSettingsEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSettingsEntry]
  }
}

