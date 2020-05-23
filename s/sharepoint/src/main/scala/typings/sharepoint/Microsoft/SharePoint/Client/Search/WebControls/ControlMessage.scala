package typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlMessage extends ClientValueObject {
  def get_code(): Double
  def get_correlationID(): String
  def get_encodeDetails(): Boolean
  def get_header(): String
  def get_level(): MessageLevel
  def get_messageDetails(): String
  def get_messageDetailsForViewers(): String
  def get_serverTypeId(): String
  def get_showForViewerUsers(): Boolean
  def get_showInEditModeOnly(): Boolean
  def get_stackTrace(): String
  def get_type(): String
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
}

