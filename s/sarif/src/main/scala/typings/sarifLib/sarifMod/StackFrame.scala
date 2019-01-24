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

