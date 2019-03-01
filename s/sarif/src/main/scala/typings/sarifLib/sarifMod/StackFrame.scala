package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * The address of the method or function that is executing.
    */
  var address: js.UndefOr[scala.Double] = js.undefined
  /**
    * The location to which this stack frame refers.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the module that contains the code of this stack frame.
    */
  var module: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset from the method or function that is executing.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
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
    address: scala.Int | scala.Double = null,
    location: Location = null,
    module: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    parameters: js.Array[java.lang.String] = null,
    properties: PropertyBag = null,
    threadId: scala.Int | scala.Double = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (module != null) __obj.updateDynamic("module")(module)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

