package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: raygun4jsLib.Anon_Client
  var OccurredOn: stdLib.Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: raygun4jsLib.Anon_Client, OccurredOn: stdLib.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details, OccurredOn = OccurredOn)
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

