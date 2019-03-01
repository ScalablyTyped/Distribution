package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Error Interfaces
// ----------------------------------------------------------------------
trait ErrorInfo extends js.Object {
  /**
    * Captures which component contained the exception, and its ancestors.
    */
  var componentStack: java.lang.String
}

object ErrorInfo {
  @scala.inline
  def apply(componentStack: java.lang.String): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentStack")(componentStack)
    __obj.asInstanceOf[ErrorInfo]
  }
}

