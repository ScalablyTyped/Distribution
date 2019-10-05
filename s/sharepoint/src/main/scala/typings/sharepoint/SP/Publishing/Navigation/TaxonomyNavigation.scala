package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.IntResult
import typings.sharepoint.SP.Site
import typings.sharepoint.SP.Taxonomy.Term
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
class TaxonomyNavigation () extends js.Object

/* static members */
@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
object TaxonomyNavigation extends js.Object {
  def flushSiteFromCache(context: ClientContext, site: Site): Unit = js.native
  def flushTermSetFromCache(context: ClientContext, webForPermissions: Web, termStoreId: Guid, termSetId: Guid): Unit = js.native
  def flushWebFromCache(context: ClientContext, web: Web): Unit = js.native
  def getNavigationLcidForWeb(context: ClientContext, web: Web): IntResult = js.native
  def getTermSetForWeb(context: ClientContext, web: Web, siteMapProviderName: String, includeInheritedSettings: Boolean): NavigationTermSet = js.native
  def getWebNavigationSettings(context: ClientContext, web: Web): WebNavigationSettings = js.native
  def setCrawlAsFriendlyUrlPage(context: ClientContext, navigationTerm: Term, crawlAsFriendlyUrlPage: Boolean): BooleanResult = js.native
}

