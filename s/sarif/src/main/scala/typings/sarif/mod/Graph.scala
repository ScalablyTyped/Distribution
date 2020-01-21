package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  /**
    * A description of the graph.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * An array of edge objects representing the edges of the graph.
    */
  var edges: js.UndefOr[js.Array[Edge]] = js.undefined
  /**
    * An array of node objects representing the nodes of the graph.
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the graph.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Graph {
  @scala.inline
  def apply(
    description: Message = null,
    edges: js.Array[Edge] = null,
    nodes: js.Array[Node] = null,
    properties: PropertyBag = null
  ): Graph = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

