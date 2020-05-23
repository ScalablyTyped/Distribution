package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultTable extends ClientValueObject {
  def get_groupTemplateId(): String
  def get_itemTemplateId(): String
  def get_properties(): StringDictionary[js.Any]
  def get_queryId(): String
  def get_queryRuleId(): String
  def get_resultRows(): js.Array[StringDictionary[_]]
  def get_resultTitle(): String
  def get_resultTitleUrl(): String
  def get_rowCount(): Double
  def get_tableType(): String
  def get_totalRows(): Double
  def get_totalRowsIncludingDuplicates(): Double
  def initPropertiesFromJson(parentNode: js.Any): Unit
}

object ResultTable {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_groupTemplateId: () => String,
    get_itemTemplateId: () => String,
    get_properties: () => StringDictionary[js.Any],
    get_queryId: () => String,
    get_queryRuleId: () => String,
    get_resultRows: () => js.Array[StringDictionary[_]],
    get_resultTitle: () => String,
    get_resultTitleUrl: () => String,
    get_rowCount: () => Double,
    get_tableType: () => String,
    get_totalRows: () => Double,
    get_totalRowsIncludingDuplicates: () => Double,
    get_typeId: () => String,
    initPropertiesFromJson: js.Any => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ResultTable = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_groupTemplateId = js.Any.fromFunction0(get_groupTemplateId), get_itemTemplateId = js.Any.fromFunction0(get_itemTemplateId), get_properties = js.Any.fromFunction0(get_properties), get_queryId = js.Any.fromFunction0(get_queryId), get_queryRuleId = js.Any.fromFunction0(get_queryRuleId), get_resultRows = js.Any.fromFunction0(get_resultRows), get_resultTitle = js.Any.fromFunction0(get_resultTitle), get_resultTitleUrl = js.Any.fromFunction0(get_resultTitleUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_tableType = js.Any.fromFunction0(get_tableType), get_totalRows = js.Any.fromFunction0(get_totalRows), get_totalRowsIncludingDuplicates = js.Any.fromFunction0(get_totalRowsIncludingDuplicates), get_typeId = js.Any.fromFunction0(get_typeId), initPropertiesFromJson = js.Any.fromFunction1(initPropertiesFromJson), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ResultTable]
  }
}

