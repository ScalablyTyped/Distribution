package typings.react.mod

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
  var componentStack: String
}

object ErrorInfo {
  @scala.inline
  def apply(componentStack: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

