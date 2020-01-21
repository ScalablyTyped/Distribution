package typings.relayRuntime.relayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import typings.relayRuntime.relayStoreTypesMod.TypedSnapshot
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
    val __obj = js.Dynamic.literal(edgeSnapshots = edgeSnapshots.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], seenRecords = seenRecords.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionSnapshot[TEdge, TState]]
  }
}

