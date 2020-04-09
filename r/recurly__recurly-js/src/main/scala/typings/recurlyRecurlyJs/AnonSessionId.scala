package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSessionId extends js.Object {
  var sessionId: js.UndefOr[String] = js.undefined
}

object AnonSessionId {
  @scala.inline
  def apply(sessionId: String = null): AnonSessionId = {
    val __obj = js.Dynamic.literal()
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSessionId]
  }
}

