package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults")
@js.native
class QuerySuggestionResults () extends ClientValueObject {
  def get_peopleNames(): js.Array[String] = js.native
  def get_personalResults(): js.Array[PersonalResultSuggestion] = js.native
  def get_queries(): js.Array[QuerySuggestionQuery] = js.native
  def set_peopleNames(value: js.Array[String]): Unit = js.native
  def set_personalResults(value: js.Array[PersonalResultSuggestion]): Unit = js.native
  def set_queries(value: js.Array[QuerySuggestionQuery]): Unit = js.native
}

