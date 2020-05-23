package typings.sipml.SIPml.Stack

import typings.sipml.SIPml.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends typings.sipml.SIPml.Event {
  var newSession: Session
}

object Event {
  @scala.inline
  def apply(
    description: String,
    getContent: () => js.Object,
    getContentString: () => String,
    getContentType: () => js.Object,
    getSipResponseCode: () => Double,
    newSession: Session,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode), newSession = newSession.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

