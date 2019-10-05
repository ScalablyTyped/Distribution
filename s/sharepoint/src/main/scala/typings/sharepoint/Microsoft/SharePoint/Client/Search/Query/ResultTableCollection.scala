package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typings.sharepoint.SP.ClientValueObjectCollection
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTableCollection")
@js.native
class ResultTableCollection () extends ClientValueObjectCollection[ResultTable] {
  def get_elapsedTime(): Double = js.native
  def get_item(index: Double): ResultTable = js.native
  def get_properties(): StringDictionary[js.Any] = js.native
  def get_queryErrors(): StringDictionary[ControlMessage] = js.native
  def get_queryId(): String = js.native
  def get_spellingSuggestion(): String = js.native
  def get_triggeredRules(): js.Array[Guid] = js.native
  def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
  def set_elapsedTime(value: Double): Unit = js.native
}

