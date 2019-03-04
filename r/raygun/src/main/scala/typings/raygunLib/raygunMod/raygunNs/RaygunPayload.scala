package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: raygunLib.Anon_Client
  var occurredOn: stdLib.Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: raygunLib.Anon_Client, occurredOn: stdLib.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details, occurredOn = occurredOn)
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

