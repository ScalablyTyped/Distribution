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
    * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
    */
  var immutableState: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
    */
  var initialState: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The index within the result.graphs to be associated with the result.
    */
  var resultGraphIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The index within the run.graphs to be associated with the result.
    */
  var runGraphIndex: js.UndefOr[scala.Double] = js.undefined
}

object GraphTraversal {
  @scala.inline
  def apply(
    description: Message = null,
    edgeTraversals: js.Array[EdgeTraversal] = null,
    immutableState: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    initialState: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    properties: PropertyBag = null,
    resultGraphIndex: scala.Int | scala.Double = null,
    runGraphIndex: scala.Int | scala.Double = null
  ): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (edgeTraversals != null) __obj.updateDynamic("edgeTraversals")(edgeTraversals)
    if (immutableState != null) __obj.updateDynamic("immutableState")(immutableState)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (resultGraphIndex != null) __obj.updateDynamic("resultGraphIndex")(resultGraphIndex.asInstanceOf[js.Any])
    if (runGraphIndex != null) __obj.updateDynamic("runGraphIndex")(runGraphIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphTraversal]
  }
}

