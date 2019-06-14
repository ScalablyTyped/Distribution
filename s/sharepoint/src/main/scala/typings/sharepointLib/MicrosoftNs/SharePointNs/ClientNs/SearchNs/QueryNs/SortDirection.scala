package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDirection extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SortDirection")
@js.native
object SortDirection extends js.Object {
  @js.native
  sealed trait ascending
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.SortDirection
  
  @js.native
  sealed trait descending
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.SortDirection
  
  @js.native
  sealed trait fqlFormula
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.SortDirection
  
  /* 0 */ val ascending: ascending with scala.Double = js.native
  /* 1 */ val descending: descending with scala.Double = js.native
  /* 2 */ val fqlFormula: fqlFormula with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.SortDirection with scala.Double
  ] = js.native
}

