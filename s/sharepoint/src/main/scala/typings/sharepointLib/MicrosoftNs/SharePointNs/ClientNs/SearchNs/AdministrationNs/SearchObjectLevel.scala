package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchObjectLevel extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel")
@js.native
object SearchObjectLevel extends js.Object {
  @js.native
  sealed trait spSite
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel
  
  @js.native
  sealed trait spSiteSubscription
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel
  
  @js.native
  sealed trait spWeb
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel
  
  @js.native
  sealed trait ssa
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel
  
  /* 1 */ val spSite: spSite with scala.Double = js.native
  /* 2 */ val spSiteSubscription: spSiteSubscription with scala.Double = js.native
  /* 0 */ val spWeb: spWeb with scala.Double = js.native
  /* 3 */ val ssa: ssa with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel with scala.Double
  ] = js.native
}

