package typings.relayDashRuntime.libStoreRelayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.TypedSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionSnapshot[TEdge, TState] extends js.Object {
  var edgeSnapshots: StringDictionary[TypedSnapshot[TEdge]]
  var id: ConnectionID
  var reference: ConnectionReference[TEdge]
  var seenRecords: RecordMap
  var state: TState
}

object ConnectionSnapshot {
  @scala.inline
  def apply[TEdge, TState](
    edgeSnapshots: StringDictionary[TypedSnapshot[TEdge]],
    id: ConnectionID,
    reference: ConnectionReference[TEdge],
    seenRecords: RecordMap,
    state: TState
  ): ConnectionSnapshot[TEdge, TState] = {
    val __obj = js.Dynamic.literal(edgeSnapshots = edgeSnapshots, id = id, reference = reference, seenRecords = seenRecords, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionSnapshot[TEdge, TState]]
  }
}

