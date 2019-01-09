package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object classicMod {
  type ClientMutationID = java.lang.String
  type OnReadyStateChange = js.Function1[/* readyState */ reactDashRelayLib.Anon_Aborted, scala.Unit]
  type ReadyStateEvent = reactDashRelayLib.reactDashRelayLibStrings.ABORT | reactDashRelayLib.reactDashRelayLibStrings.CACHE_RESTORED_REQUIRED | reactDashRelayLib.reactDashRelayLibStrings.CACHE_RESTORE_FAILED | reactDashRelayLib.reactDashRelayLibStrings.CACHE_RESTORE_START | reactDashRelayLib.reactDashRelayLibStrings.NETWORK_QUERY_ERROR | reactDashRelayLib.reactDashRelayLibStrings.NETWORK_QUERY_RECEIVED_ALL | reactDashRelayLib.reactDashRelayLibStrings.NETWORK_QUERY_RECEIVED_REQUIRED | reactDashRelayLib.reactDashRelayLibStrings.NETWORK_QUERY_START | reactDashRelayLib.reactDashRelayLibStrings.STORE_FOUND_ALL | reactDashRelayLib.reactDashRelayLibStrings.STORE_FOUND_REQUIRED
  type RelayMutationStatus = reactDashRelayLib.reactDashRelayLibStrings.UNCOMMITTED | reactDashRelayLib.reactDashRelayLibStrings.COMMIT_QUEUED | reactDashRelayLib.reactDashRelayLibStrings.COLLISION_COMMIT_FAILED | reactDashRelayLib.reactDashRelayLibStrings.COMMITTING | reactDashRelayLib.reactDashRelayLibStrings.COMMIT_FAILED
  type RelayStoreData = js.Any
  type RenderCallback = js.Function1[/* renderState */ RenderStateConfig, js.Any]
  type StoreReaderData = js.Any
  type StoreReaderOptions = js.Any
}
