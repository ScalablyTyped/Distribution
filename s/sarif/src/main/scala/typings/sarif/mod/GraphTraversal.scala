package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
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
    * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The index within the result.graphs to be associated with the result.
    */
  var resultGraphIndex: js.UndefOr[Double] = js.undefined
  /**
    * The index within the run.graphs to be associated with the result.
    */
  var runGraphIndex: js.UndefOr[Double] = js.undefined
}

object GraphTraversal {
  @scala.inline
  def apply(
    description: Message = null,
    edgeTraversals: js.Array[EdgeTraversal] = null,
    immutableState: StringDictionary[MultiformatMessageString] = null,
    initialState: StringDictionary[MultiformatMessageString] = null,
    properties: PropertyBag = null,
    resultGraphIndex: js.UndefOr[Double] = js.undefined,
    runGraphIndex: js.UndefOr[Double] = js.undefined
  ): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edgeTraversals != null) __obj.updateDynamic("edgeTraversals")(edgeTraversals.asInstanceOf[js.Any])
    if (immutableState != null) __obj.updateDynamic("immutableState")(immutableState.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(resultGraphIndex)) __obj.updateDynamic("resultGraphIndex")(resultGraphIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runGraphIndex)) __obj.updateDynamic("runGraphIndex")(runGraphIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphTraversal]
  }
}

