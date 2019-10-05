package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDirection extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SortDirection")
@js.native
object SortDirection extends js.Object {
  @js.native
  sealed trait ascending extends SortDirection
  
  @js.native
  sealed trait descending extends SortDirection
  
  @js.native
  sealed trait fqlFormula extends SortDirection
  
  /* 0 */ val ascending: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.ascending with Double = js.native
  /* 1 */ val descending: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.descending with Double = js.native
  /* 2 */ val fqlFormula: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.fqlFormula with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortDirection with Double] = js.native
}

