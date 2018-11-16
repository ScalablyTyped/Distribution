package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTable")
@js.native
class ResultTable ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_groupTemplateId(): java.lang.String = js.native
  def get_itemTemplateId(): java.lang.String = js.native
  def get_properties(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def get_queryId(): java.lang.String = js.native
  def get_queryRuleId(): java.lang.String = js.native
  def get_resultRows(): js.Array[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def get_resultTitle(): java.lang.String = js.native
  def get_resultTitleUrl(): java.lang.String = js.native
  def get_rowCount(): scala.Double = js.native
  def get_tableType(): java.lang.String = js.native
  def get_totalRows(): scala.Double = js.native
  def get_totalRowsIncludingDuplicates(): scala.Double = js.native
  def initPropertiesFromJson(parentNode: js.Any): scala.Unit = js.native
}

