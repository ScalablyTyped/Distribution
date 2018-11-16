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
  
  val ascending: ascending with java.lang.String = js.native
  val descending: descending with java.lang.String = js.native
  val fqlFormula: fqlFormula with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.SortDirection with java.lang.String
  ] = js.native
}

