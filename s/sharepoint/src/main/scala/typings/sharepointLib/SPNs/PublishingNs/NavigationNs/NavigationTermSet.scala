package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
@js.native
class NavigationTermSet () extends NavigationTermSetItem {
  def findTermForUrl(url: java.lang.String): NavigationTerm = js.native
  def getAllTerms(): NavigationTermCollection = js.native
  def getAsEditable(taxonomySession: sharepointLib.SPNs.TaxonomyNs.TaxonomySession): NavigationTermSet = js.native
  def getTaxonomyTermSet(): sharepointLib.SPNs.TaxonomyNs.TermSet = js.native
  def getWithNewView(newView: NavigationTermSetView): NavigationTermSet = js.native
  def get_isNavigationTermSet(): scala.Boolean = js.native
  def get_lcid(): scala.Double = js.native
  def get_loadedFromPersistedData(): scala.Boolean = js.native
  def get_termGroupId(): sharepointLib.SPNs.Guid = js.native
  def get_termStoreId(): sharepointLib.SPNs.Guid = js.native
  def set_isNavigationTermSet(value: scala.Boolean): scala.Boolean = js.native
}

@JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
@js.native
object NavigationTermSet extends js.Object {
  def getAsResolvedByView(
    context: sharepointLib.SPNs.ClientContext,
    termSet: sharepointLib.SPNs.TaxonomyNs.TermSet,
    view: sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSetView
  ): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSet = js.native
  def getAsResolvedByWeb(
    context: sharepointLib.SPNs.ClientContext,
    termSet: sharepointLib.SPNs.TaxonomyNs.TermSet,
    web: sharepointLib.SPNs.Web,
    siteMapProviderName: java.lang.String
  ): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSet = js.native
}

