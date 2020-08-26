package typings.sipml.SIPml.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends typings.sipml.SIPml.Event {
  var session: typings.sipml.SIPml.Session = js.native
  def getTransferDestinationFriendlyName(): String = js.native
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
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTransferDestinationFriendlyName(value: () => String): Self = this.set("getTransferDestinationFriendlyName", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: typings.sipml.SIPml.Session): Self = this.set("session", value.asInstanceOf[js.Any])
  }
  
}

