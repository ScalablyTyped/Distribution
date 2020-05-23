package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySuggestionQuery extends ClientValueObject {
  def get_isPersonal(): Boolean
  def get_query(): String
  def set_isPersonal(value: Boolean): Unit
  def set_query(value: String): Unit
}

object QuerySuggestionQuery {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_isPersonal: () => Boolean,
    get_query: () => String,
    get_typeId: () => String,
    set_isPersonal: Boolean => Unit,
    set_query: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QuerySuggestionQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_isPersonal = js.Any.fromFunction0(get_isPersonal), get_query = js.Any.fromFunction0(get_query), get_typeId = js.Any.fromFunction0(get_typeId), set_isPersonal = js.Any.fromFunction1(set_isPersonal), set_query = js.Any.fromFunction1(set_query), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QuerySuggestionQuery]
  }
}

