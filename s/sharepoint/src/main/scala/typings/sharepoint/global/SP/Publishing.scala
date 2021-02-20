package typings.sharepoint.global.SP

import typings.sharepoint.SP.Taxonomy.Term
import typings.sharepoint.SP.Taxonomy.TermSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Publishing {
  
  @JSGlobal("SP.Publishing.AddinPlugin")
  @js.native
  class AddinPlugin protected ()
    extends typings.sharepoint.SP.Publishing.AddinPlugin {
    def this(ctx: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Publishing.AddinSettings")
  @js.native
  class AddinSettings protected ()
    extends typings.sharepoint.SP.Publishing.AddinSettings {
    def this(ctx: typings.sharepoint.SP.ClientContext, id: typings.sharepoint.SP.Guid) = this()
  }
  
  @JSGlobal("SP.Publishing.CustomizableString")
  @js.native
  class CustomizableString ()
    extends typings.sharepoint.SP.Publishing.CustomizableString
  
  @JSGlobal("SP.Publishing.DesignPackage")
  @js.native
  class DesignPackage ()
    extends typings.sharepoint.SP.Publishing.DesignPackage
  object DesignPackage {
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.apply")
    @js.native
    def apply(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.exportEnterprise")
    @js.native
    def exportEnterprise(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      includeSearchConfiguration: Boolean
    ): typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.exportSmallBusiness")
    @js.native
    def exportSmallBusiness(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      packageName: String,
      includeSearchConfiguration: Boolean
    ): typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.install")
    @js.native
    def install(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo,
      path: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.uninstall")
    @js.native
    def uninstall(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.DesignPackageInfo")
  @js.native
  class DesignPackageInfo ()
    extends typings.sharepoint.SP.Publishing.DesignPackageInfo
  
  @JSGlobal("SP.Publishing.ImageRendition")
  @js.native
  class ImageRendition ()
    extends typings.sharepoint.SP.Publishing.ImageRendition
  
  object Navigation {
    
    @JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
    @js.native
    object NavigationLinkType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType with Double] = js.native
      
      /* 1 */ val friendlyUrl: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.friendlyUrl with Double = js.native
      
      /* 0 */ val root: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.root with Double = js.native
      
      /* 2 */ val simpleLink: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.simpleLink with Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTerm")
    @js.native
    class NavigationTerm ()
      extends typings.sharepoint.SP.Publishing.Navigation.NavigationTerm
    object NavigationTerm {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTerm.getAsResolvedByView")
      @js.native
      def getAsResolvedByView(
        context: typings.sharepoint.SP.ClientContext,
        term: Term,
        view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTerm.getAsResolvedByWeb")
      @js.native
      def getAsResolvedByWeb(
        context: typings.sharepoint.SP.ClientContext,
        term: Term,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
    @js.native
    class NavigationTermSet ()
      extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet
    object NavigationTermSet {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSet.getAsResolvedByView")
      @js.native
      def getAsResolvedByView(
        context: typings.sharepoint.SP.ClientContext,
        termSet: TermSet,
        view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSet.getAsResolvedByWeb")
      @js.native
      def getAsResolvedByWeb(
        context: typings.sharepoint.SP.ClientContext,
        termSet: TermSet,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetItem")
    @js.native
    class NavigationTermSetItem ()
      extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
    @js.native
    class NavigationTermSetView protected ()
      extends typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView {
      def this(
        context: typings.sharepoint.SP.ClientContext,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ) = this()
    }
    object NavigationTermSetView {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView.createEmptyInstance")
      @js.native
      def createEmptyInstance(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSettings")
    @js.native
    class StandardNavigationSettings ()
      extends typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSettings
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
    @js.native
    object StandardNavigationSource extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource with Double] = js.native
      
      /* 3 */ val inheritFromParentWeb: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.inheritFromParentWeb with Double = js.native
      
      /* 1 */ val portalProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.portalProvider with Double = js.native
      
      /* 2 */ val taxonomyProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.taxonomyProvider with Double = js.native
      
      /* 0 */ val unknown: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.unknown with Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
    @js.native
    class TaxonomyNavigation ()
      extends typings.sharepoint.SP.Publishing.Navigation.TaxonomyNavigation
    object TaxonomyNavigation {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushSiteFromCache")
      @js.native
      def flushSiteFromCache(context: typings.sharepoint.SP.ClientContext, site: typings.sharepoint.SP.Site): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushTermSetFromCache")
      @js.native
      def flushTermSetFromCache(
        context: typings.sharepoint.SP.ClientContext,
        webForPermissions: typings.sharepoint.SP.Web,
        termStoreId: typings.sharepoint.SP.Guid,
        termSetId: typings.sharepoint.SP.Guid
      ): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushWebFromCache")
      @js.native
      def flushWebFromCache(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getNavigationLcidForWeb")
      @js.native
      def getNavigationLcidForWeb(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.IntResult = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getTermSetForWeb")
      @js.native
      def getTermSetForWeb(
        context: typings.sharepoint.SP.ClientContext,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String,
        includeInheritedSettings: Boolean
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getWebNavigationSettings")
      @js.native
      def getWebNavigationSettings(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.setCrawlAsFriendlyUrlPage")
      @js.native
      def setCrawlAsFriendlyUrlPage(
        context: typings.sharepoint.SP.ClientContext,
        navigationTerm: Term,
        crawlAsFriendlyUrlPage: Boolean
      ): typings.sharepoint.SP.BooleanResult = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.WebNavigationSettings")
    @js.native
    class WebNavigationSettings protected ()
      extends typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings {
      def this(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web) = this()
    }
  }
  
  @JSGlobal("SP.Publishing.PageLayoutCreationInformation")
  @js.native
  class PageLayoutCreationInformation ()
    extends typings.sharepoint.SP.Publishing.PageLayoutCreationInformation
  
  @JSGlobal("SP.Publishing.PublishingPage")
  @js.native
  class PublishingPage ()
    extends typings.sharepoint.SP.Publishing.PublishingPage
  object PublishingPage {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingPage.getPublishingPage")
    @js.native
    def getPublishingPage(context: typings.sharepoint.SP.ClientContext, sourceListItem: typings.sharepoint.SP.ListItem[_]): typings.sharepoint.SP.Publishing.PublishingPage = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingPageInformation")
  @js.native
  class PublishingPageInformation ()
    extends typings.sharepoint.SP.Publishing.PublishingPageInformation
  
  @JSGlobal("SP.Publishing.PublishingSite")
  @js.native
  class PublishingSite ()
    extends typings.sharepoint.SP.ClientObject
  object PublishingSite {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingSite.createPageLayout")
    @js.native
    def createPageLayout(
      context: typings.sharepoint.SP.ClientContext,
      parameters: typings.sharepoint.SP.Publishing.PageLayoutCreationInformation
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingWeb")
  @js.native
  class PublishingWeb ()
    extends typings.sharepoint.SP.Publishing.PublishingWeb
  object PublishingWeb {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingWeb.getPublishingWeb")
    @js.native
    def getPublishingWeb(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.Publishing.PublishingWeb = js.native
  }
  
  @JSGlobal("SP.Publishing.ScheduledItem")
  @js.native
  class ScheduledItem ()
    extends typings.sharepoint.SP.Publishing.ScheduledItem
  
  @JSGlobal("SP.Publishing.SiteImageRenditions")
  @js.native
  class SiteImageRenditions ()
    extends typings.sharepoint.SP.Publishing.SiteImageRenditions
  object SiteImageRenditions {
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteImageRenditions.getRenditions")
    @js.native
    def getRenditions(context: typings.sharepoint.SP.ClientContext): js.Array[typings.sharepoint.SP.Publishing.ImageRendition] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteImageRenditions.setRenditions")
    @js.native
    def setRenditions(
      context: typings.sharepoint.SP.ClientContext,
      renditions: js.Array[typings.sharepoint.SP.Publishing.ImageRendition]
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.SiteServicesAddins")
  @js.native
  class SiteServicesAddins ()
    extends typings.sharepoint.SP.Publishing.SiteServicesAddins
  object SiteServicesAddins {
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.deletePlugin")
    @js.native
    def deletePlugin(context: typings.sharepoint.SP.ClientContext, pluginName: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.deleteSettings")
    @js.native
    def deleteSettings(context: typings.sharepoint.SP.ClientContext, addinId: typings.sharepoint.SP.Guid): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.getPlugin")
    @js.native
    def getPlugin(context: typings.sharepoint.SP.ClientContext, pluginName: String): typings.sharepoint.SP.Publishing.AddinPlugin = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.getSettings")
    @js.native
    def getSettings(context: typings.sharepoint.SP.ClientContext, addinId: typings.sharepoint.SP.Guid): typings.sharepoint.SP.Publishing.AddinSettings = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.setPlugin")
    @js.native
    def setPlugin(context: typings.sharepoint.SP.ClientContext, addin: typings.sharepoint.SP.Publishing.AddinPlugin): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.setSettings")
    @js.native
    def setSettings(
      context: typings.sharepoint.SP.ClientContext,
      addin: typings.sharepoint.SP.Publishing.AddinSettings
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.VariationLabel")
  @js.native
  class VariationLabel ()
    extends typings.sharepoint.SP.Publishing.VariationLabel
  
  @JSGlobal("SP.Publishing.Variations")
  @js.native
  class Variations ()
    extends typings.sharepoint.SP.ClientObject
  object Variations {
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.getLabels")
    @js.native
    def getLabels(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.Publishing.VariationLabel] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.getPeerUrl")
    @js.native
    def getPeerUrl(context: typings.sharepoint.SP.ClientContext, currentUrl: String, labelTitle: String): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.updateListItems")
    @js.native
    def updateListItems(
      context: typings.sharepoint.SP.ClientContext,
      listId: typings.sharepoint.SP.Guid,
      itemIds: js.Array[Double]
    ): Unit = js.native
  }
}
