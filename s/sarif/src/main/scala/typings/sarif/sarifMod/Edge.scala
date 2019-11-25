package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  /**
    * A string that uniquely identifies the edge within its graph.
    */
  var id: String
  /**
    * A short description of the edge.
    */
  var label: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the edge.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Identifies the source node (the node at which the edge starts).
    */
  var sourceNodeId: String
  /**
    * Identifies the target node (the node at which the edge ends).
    */
  var targetNodeId: String
}

object Edge {
  @scala.inline
  def apply(
    id: String,
    sourceNodeId: String,
    targetNodeId: String,
    label: Message = null,
    properties: PropertyBag = null
  ): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceNodeId = sourceNodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

