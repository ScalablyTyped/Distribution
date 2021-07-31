package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.Taxonomy.TaxonomySession
import typings.sharepoint.SP.Taxonomy.Term
import typings.sharepoint.SP.Taxonomy.TermSet
import typings.sharepoint.SP.Taxonomy.TermStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigation {
  
  @js.native
  sealed trait NavigationLinkType extends StObject
  @JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
  @js.native
  object NavigationLinkType extends StObject {
    
    @js.native
    sealed trait friendlyUrl
      extends StObject
         with NavigationLinkType
    
    @js.native
    sealed trait root
      extends StObject
         with NavigationLinkType
    
    @js.native
    sealed trait simpleLink
      extends StObject
         with NavigationLinkType
  }
  
  @js.native
  sealed trait StandardNavigationSource extends StObject
  @JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
  @js.native
  object StandardNavigationSource extends StObject {
    
    @js.native
    sealed trait inheritFromParentWeb
      extends StObject
         with StandardNavigationSource
    
    @js.native
    sealed trait portalProvider
      extends StObject
         with StandardNavigationSource
    
    @js.native
    sealed trait taxonomyProvider
      extends StObject
         with StandardNavigationSource
    
    @js.native
    sealed trait unknown
      extends StObject
         with StandardNavigationSource
  }
  
  @js.native
  trait NavigationTerm
    extends StObject
       with NavigationTermSetItem {
    
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
  
  type NavigationTermCollection = ClientObjectCollection[NavigationTerm]
  
  @js.native
  trait NavigationTermProviderNameCollection
    extends StObject
       with ClientObjectCollection[String] {
    
    def Add(item: String): Unit = js.native
    
    def Clear(): Unit = js.native
    
    def Remove(item: String): BooleanResult = js.native
  }
  
  @js.native
  trait NavigationTermSet
    extends StObject
       with NavigationTermSetItem {
    
    def findTermForUrl(url: String): NavigationTerm = js.native
    
    def getAllTerms(): NavigationTermCollection = js.native
    
    def getAsEditable(taxonomySession: TaxonomySession): NavigationTermSet = js.native
    
    def getTaxonomyTermSet(): TermSet = js.native
    
    def getWithNewView(newView: NavigationTermSetView): NavigationTermSet = js.native
    
    def get_isNavigationTermSet(): Boolean = js.native
    
    def get_lcid(): Double = js.native
    
    def get_loadedFromPersistedData(): Boolean = js.native
    
    def get_termGroupId(): Guid = js.native
    
    def get_termStoreId(): Guid = js.native
    
    def set_isNavigationTermSet(value: Boolean): Boolean = js.native
  }
  
  @js.native
  trait NavigationTermSetItem
    extends StObject
       with ClientObject {
    
    def createTerm(termName: String, linkType: NavigationLinkType, termId: Guid): Term = js.native
    
    def getResolvedDisplayUrl(browserQueryString: String): StringResult = js.native
    
    def getTaxonomyTermStore(): TermStore = js.native
    
    def get_catalogTargetUrlForChildTerms(): CustomizableString = js.native
    
    def get_id(): Guid = js.native
    
    def get_isReadOnly(): Boolean = js.native
    
    def get_linkType(): NavigationLinkType = js.native
    
    def get_targetUrlForChildTerms(): CustomizableString = js.native
    
    def get_taxonomyName(): String = js.native
    
    def get_terms(): NavigationTermCollection = js.native
    
    def get_title(): CustomizableString = js.native
    
    def get_view(): NavigationTermSetView = js.native
    
    def set_linkType(value: NavigationLinkType): NavigationLinkType = js.native
  }
  
  @js.native
  trait NavigationTermSetView
    extends StObject
       with ClientObject {
    
    def getCopy(): NavigationTermSetView = js.native
    
    def get_excludeDeprecatedTerms(): Boolean = js.native
    
    def get_excludeTermsByPermissions(): Boolean = js.native
    
    def get_excludeTermsByProvider(): Boolean = js.native
    
    def get_serverRelativeSiteUrl(): String = js.native
    
    def get_serverRelativeWebUrl(): String = js.native
    
    def get_siteMapProviderName(): String = js.native
    
    def get_webId(): Guid = js.native
    
    def get_webTitle(): String = js.native
    
    def set_excludeDeprecatedTerms(value: Boolean): Boolean = js.native
    
    def set_excludeTermsByPermissions(value: Boolean): Boolean = js.native
    
    def set_excludeTermsByProvider(value: Boolean): Boolean = js.native
    
    def set_siteMapProviderName(value: String): String = js.native
  }
  
  @js.native
  trait StandardNavigationSettings
    extends StObject
       with ClientObject {
    
    def get_source(): StandardNavigationSource = js.native
    
    def get_termSetId(): Guid = js.native
    
    def get_termStoreId(): Guid = js.native
    
    def set_source(value: StandardNavigationSource): StandardNavigationSource = js.native
    
    def set_termSetId(value: Guid): Guid = js.native
    
    def set_termStoreId(value: Guid): Guid = js.native
  }
  
  trait TaxonomyNavigation extends StObject
  
  @js.native
  trait WebNavigationSettings
    extends StObject
       with ClientObject {
    
    def get_addNewPagesToNavigation(): Boolean = js.native
    
    def get_createFriendlyUrlsForNewPages(): Boolean = js.native
    
    def get_currentNavigation(): StandardNavigationSettings = js.native
    
    def get_globalNavigation(): StandardNavigationSettings = js.native
    
    def resetToDefaults(): Unit = js.native
    
    def set_addNewPagesToNavigation(value: Boolean): Boolean = js.native
    
    def set_createFriendlyUrlsForNewPages(value: Boolean): Boolean = js.native
    
    def update(taxonomySession: TaxonomySession): Unit = js.native
  }
}
