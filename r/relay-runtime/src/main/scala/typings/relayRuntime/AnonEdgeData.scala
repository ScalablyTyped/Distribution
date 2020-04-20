package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayConnectionMod.ConnectionEvent
import typings.relayRuntime.relayRuntimeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdgeData[TEdge] extends ConnectionEvent[TEdge] {
  var edgeData: StringDictionary[TEdge]
  var kind: update
}

object AnonEdgeData {
  @scala.inline
  def apply[TEdge](edgeData: StringDictionary[TEdge], kind: update): AnonEdgeData[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdgeData[TEdge]]
  }
}

