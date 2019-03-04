package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var sagaStack: java.lang.String
}

object ErrorInfo {
  @scala.inline
  def apply(sagaStack: java.lang.String): ErrorInfo = {
    val __obj = js.Dynamic.literal(sagaStack = sagaStack)
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

