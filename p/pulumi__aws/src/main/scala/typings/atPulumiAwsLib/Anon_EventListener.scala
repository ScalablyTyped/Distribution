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
    HTTP_DATA: js.Function0[scala.Unit],
    SEND: js.Function0[scala.Unit],
    VALIDATE_CREDENTIALS: js.Function0[scala.Unit],
    VALIDATE_PARAMETERS: js.Function0[scala.Unit],
    VALIDATE_REGION: js.Function0[scala.Unit],
    removeListener: js.Function2[java.lang.String, js.Function, scala.Unit]
  ): Anon_EventListener = {
    val __obj = js.Dynamic.literal(HTTP_DATA = HTTP_DATA, SEND = SEND, VALIDATE_CREDENTIALS = VALIDATE_CREDENTIALS, VALIDATE_PARAMETERS = VALIDATE_PARAMETERS, VALIDATE_REGION = VALIDATE_REGION, removeListener = removeListener)
  
    __obj.asInstanceOf[Anon_EventListener]
  }
}

