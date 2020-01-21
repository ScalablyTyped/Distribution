package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var sagaStack: String
}

object ErrorInfo {
  @scala.inline
  def apply(sagaStack: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(sagaStack = sagaStack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

