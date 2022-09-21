package typings.sharepoint.global.SP

import typings.sharepoint.SP.Taxonomy.Term
import typings.sharepoint.SP.Taxonomy.TermSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Publishing {
  
  @JSGlobal("SP.Publishing.AddinPlugin")
  @js.native
  open class AddinPlugin protected ()
    extends StObject
       with typings.sharepoint.SP.Publishing.AddinPlugin {
    def this(ctx: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Publishing.AddinSettings")
  @js.native
  open class AddinSettings protected ()
    extends StObject
       with typings.sharepoint.SP.Publishing.AddinSettings {
    def this(ctx: typings.sharepoint.SP.ClientContext, id: typings.sharepoint.SP.Guid) = this()
  }
  
  @JSGlobal("SP.Publishing.CustomizableString")
  @js.native
  open class CustomizableString ()
    extends StObject
       with typings.sharepoint.SP.Publishing.CustomizableString
  
  @JSGlobal("SP.Publishing.DesignPackage")
  @js.native
  open class DesignPackage ()
    extends StObject
       with typings.sharepoint.SP.Publishing.DesignPackage
  object DesignPackage {
    
    @JSGlobal("SP.Publishing.DesignPackage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def apply(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def exportEnterprise(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      includeSearchConfiguration: Boolean
    ): typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportEnterprise")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], includeSearchConfiguration.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo]]
    
    /* static member */
    inline def exportSmallBusiness(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      packageName: String,
      includeSearchConfiguration: Boolean
    ): typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSmallBusiness")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], packageName.asInstanceOf[js.Any], includeSearchConfiguration.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ClientResult[typings.sharepoint.SP.Publishing.DesignPackageInfo]]
    
    /* static member */
    inline def install(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo,
      path: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], info.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def uninstall(
      context: typings.sharepoint.SP.ClientContext,
      site: typings.sharepoint.SP.Site,
      info: typings.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Publishing.DesignPackageInfo")
  @js.native
  open class DesignPackageInfo ()
    extends StObject
       with typings.sharepoint.SP.Publishing.DesignPackageInfo {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_majorVersion(): Double = js.native
    
    /* CompleteClass */
    override def get_minorVersion(): Double = js.native
    
    /* CompleteClass */
    override def get_packageGuid(): typings.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def get_packageName(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_majorVersion(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_minorVersion(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_packageGuid(value: typings.sharepoint.SP.Guid): typings.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def set_packageName(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.ImageRendition")
  @js.native
  open class ImageRendition ()
    extends StObject
       with typings.sharepoint.SP.Publishing.ImageRendition {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_height(): Double = js.native
    
    /* CompleteClass */
    override def get_id(): Double = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_version(): Double = js.native
    
    /* CompleteClass */
    override def get_width(): Double = js.native
    
    /* CompleteClass */
    override def set_height(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_name(value: String): String = js.native
    
    /* CompleteClass */
    override def set_width(value: Double): Double = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  object Navigation {
    
    @JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
    @js.native
    object NavigationLinkType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType & Double] = js.native
      
      /* 1 */ val friendlyUrl: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.friendlyUrl & Double = js.native
      
      /* 0 */ val root: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.root & Double = js.native
      
      /* 2 */ val simpleLink: typings.sharepoint.SP.Publishing.Navigation.NavigationLinkType.simpleLink & Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTerm")
    @js.native
    open class NavigationTerm ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.NavigationTerm
    object NavigationTerm {
      
      @JSGlobal("SP.Publishing.Navigation.NavigationTerm")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getAsResolvedByView(
        context: typings.sharepoint.SP.ClientContext,
        term: Term,
        view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsResolvedByView")(context.asInstanceOf[js.Any], term.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTerm]
      
      /* static member */
      inline def getAsResolvedByWeb(
        context: typings.sharepoint.SP.ClientContext,
        term: Term,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTerm = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsResolvedByWeb")(context.asInstanceOf[js.Any], term.asInstanceOf[js.Any], web.asInstanceOf[js.Any], siteMapProviderName.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTerm]
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
    @js.native
    open class NavigationTermSet ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet
    object NavigationTermSet {
      
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getAsResolvedByView(
        context: typings.sharepoint.SP.ClientContext,
        termSet: TermSet,
        view: typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsResolvedByView")(context.asInstanceOf[js.Any], termSet.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet]
      
      /* static member */
      inline def getAsResolvedByWeb(
        context: typings.sharepoint.SP.ClientContext,
        termSet: TermSet,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsResolvedByWeb")(context.asInstanceOf[js.Any], termSet.asInstanceOf[js.Any], web.asInstanceOf[js.Any], siteMapProviderName.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet]
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetItem")
    @js.native
    open class NavigationTermSetItem ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
    @js.native
    open class NavigationTermSetView protected ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView {
      def this(
        context: typings.sharepoint.SP.ClientContext,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String
      ) = this()
    }
    object NavigationTermSetView {
      
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def createEmptyInstance(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyInstance")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetView]
    }
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSettings")
    @js.native
    open class StandardNavigationSettings ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSettings
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
    @js.native
    object StandardNavigationSource extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource & Double] = js.native
      
      /* 3 */ val inheritFromParentWeb: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.inheritFromParentWeb & Double = js.native
      
      /* 1 */ val portalProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.portalProvider & Double = js.native
      
      /* 2 */ val taxonomyProvider: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.taxonomyProvider & Double = js.native
      
      /* 0 */ val unknown: typings.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.unknown & Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
    @js.native
    open class TaxonomyNavigation ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.TaxonomyNavigation
    object TaxonomyNavigation {
      
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def flushSiteFromCache(context: typings.sharepoint.SP.ClientContext, site: typings.sharepoint.SP.Site): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushSiteFromCache")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def flushTermSetFromCache(
        context: typings.sharepoint.SP.ClientContext,
        webForPermissions: typings.sharepoint.SP.Web,
        termStoreId: typings.sharepoint.SP.Guid,
        termSetId: typings.sharepoint.SP.Guid
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushTermSetFromCache")(context.asInstanceOf[js.Any], webForPermissions.asInstanceOf[js.Any], termStoreId.asInstanceOf[js.Any], termSetId.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def flushWebFromCache(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushWebFromCache")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def getNavigationLcidForWeb(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.IntResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getNavigationLcidForWeb")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.IntResult]
      
      /* static member */
      inline def getTermSetForWeb(
        context: typings.sharepoint.SP.ClientContext,
        web: typings.sharepoint.SP.Web,
        siteMapProviderName: String,
        includeInheritedSettings: Boolean
      ): typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet = (^.asInstanceOf[js.Dynamic].applyDynamic("getTermSetForWeb")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], siteMapProviderName.asInstanceOf[js.Any], includeInheritedSettings.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.NavigationTermSet]
      
      /* static member */
      inline def getWebNavigationSettings(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebNavigationSettings")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings]
      
      /* static member */
      inline def setCrawlAsFriendlyUrlPage(
        context: typings.sharepoint.SP.ClientContext,
        navigationTerm: Term,
        crawlAsFriendlyUrlPage: Boolean
      ): typings.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("setCrawlAsFriendlyUrlPage")(context.asInstanceOf[js.Any], navigationTerm.asInstanceOf[js.Any], crawlAsFriendlyUrlPage.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.BooleanResult]
    }
    
    @JSGlobal("SP.Publishing.Navigation.WebNavigationSettings")
    @js.native
    open class WebNavigationSettings protected ()
      extends StObject
         with typings.sharepoint.SP.Publishing.Navigation.WebNavigationSettings {
      def this(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web) = this()
    }
  }
  
  @JSGlobal("SP.Publishing.PageLayoutCreationInformation")
  @js.native
  open class PageLayoutCreationInformation ()
    extends StObject
       with typings.sharepoint.SP.Publishing.PageLayoutCreationInformation {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_associatedContentTypeId(): String = js.native
    
    /* CompleteClass */
    override def get_masterPageUrl(): String = js.native
    
    /* CompleteClass */
    override def get_newPageLayoutEditablePath(): String = js.native
    
    /* CompleteClass */
    override def get_newPageLayoutNameWithoutExtension(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_web(): typings.sharepoint.SP.Web = js.native
    
    /* CompleteClass */
    override def set_associatedContentTypeId(value: String): String = js.native
    
    /* CompleteClass */
    override def set_masterPageUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_newPageLayoutEditablePath(value: String): String = js.native
    
    /* CompleteClass */
    override def set_newPageLayoutNameWithoutExtension(value: String): String = js.native
    
    /* CompleteClass */
    override def set_web(value: typings.sharepoint.SP.Web): typings.sharepoint.SP.Web = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingPage")
  @js.native
  open class PublishingPage ()
    extends StObject
       with typings.sharepoint.SP.Publishing.PublishingPage
  object PublishingPage {
    
    @JSGlobal("SP.Publishing.PublishingPage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getPublishingPage(context: typings.sharepoint.SP.ClientContext, sourceListItem: typings.sharepoint.SP.ListItem[Any]): typings.sharepoint.SP.Publishing.PublishingPage = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishingPage")(context.asInstanceOf[js.Any], sourceListItem.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.PublishingPage]
  }
  
  @JSGlobal("SP.Publishing.PublishingPageInformation")
  @js.native
  open class PublishingPageInformation ()
    extends StObject
       with typings.sharepoint.SP.Publishing.PublishingPageInformation {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_folder(): typings.sharepoint.SP.Folder = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_pageLayoutListItem(): typings.sharepoint.SP.ListItem[Any] = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_folder(value: typings.sharepoint.SP.Folder): typings.sharepoint.SP.Folder = js.native
    
    /* CompleteClass */
    override def set_name(value: String): String = js.native
    
    /* CompleteClass */
    override def set_pageLayoutListItem(value: typings.sharepoint.SP.ListItem[Any]): typings.sharepoint.SP.ListItem[Any] = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingSite")
  @js.native
  open class PublishingSite ()
    extends StObject
       with typings.sharepoint.SP.ClientObject
  object PublishingSite {
    
    @JSGlobal("SP.Publishing.PublishingSite")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPageLayout(
      context: typings.sharepoint.SP.ClientContext,
      parameters: typings.sharepoint.SP.Publishing.PageLayoutCreationInformation
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPageLayout")(context.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Publishing.PublishingWeb")
  @js.native
  open class PublishingWeb ()
    extends StObject
       with typings.sharepoint.SP.Publishing.PublishingWeb
  object PublishingWeb {
    
    @JSGlobal("SP.Publishing.PublishingWeb")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getPublishingWeb(context: typings.sharepoint.SP.ClientContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.Publishing.PublishingWeb = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishingWeb")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.PublishingWeb]
  }
  
  @JSGlobal("SP.Publishing.ScheduledItem")
  @js.native
  open class ScheduledItem ()
    extends StObject
       with typings.sharepoint.SP.Publishing.ScheduledItem
  
  @JSGlobal("SP.Publishing.SiteImageRenditions")
  @js.native
  open class SiteImageRenditions ()
    extends StObject
       with typings.sharepoint.SP.Publishing.SiteImageRenditions
  object SiteImageRenditions {
    
    @JSGlobal("SP.Publishing.SiteImageRenditions")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getRenditions(context: typings.sharepoint.SP.ClientContext): js.Array[typings.sharepoint.SP.Publishing.ImageRendition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenditions")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sharepoint.SP.Publishing.ImageRendition]]
    
    /* static member */
    inline def setRenditions(
      context: typings.sharepoint.SP.ClientContext,
      renditions: js.Array[typings.sharepoint.SP.Publishing.ImageRendition]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRenditions")(context.asInstanceOf[js.Any], renditions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Publishing.SiteServicesAddins")
  @js.native
  open class SiteServicesAddins ()
    extends StObject
       with typings.sharepoint.SP.Publishing.SiteServicesAddins
  object SiteServicesAddins {
    
    @JSGlobal("SP.Publishing.SiteServicesAddins")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def deletePlugin(context: typings.sharepoint.SP.ClientContext, pluginName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deletePlugin")(context.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def deleteSettings(context: typings.sharepoint.SP.ClientContext, addinId: typings.sharepoint.SP.Guid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSettings")(context.asInstanceOf[js.Any], addinId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def getPlugin(context: typings.sharepoint.SP.ClientContext, pluginName: String): typings.sharepoint.SP.Publishing.AddinPlugin = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(context.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.AddinPlugin]
    
    /* static member */
    inline def getSettings(context: typings.sharepoint.SP.ClientContext, addinId: typings.sharepoint.SP.Guid): typings.sharepoint.SP.Publishing.AddinSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(context.asInstanceOf[js.Any], addinId.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.Publishing.AddinSettings]
    
    /* static member */
    inline def setPlugin(context: typings.sharepoint.SP.ClientContext, addin: typings.sharepoint.SP.Publishing.AddinPlugin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPlugin")(context.asInstanceOf[js.Any], addin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def setSettings(
      context: typings.sharepoint.SP.ClientContext,
      addin: typings.sharepoint.SP.Publishing.AddinSettings
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(context.asInstanceOf[js.Any], addin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("SP.Publishing.VariationLabel")
  @js.native
  open class VariationLabel ()
    extends StObject
       with typings.sharepoint.SP.Publishing.VariationLabel
  
  @JSGlobal("SP.Publishing.Variations")
  @js.native
  open class Variations ()
    extends StObject
       with typings.sharepoint.SP.ClientObject
  object Variations {
    
    @JSGlobal("SP.Publishing.Variations")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getLabels(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.Publishing.VariationLabel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabels")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.Publishing.VariationLabel]]
    
    /* static member */
    inline def getPeerUrl(context: typings.sharepoint.SP.ClientContext, currentUrl: String, labelTitle: String): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getPeerUrl")(context.asInstanceOf[js.Any], currentUrl.asInstanceOf[js.Any], labelTitle.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
    
    /* static member */
    inline def updateListItems(
      context: typings.sharepoint.SP.ClientContext,
      listId: typings.sharepoint.SP.Guid,
      itemIds: js.Array[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListItems")(context.asInstanceOf[js.Any], listId.asInstanceOf[js.Any], itemIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
