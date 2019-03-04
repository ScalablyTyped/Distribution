package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FIELDS_CHANGE extends RelayMutationConfig {
  var fieldIDs: org.scalablytyped.runtime.StringDictionary[DataID | js.Array[DataID]]
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.FIELDS_CHANGE
}

object FIELDS_CHANGE {
  @scala.inline
  def apply(
    fieldIDs: org.scalablytyped.runtime.StringDictionary[DataID | js.Array[DataID]],
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.FIELDS_CHANGE
  ): FIELDS_CHANGE = {
    val __obj = js.Dynamic.literal(fieldIDs = fieldIDs)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FIELDS_CHANGE]
  }
}

