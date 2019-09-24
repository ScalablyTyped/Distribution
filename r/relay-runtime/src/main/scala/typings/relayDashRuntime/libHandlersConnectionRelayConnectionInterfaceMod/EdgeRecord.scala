package typings.relayDashRuntime.libHandlersConnectionRelayConnectionInterfaceMod

import typings.relayDashRuntime.relayDashRuntimeMod.DataID
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: unknown} */ trait EdgeRecord extends js.Object {
  var cursor: js.Any
  var node: Record[DataID, _]
}

object EdgeRecord {
  @scala.inline
  def apply(cursor: js.Any, node: Record[DataID, _]): EdgeRecord = {
    val __obj = js.Dynamic.literal(cursor = cursor, node = node)
  
    __obj.asInstanceOf[EdgeRecord]
  }
}

