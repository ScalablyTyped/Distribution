package typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlMessage extends ClientValueObject {
  def get_code(): Double = js.native
  def get_correlationID(): String = js.native
  def get_encodeDetails(): Boolean = js.native
  def get_header(): String = js.native
  def get_level(): MessageLevel = js.native
  def get_messageDetails(): String = js.native
  def get_messageDetailsForViewers(): String = js.native
  def get_serverTypeId(): String = js.native
  def get_showForViewerUsers(): Boolean = js.native
  def get_showInEditModeOnly(): Boolean = js.native
  def get_stackTrace(): String = js.native
  def get_type(): String = js.native
}

object ControlMessage {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_code: () => Double,
    get_correlationID: () => String,
    get_encodeDetails: () => Boolean,
    get_header: () => String,
    get_level: () => MessageLevel,
    get_messageDetails: () => String,
    get_messageDetailsForViewers: () => String,
    get_serverTypeId: () => String,
    get_showForViewerUsers: () => Boolean,
    get_showInEditModeOnly: () => Boolean,
    get_stackTrace: () => String,
    get_type: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ControlMessage = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_code = js.Any.fromFunction0(get_code), get_correlationID = js.Any.fromFunction0(get_correlationID), get_encodeDetails = js.Any.fromFunction0(get_encodeDetails), get_header = js.Any.fromFunction0(get_header), get_level = js.Any.fromFunction0(get_level), get_messageDetails = js.Any.fromFunction0(get_messageDetails), get_messageDetailsForViewers = js.Any.fromFunction0(get_messageDetailsForViewers), get_serverTypeId = js.Any.fromFunction0(get_serverTypeId), get_showForViewerUsers = js.Any.fromFunction0(get_showForViewerUsers), get_showInEditModeOnly = js.Any.fromFunction0(get_showInEditModeOnly), get_stackTrace = js.Any.fromFunction0(get_stackTrace), get_type = js.Any.fromFunction0(get_type), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ControlMessage]
  }
  @scala.inline
  implicit class ControlMessageOps[Self <: ControlMessage] (val x: Self) extends AnyVal {
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
    def setGet_code(value: () => Double): Self = this.set("get_code", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_correlationID(value: () => String): Self = this.set("get_correlationID", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_encodeDetails(value: () => Boolean): Self = this.set("get_encodeDetails", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_header(value: () => String): Self = this.set("get_header", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_level(value: () => MessageLevel): Self = this.set("get_level", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_messageDetails(value: () => String): Self = this.set("get_messageDetails", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_messageDetailsForViewers(value: () => String): Self = this.set("get_messageDetailsForViewers", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_serverTypeId(value: () => String): Self = this.set("get_serverTypeId", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_showForViewerUsers(value: () => Boolean): Self = this.set("get_showForViewerUsers", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_showInEditModeOnly(value: () => Boolean): Self = this.set("get_showInEditModeOnly", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_stackTrace(value: () => String): Self = this.set("get_stackTrace", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_type(value: () => String): Self = this.set("get_type", js.Any.fromFunction0(value))
  }
  
}

