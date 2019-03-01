package typings
package reapopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: reapopLib.reapopMod.Notification
  var `type`: java.lang.String
}

object Anon_Payload {
  @scala.inline
  def apply(payload: reapopLib.reapopMod.Notification, `type`: java.lang.String): Anon_Payload = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_Payload]
  }
}

