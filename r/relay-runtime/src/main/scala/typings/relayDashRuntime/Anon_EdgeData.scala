package typings.relayDashRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionEvent
import typings.relayDashRuntime.relayDashRuntimeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EdgeData[TEdge] extends ConnectionEvent[TEdge] {
  var edgeData: StringDictionary[TEdge]
  var kind: update
}

object Anon_EdgeData {
  @scala.inline
  def apply[TEdge](edgeData: StringDictionary[TEdge], kind: update): Anon_EdgeData[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EdgeData[TEdge]]
  }
}

