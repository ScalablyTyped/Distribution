package typings.react.reactMod

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
    val __obj = js.Dynamic.literal(componentStack = componentStack)
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

