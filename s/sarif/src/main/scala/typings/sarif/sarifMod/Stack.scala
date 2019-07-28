package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  /**
    * An array of stack frames that represents a sequence of calls, rendered in reverse chronological order, that
    * comprise the call stack.
    */
  var frames: js.Array[StackFrame]
  /**
    * A message relevant to this call stack.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the stack.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Stack {
  @scala.inline
  def apply(frames: js.Array[StackFrame], message: Message = null, properties: PropertyBag = null): Stack = {
    val __obj = js.Dynamic.literal(frames = frames)
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Stack]
  }
}

