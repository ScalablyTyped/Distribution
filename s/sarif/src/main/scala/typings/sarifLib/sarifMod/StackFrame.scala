package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * The location to which this stack frame refers.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the module that contains the code of this stack frame.
    */
  var module: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parameters of the call that is executing.
    */
  var parameters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the stack frame.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The thread identifier of the stack frame.
    */
  var threadId: js.UndefOr[scala.Double] = js.undefined
}

object StackFrame {
  @scala.inline
  def apply(
    location: Location = null,
    module: java.lang.String = null,
    parameters: js.Array[java.lang.String] = null,
    properties: PropertyBag = null,
    threadId: scala.Int | scala.Double = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (module != null) __obj.updateDynamic("module")(module)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

