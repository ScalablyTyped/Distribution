package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeFlow extends js.Object {
  /**
    * A message relevant to the code flow.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the code flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a
    * thread of execution.
    */
  var threadFlows: js.Array[ThreadFlow]
}

