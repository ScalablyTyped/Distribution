package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sort extends ClientValueObject {
  def get_direction(): SortDirection
  def get_property(): String
  def set_direction(value: SortDirection): Unit
  def set_property(value: String): Unit
}

object Sort {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_direction: () => SortDirection,
    get_property: () => String,
    get_typeId: () => String,
    set_direction: SortDirection => Unit,
    set_property: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): Sort = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_direction = js.Any.fromFunction0(get_direction), get_property = js.Any.fromFunction0(get_property), get_typeId = js.Any.fromFunction0(get_typeId), set_direction = js.Any.fromFunction1(set_direction), set_property = js.Any.fromFunction1(set_property), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[Sort]
  }
}

