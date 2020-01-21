package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeTraversal extends js.Object {
  /**
    * Identifies the edge being traversed.
    */
  var edgeId: String
  /**
    * The values of relevant expressions after the edge has been traversed.
    */
  var finalState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * A message to display to the user as the edge is traversed.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the edge traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The number of edge traversals necessary to return from a nested graph.
    */
  var stepOverEdgeCount: js.UndefOr[Double] = js.undefined
}

object EdgeTraversal {
  @scala.inline
  def apply(
    edgeId: String,
    finalState: StringDictionary[MultiformatMessageString] = null,
    message: Message = null,
    properties: PropertyBag = null,
    stepOverEdgeCount: Int | Double = null
  ): EdgeTraversal = {
    val __obj = js.Dynamic.literal(edgeId = edgeId.asInstanceOf[js.Any])
    if (finalState != null) __obj.updateDynamic("finalState")(finalState.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (stepOverEdgeCount != null) __obj.updateDynamic("stepOverEdgeCount")(stepOverEdgeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeTraversal]
  }
}

