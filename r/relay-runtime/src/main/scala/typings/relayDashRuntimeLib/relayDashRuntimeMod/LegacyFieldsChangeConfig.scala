package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unused in Relay Modern
trait LegacyFieldsChangeConfig extends DeclarativeMutationConfig {
  var fieldIDs: org.scalablytyped.runtime.StringDictionary[DataID | js.Array[DataID]]
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.FIELDS_CHANGE
}

object LegacyFieldsChangeConfig {
  @scala.inline
  def apply(
    fieldIDs: org.scalablytyped.runtime.StringDictionary[DataID | js.Array[DataID]],
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.FIELDS_CHANGE
  ): LegacyFieldsChangeConfig = {
    val __obj = js.Dynamic.literal(fieldIDs = fieldIDs)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LegacyFieldsChangeConfig]
  }
}

