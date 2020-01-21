package typings.relayRuntime.relayConnectionMod

import typings.relayRuntime.readerNodeMod.ReaderLinkedField
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionReference[TEdge] extends js.Object {
  var edgesField: ReaderLinkedField
  var id: ConnectionID
  var label: String
  var variables: Variables
}

object ConnectionReference {
  @scala.inline
  def apply[TEdge](edgesField: ReaderLinkedField, id: ConnectionID, label: String, variables: Variables): ConnectionReference[TEdge] = {
    val __obj = js.Dynamic.literal(edgesField = edgesField.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionReference[TEdge]]
  }
}

