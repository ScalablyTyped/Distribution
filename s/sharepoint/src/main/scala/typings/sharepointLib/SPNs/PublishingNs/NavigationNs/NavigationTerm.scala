package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTerm")
@js.native
class NavigationTerm () extends NavigationTermSetItem {
  def deleteObject(): scala.Unit = js.native
  def getAllParentTerms(): NavigationTermCollection = js.native
  def getAsEditable(taxonomySession: sharepointLib.SPNs.TaxonomyNs.TaxonomySession): NavigationTerm = js.native
  def getResolvedAssociatedFolderUrl(): sharepointLib.SPNs.StringResult = js.native
  def getResolvedTargetUrl(browserQueryString: java.lang.String, remainingUrlSegments: js.Array[java.lang.String]): sharepointLib.SPNs.StringResult = js.native
  def getResolvedTargetUrlWithoutQuery(): sharepointLib.SPNs.StringResult = js.native
  def getTaxonomyTerm(): sharepointLib.SPNs.TaxonomyNs.Term = js.native
  def getWebRelativeFriendlyUrl(): sharepointLib.SPNs.StringResult = js.native
  def getWithNewView(newView: NavigationTermSetView): NavigationTerm = js.native
  def get_associatedFolderUrl(): java.lang.String = js.native
  def get_catalogTargetUrl(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_categoryImageUrl(): java.lang.String = js.native
  def get_excludeFromCurrentNavigation(): scala.Boolean = js.native
  def get_excludeFromGlobalNavigation(): scala.Boolean = js.native
  def get_excludedProviders(): NavigationTermProviderNameCollection = js.native
  def get_friendlyUrlSegment(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_hoverText(): java.lang.String = js.native
  def get_isDeprecated(): scala.Boolean = js.native
  def get_isPinned(): scala.Boolean = js.native
  def get_isPinnedRoot(): scala.Boolean = js.native
  def get_parent(): NavigationTerm = js.native
  def get_simpleLinkUrl(): java.lang.String = js.native
  def get_targetUrl(): sharepointLib.SPNs.PublishingNs.CustomizableString = js.native
  def get_termSet(): NavigationTermSet = js.native
  def move(newParent: NavigationTermSetItem): scala.Unit = js.native
  def set_associatedFolderUrl(value: java.lang.String): java.lang.String = js.native
  def set_categoryImageUrl(value: java.lang.String): java.lang.String = js.native
  def set_excludeFromCurrentNavigation(value: scala.Boolean): scala.Boolean = js.native
  def set_excludeFromGlobalNavigation(value: scala.Boolean): scala.Boolean = js.native
  def set_hoverText(value: java.lang.String): java.lang.String = js.native
  def set_simpleLinkUrl(value: java.lang.String): java.lang.String = js.native
}

@JSGlobal("SP.Publishing.Navigation.NavigationTerm")
@js.native
object NavigationTerm extends js.Object {
  def getAsResolvedByView(
    context: sharepointLib.SPNs.ClientContext,
    term: sharepointLib.SPNs.TaxonomyNs.Term,
    view: sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSetView
  ): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTerm = js.native
  def getAsResolvedByWeb(
    context: sharepointLib.SPNs.ClientContext,
    term: sharepointLib.SPNs.TaxonomyNs.Term,
    web: sharepointLib.SPNs.Web,
    siteMapProviderName: java.lang.String
  ): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTerm = js.native
}

