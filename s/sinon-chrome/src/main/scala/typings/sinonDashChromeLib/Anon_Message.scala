package typings
package sinonDashChromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(message: java.lang.String = null): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Message]
  }
}

