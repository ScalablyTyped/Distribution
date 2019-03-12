package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventListener extends js.Object {
  def HTTP_DATA(): scala.Unit
  def SEND(): scala.Unit
  def VALIDATE_CREDENTIALS(): scala.Unit
  def VALIDATE_PARAMETERS(): scala.Unit
  def VALIDATE_REGION(): scala.Unit
  def removeListener(eventName: java.lang.String, eventListener: js.Function): scala.Unit
}

object Anon_EventListener {
  @scala.inline
  def apply(
    HTTP_DATA: () => scala.Unit,
    SEND: () => scala.Unit,
    VALIDATE_CREDENTIALS: () => scala.Unit,
    VALIDATE_PARAMETERS: () => scala.Unit,
    VALIDATE_REGION: () => scala.Unit,
    removeListener: (java.lang.String, js.Function) => scala.Unit
  ): Anon_EventListener = {
    val __obj = js.Dynamic.literal(HTTP_DATA = js.Any.fromFunction0(HTTP_DATA), SEND = js.Any.fromFunction0(SEND), VALIDATE_CREDENTIALS = js.Any.fromFunction0(VALIDATE_CREDENTIALS), VALIDATE_PARAMETERS = js.Any.fromFunction0(VALIDATE_PARAMETERS), VALIDATE_REGION = js.Any.fromFunction0(VALIDATE_REGION), removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[Anon_EventListener]
  }
}

