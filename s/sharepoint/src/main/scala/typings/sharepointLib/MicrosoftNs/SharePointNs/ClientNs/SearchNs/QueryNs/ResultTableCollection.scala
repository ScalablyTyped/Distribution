package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTableCollection")
@js.native
class ResultTableCollection ()
  extends sharepointLib.SPNs.ClientValueObjectCollection[ResultTable] {
  def get_elapsedTime(): scala.Double = js.native
  def get_item(index: scala.Double): ResultTable = js.native
  def get_properties(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def get_queryErrors(): ScalablyTyped.runtime.StringDictionary[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.ControlMessage
  ] = js.native
  def get_queryId(): java.lang.String = js.native
  def get_spellingSuggestion(): java.lang.String = js.native
  def get_triggeredRules(): js.Array[sharepointLib.SPNs.Guid] = js.native
  def initPropertiesFromJson(parentNode: js.Any): scala.Unit = js.native
  def set_elapsedTime(value: scala.Double): scala.Unit = js.native
}

