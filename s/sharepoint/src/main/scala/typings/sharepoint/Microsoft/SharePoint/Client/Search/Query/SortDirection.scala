package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.ascending
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.descending
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.fqlFormula
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortDirection with Double] = js.native
  /* 0 */ @js.native
  object ascending extends TopLevel[ascending with Double]
  
  /* 1 */ @js.native
  object descending extends TopLevel[descending with Double]
  
  /* 2 */ @js.native
  object fqlFormula extends TopLevel[fqlFormula with Double]
  
}

