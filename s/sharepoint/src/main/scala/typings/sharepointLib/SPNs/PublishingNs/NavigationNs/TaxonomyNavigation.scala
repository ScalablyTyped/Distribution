package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
class TaxonomyNavigation () extends js.Object

@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
object TaxonomyNavigation extends js.Object {
  def flushSiteFromCache(context: sharepointLib.SPNs.ClientContext, site: sharepointLib.SPNs.Site): scala.Unit = js.native
  def flushTermSetFromCache(
    context: sharepointLib.SPNs.ClientContext,
    webForPermissions: sharepointLib.SPNs.Web,
    termStoreId: sharepointLib.SPNs.Guid,
    termSetId: sharepointLib.SPNs.Guid
  ): scala.Unit = js.native
  def flushWebFromCache(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web): scala.Unit = js.native
  def getNavigationLcidForWeb(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.IntResult = js.native
  def getTermSetForWeb(
    context: sharepointLib.SPNs.ClientContext,
    web: sharepointLib.SPNs.Web,
    siteMapProviderName: java.lang.String,
    includeInheritedSettings: scala.Boolean
  ): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSet = js.native
  def getWebNavigationSettings(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.PublishingNs.NavigationNs.WebNavigationSettings = js.native
  def setCrawlAsFriendlyUrlPage(
    context: sharepointLib.SPNs.ClientContext,
    navigationTerm: sharepointLib.SPNs.TaxonomyNs.Term,
    crawlAsFriendlyUrlPage: scala.Boolean
  ): sharepointLib.SPNs.BooleanResult = js.native
}

