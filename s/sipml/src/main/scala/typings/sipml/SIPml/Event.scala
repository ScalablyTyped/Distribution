package typings.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var description: String = js.native
  var `type`: String = js.native
  def getContent(): js.Object = js.native
  def getContentString(): String = js.native
  def getContentType(): js.Object = js.native
  def getSipResponseCode(): Double = js.native
}

object Event {
  @scala.inline
  def apply(
    description: String,
    getContent: () => js.Object,
    getContentString: () => String,
    getContentType: () => js.Object,
    getSipResponseCode: () => Double,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode))
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContent(value: () => js.Object): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentString(value: () => String): Self = this.set("getContentString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentType(value: () => js.Object): Self = this.set("getContentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSipResponseCode(value: () => Double): Self = this.set("getSipResponseCode", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

