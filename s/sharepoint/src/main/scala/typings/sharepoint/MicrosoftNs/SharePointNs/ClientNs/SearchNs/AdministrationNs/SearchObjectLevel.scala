package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchObjectLevel extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel")
@js.native
object SearchObjectLevel extends js.Object {
  @js.native
  sealed trait spSite extends SearchObjectLevel
  
  @js.native
  sealed trait spSiteSubscription extends SearchObjectLevel
  
  @js.native
  sealed trait spWeb extends SearchObjectLevel
  
  @js.native
  sealed trait ssa extends SearchObjectLevel
  
  /* 1 */ val spSite: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel.spSite with Double = js.native
  /* 2 */ val spSiteSubscription: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel.spSiteSubscription with Double = js.native
  /* 0 */ val spWeb: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel.spWeb with Double = js.native
  /* 3 */ val ssa: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel.ssa with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SearchObjectLevel with Double] = js.native
}

