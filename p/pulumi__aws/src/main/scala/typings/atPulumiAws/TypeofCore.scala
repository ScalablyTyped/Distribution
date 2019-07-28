package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCore extends js.Object {
  def HTTP_DATA(): Unit
  def SEND(): Unit
  def VALIDATE_CREDENTIALS(): Unit
  def VALIDATE_PARAMETERS(): Unit
  def VALIDATE_REGION(): Unit
  def removeListener(eventName: String, eventListener: js.Function): Unit
}

object TypeofCore {
  @scala.inline
  def apply(
    HTTP_DATA: () => Unit,
    SEND: () => Unit,
    VALIDATE_CREDENTIALS: () => Unit,
    VALIDATE_PARAMETERS: () => Unit,
    VALIDATE_REGION: () => Unit,
    removeListener: (String, js.Function) => Unit
  ): TypeofCore = {
    val __obj = js.Dynamic.literal(HTTP_DATA = js.Any.fromFunction0(HTTP_DATA), SEND = js.Any.fromFunction0(SEND), VALIDATE_CREDENTIALS = js.Any.fromFunction0(VALIDATE_CREDENTIALS), VALIDATE_PARAMETERS = js.Any.fromFunction0(VALIDATE_PARAMETERS), VALIDATE_REGION = js.Any.fromFunction0(VALIDATE_REGION), removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[TypeofCore]
  }
}

