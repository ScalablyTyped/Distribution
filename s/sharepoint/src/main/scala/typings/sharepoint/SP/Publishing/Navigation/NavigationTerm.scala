package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.Publishing.CustomizableString
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.Taxonomy.TaxonomySession
import typings.sharepoint.SP.Taxonomy.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTerm extends NavigationTermSetItem {
  def deleteObject(): Unit = js.native
  def getAllParentTerms(): NavigationTermCollection = js.native
  def getAsEditable(taxonomySession: TaxonomySession): NavigationTerm = js.native
  def getResolvedAssociatedFolderUrl(): StringResult = js.native
  def getResolvedTargetUrl(browserQueryString: String, remainingUrlSegments: js.Array[String]): StringResult = js.native
  def getResolvedTargetUrlWithoutQuery(): StringResult = js.native
  def getTaxonomyTerm(): Term = js.native
  def getWebRelativeFriendlyUrl(): StringResult = js.native
  def getWithNewView(newView: NavigationTermSetView): NavigationTerm = js.native
  def get_associatedFolderUrl(): String = js.native
  def get_catalogTargetUrl(): CustomizableString = js.native
  def get_categoryImageUrl(): String = js.native
  def get_excludeFromCurrentNavigation(): Boolean = js.native
  def get_excludeFromGlobalNavigation(): Boolean = js.native
  def get_excludedProviders(): NavigationTermProviderNameCollection = js.native
  def get_friendlyUrlSegment(): CustomizableString = js.native
  def get_hoverText(): String = js.native
  def get_isDeprecated(): Boolean = js.native
  def get_isPinned(): Boolean = js.native
  def get_isPinnedRoot(): Boolean = js.native
  def get_parent(): NavigationTerm = js.native
  def get_simpleLinkUrl(): String = js.native
  def get_targetUrl(): CustomizableString = js.native
  def get_termSet(): NavigationTermSet = js.native
  def move(newParent: NavigationTermSetItem): Unit = js.native
  def set_associatedFolderUrl(value: String): String = js.native
  def set_categoryImageUrl(value: String): String = js.native
  def set_excludeFromCurrentNavigation(value: Boolean): Boolean = js.native
  def set_excludeFromGlobalNavigation(value: Boolean): Boolean = js.native
  def set_hoverText(value: String): String = js.native
  def set_simpleLinkUrl(value: String): String = js.native
}

