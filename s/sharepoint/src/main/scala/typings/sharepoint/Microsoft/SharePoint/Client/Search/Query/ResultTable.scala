package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTable")
@js.native
class ResultTable () extends ClientValueObject {
  def get_groupTemplateId(): String = js.native
  def get_itemTemplateId(): String = js.native
  def get_properties(): StringDictionary[js.Any] = js.native
  def get_queryId(): String = js.native
  def get_queryRuleId(): String = js.native
  def get_resultRows(): js.Array[StringDictionary[_]] = js.native
  def get_resultTitle(): String = js.native
  def get_resultTitleUrl(): String = js.native
  def get_rowCount(): Double = js.native
  def get_tableType(): String = js.native
  def get_totalRows(): Double = js.native
  def get_totalRowsIncludingDuplicates(): Double = js.native
  def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
}

