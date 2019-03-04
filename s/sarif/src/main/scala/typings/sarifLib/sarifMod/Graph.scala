package typings
package sarifLib.sarifMod

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
    * A string that uniquely identifies the graph within a run.graphs or result.graphs array.
    */
  var id: java.lang.String
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
    id: java.lang.String,
    description: Message = null,
    edges: js.Array[Edge] = null,
    nodes: js.Array[Node] = null,
    properties: PropertyBag = null
  ): Graph = {
    val __obj = js.Dynamic.literal(id = id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Graph]
  }
}

