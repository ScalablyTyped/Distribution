package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionId extends js.Object {
  var sessionId: js.UndefOr[String] = js.undefined
}

object SessionId {
  @scala.inline
  def apply(sessionId: String = null): SessionId = {
    val __obj = js.Dynamic.literal()
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionId]
  }
}

