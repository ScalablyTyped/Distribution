package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.Web
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageLayoutCreationInformation extends ClientValueObject {
  def get_associatedContentTypeId(): String
  def get_masterPageUrl(): String
  def get_newPageLayoutEditablePath(): String
  def get_newPageLayoutNameWithoutExtension(): String
  def get_web(): Web
  def set_associatedContentTypeId(value: String): String
  def set_masterPageUrl(value: String): String
  def set_newPageLayoutEditablePath(value: String): String
  def set_newPageLayoutNameWithoutExtension(value: String): String
  def set_web(value: Web): Web
}

object PageLayoutCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_associatedContentTypeId: () => String,
    get_masterPageUrl: () => String,
    get_newPageLayoutEditablePath: () => String,
    get_newPageLayoutNameWithoutExtension: () => String,
    get_typeId: () => String,
    get_web: () => Web,
    set_associatedContentTypeId: String => String,
    set_masterPageUrl: String => String,
    set_newPageLayoutEditablePath: String => String,
    set_newPageLayoutNameWithoutExtension: String => String,
    set_web: Web => Web,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PageLayoutCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_associatedContentTypeId = js.Any.fromFunction0(get_associatedContentTypeId), get_masterPageUrl = js.Any.fromFunction0(get_masterPageUrl), get_newPageLayoutEditablePath = js.Any.fromFunction0(get_newPageLayoutEditablePath), get_newPageLayoutNameWithoutExtension = js.Any.fromFunction0(get_newPageLayoutNameWithoutExtension), get_typeId = js.Any.fromFunction0(get_typeId), get_web = js.Any.fromFunction0(get_web), set_associatedContentTypeId = js.Any.fromFunction1(set_associatedContentTypeId), set_masterPageUrl = js.Any.fromFunction1(set_masterPageUrl), set_newPageLayoutEditablePath = js.Any.fromFunction1(set_newPageLayoutEditablePath), set_newPageLayoutNameWithoutExtension = js.Any.fromFunction1(set_newPageLayoutNameWithoutExtension), set_web = js.Any.fromFunction1(set_web), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PageLayoutCreationInformation]
  }
}

