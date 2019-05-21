package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorData | scala.Null] = js.undefined
  var seenRecords: relayDashRuntimeLib.relayDashRuntimeMod.RecordMap
}

object Anon_Data {
  @scala.inline
  def apply(
    seenRecords: relayDashRuntimeLib.relayDashRuntimeMod.RecordMap,
    data: relayDashRuntimeLib.relayDashRuntimeMod.SelectorData = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(seenRecords = seenRecords)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Data]
  }
}

