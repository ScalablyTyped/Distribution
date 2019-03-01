package typings
package restifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: java.lang.String
}

object Anon_Message {
  @scala.inline
  def apply(message: java.lang.String): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Message]
  }
}

