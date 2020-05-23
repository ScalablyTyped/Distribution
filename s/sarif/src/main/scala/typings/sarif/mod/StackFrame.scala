package typings.sarif.mod

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
  var module: js.UndefOr[String] = js.undefined
  /**
    * The parameters of the call that is executing.
    */
  var parameters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the stack frame.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The thread identifier of the stack frame.
    */
  var threadId: js.UndefOr[Double] = js.undefined
}

object StackFrame {
  @scala.inline
  def apply(
    location: Location = null,
    module: String = null,
    parameters: js.Array[String] = null,
    properties: PropertyBag = null,
    threadId: js.UndefOr[Double] = js.undefined
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(threadId)) __obj.updateDynamic("threadId")(threadId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

