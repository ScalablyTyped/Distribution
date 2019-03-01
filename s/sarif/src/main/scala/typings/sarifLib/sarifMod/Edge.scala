package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  /**
    * A string that uniquely identifies the edge within its graph.
    */
  var id: java.lang.String
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
  var sourceNodeId: java.lang.String
  /**
    * Identifies the target node (the node at which the edge ends).
    */
  var targetNodeId: java.lang.String
}

object Edge {
  @scala.inline
  def apply(
    id: java.lang.String,
    sourceNodeId: java.lang.String,
    targetNodeId: java.lang.String,
    label: Message = null,
    properties: PropertyBag = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("sourceNodeId")(sourceNodeId)
    __obj.updateDynamic("targetNodeId")(targetNodeId)
    if (label != null) __obj.updateDynamic("label")(label)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Edge]
  }
}

