package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
