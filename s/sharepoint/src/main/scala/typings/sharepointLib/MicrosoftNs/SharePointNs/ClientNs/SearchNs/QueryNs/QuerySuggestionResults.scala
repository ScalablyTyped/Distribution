package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults")
@js.native
class QuerySuggestionResults ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_peopleNames(): js.Array[java.lang.String] = js.native
  def get_personalResults(): js.Array[PersonalResultSuggestion] = js.native
  def get_queries(): js.Array[QuerySuggestionQuery] = js.native
  def set_peopleNames(value: js.Array[java.lang.String]): scala.Unit = js.native
  def set_personalResults(value: js.Array[PersonalResultSuggestion]): scala.Unit = js.native
  def set_queries(value: js.Array[QuerySuggestionQuery]): scala.Unit = js.native
}

