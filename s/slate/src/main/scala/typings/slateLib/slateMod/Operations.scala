package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operations extends js.Object {
  @JSName("apply")
  def apply(value: Value, operation: Operation): Value
  def invert(operation: Operation): Operation
}

object Operations {
  @scala.inline
  def apply(apply: (Value, Operation) => Value, invert: Operation => Operation): Operations = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), invert = js.Any.fromFunction1(invert))
  
    __obj.asInstanceOf[Operations]
  }
}

