package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exception extends js.Object {
  /**
    * An array of exception objects each of which is considered a cause of this exception.
    */
  var innerExceptions: js.UndefOr[js.Array[Exception]] = js.undefined
  /**
    * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was
    * thrown, or the symbolic name of a signal.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A message that describes the exception.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the exception.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The sequence of function calls leading to the exception.
    */
  var stack: js.UndefOr[Stack] = js.undefined
}

object Exception {
  @scala.inline
  def apply(
    innerExceptions: js.Array[Exception] = null,
    kind: java.lang.String = null,
    message: Message = null,
    properties: PropertyBag = null,
    stack: Stack = null
  ): Exception = {
    val __obj = js.Dynamic.literal()
    if (innerExceptions != null) __obj.updateDynamic("innerExceptions")(innerExceptions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Exception]
  }
}

