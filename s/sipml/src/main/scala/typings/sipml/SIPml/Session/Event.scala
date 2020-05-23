package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends typings.sipml.SIPml.Event {
  var session: typings.sipml.SIPml.Session
  def getTransferDestinationFriendlyName(): String
}

object Event {
  @scala.inline
  def apply(
    description: String,
    getContent: () => js.Object,
    getContentString: () => String,
    getContentType: () => js.Object,
    getSipResponseCode: () => Double,
    getTransferDestinationFriendlyName: () => String,
    session: typings.sipml.SIPml.Session,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode), getTransferDestinationFriendlyName = js.Any.fromFunction0(getTransferDestinationFriendlyName), session = session.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

