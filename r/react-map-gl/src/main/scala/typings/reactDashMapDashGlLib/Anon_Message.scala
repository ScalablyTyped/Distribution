package typings
package reactDashMapDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: java.lang.String
  var status: scala.Double
}

object Anon_Message {
  @scala.inline
  def apply(message: java.lang.String, status: scala.Double): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_Message]
  }
}

