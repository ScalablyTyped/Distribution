package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.relayDashRuntimeStrings.FIELDS_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unused in Relay Modern
trait LegacyFieldsChangeConfig extends DeclarativeMutationConfig {
  var fieldIDs: StringDictionary[DataID | js.Array[DataID]]
  var `type`: FIELDS_CHANGE
}

object LegacyFieldsChangeConfig {
  @scala.inline
  def apply(fieldIDs: StringDictionary[DataID | js.Array[DataID]], `type`: FIELDS_CHANGE): LegacyFieldsChangeConfig = {
    val __obj = js.Dynamic.literal(fieldIDs = fieldIDs)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LegacyFieldsChangeConfig]
  }
}

