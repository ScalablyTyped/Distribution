package typings
package sarifLib.sarifMod

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
  var id: java.lang.String
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

