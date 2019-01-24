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
  var edgeTraversals: js.Array[EdgeTraversal]
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

