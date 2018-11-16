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
  
  val spSite: spSite with java.lang.String = js.native
  val spSiteSubscription: spSiteSubscription with java.lang.String = js.native
  val spWeb: spWeb with java.lang.String = js.native
  val ssa: ssa with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectLevel with java.lang.String
  ] = js.native
}

