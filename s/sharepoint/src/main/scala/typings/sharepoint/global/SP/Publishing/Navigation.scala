package typings.sharepoint.global.SP.Publishing

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.IntResult
import typings.sharepoint.SP.Site
import typings.sharepoint.SP.Taxonomy.Term
import typings.sharepoint.SP.Taxonomy.TermSet
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Publishing.Navigation")
@js.native
object Navigation extends js.Object {
  
  @js.native
  object NavigationLinkType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType with Double] = js.native
    
    /* 1 */ val friendlyUrl: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.friendlyUrl with Double = js.native
    
    /* 0 */ val root: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.root with Double = js.native
    
    /* 2 */ val simpleLink: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.simpleLink with Double = js.native
  }
  
  @js.native
  class NavigationTerm ()
    extends typings.sharepoint.SP.Publishing.Navigation.NavigationTerm
  /* static members */
  @js.native
  object NavigationTerm extends js.Object {
    
    def getAsResolvedByView(
      context: ClientContext,
      term: Term,
      view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
    ): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
    
    def getAsResolvedByWeb(context: ClientContext, term: Term, web: Web, siteMapProviderName: String): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
  }
  
  @js.native
  class NavigationTermSet ()
    extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet
  /* static members */
  @js.native
  object NavigationTermSet extends js.Object {
    
    def getAsResolvedByView(
      context: ClientContext,
      termSet: TermSet,
      view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
    ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
    
    def getAsResolvedByWeb(context: ClientContext, termSet: TermSet, web: Web, siteMapProviderName: String): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
  }
  
  @js.native
  class NavigationTermSetItem ()
    extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
  
  @js.native
  class NavigationTermSetView protected ()
    extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView {
    def this(context: ClientContext, web: Web, siteMapProviderName: String) = this()
  }
  /* static members */
  @js.native
  object NavigationTermSetView extends js.Object {
    
    def createEmptyInstance(context: ClientContext): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView = js.native
  }
  
  @js.native
  class StandardNavigationSettings ()
    extends typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSettings
  
  @js.native
  object StandardNavigationSource extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource with Double] = js.native
    
    /* 3 */ val inheritFromParentWeb: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.inheritFromParentWeb with Double = js.native
    
    /* 1 */ val portalProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.portalProvider with Double = js.native
    
    /* 2 */ val taxonomyProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.taxonomyProvider with Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.unknown with Double = js.native
  }
  
  @js.native
  class TaxonomyNavigation ()
    extends typings.sharepoint.SP.Publishing.Navigation.TaxonomyNavigation
  /* static members */
  @js.native
  object TaxonomyNavigation extends js.Object {
    
    def flushSiteFromCache(context: ClientContext, site: Site): Unit = js.native
    
    def flushTermSetFromCache(context: ClientContext, webForPermissions: Web, termStoreId: Guid, termSetId: Guid): Unit = js.native
    
    def flushWebFromCache(context: ClientContext, web: Web): Unit = js.native
    
    def getNavigationLcidForWeb(context: ClientContext, web: Web): IntResult = js.native
    
    def getTermSetForWeb(context: ClientContext, web: Web, siteMapProviderName: String, includeInheritedSettings: Boolean): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
    
    def getWebNavigationSettings(context: ClientContext, web: Web): typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings = js.native
    
    def setCrawlAsFriendlyUrlPage(context: ClientContext, navigationTerm: Term, crawlAsFriendlyUrlPage: Boolean): BooleanResult = js.native
  }
  
  @js.native
  class WebNavigationSettings protected ()
    extends typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings {
    def this(context: ClientContext, web: Web) = this()
  }
}
