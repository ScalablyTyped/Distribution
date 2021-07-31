package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortDirection extends StObject
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SortDirection")
@js.native
object SortDirection extends StObject {
  
  @js.native
  sealed trait ascending
    extends StObject
       with SortDirection
  
  @js.native
  sealed trait descending
    extends StObject
       with SortDirection
  
  @js.native
  sealed trait fqlFormula
    extends StObject
       with SortDirection
}
