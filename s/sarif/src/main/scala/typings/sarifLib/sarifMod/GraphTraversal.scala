package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphTraversal extends js.Object {
  /**
    * A description of this graph traversal.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The sequences of edges traversed by this graph traversal.
    */
  var edgeTraversals: js.UndefOr[js.Array[EdgeTraversal]] = js.undefined
  /**
    * A string that uniquely identifies that graph being traversed.
    */
  var graphId: java.lang.String
  /**
    * Values of relevant expressions at the start of the graph traversal.
    */
  var initialState: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object GraphTraversal {
  @scala.inline
  def apply(
    graphId: java.lang.String,
    description: Message = null,
    edgeTraversals: js.Array[EdgeTraversal] = null,
    initialState: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    properties: PropertyBag = null
  ): GraphTraversal = {
    val __obj = js.Dynamic.literal(graphId = graphId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (edgeTraversals != null) __obj.updateDynamic("edgeTraversals")(edgeTraversals)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[GraphTraversal]
  }
}

