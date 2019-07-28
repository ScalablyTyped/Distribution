package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * Array of child nodes.
    */
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  /**
    * A string that uniquely identifies the node within its graph.
    */
  var id: String
  /**
    * A short description of the node.
    */
  var label: js.UndefOr[Message] = js.undefined
  /**
    * A code location associated with the node.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * Key/value pairs that provide additional information about the node.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    id: String,
    children: js.Array[Node] = null,
    label: Message = null,
    location: Location = null,
    properties: PropertyBag = null
  ): Node = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (location != null) __obj.updateDynamic("location")(location)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Node]
  }
}

