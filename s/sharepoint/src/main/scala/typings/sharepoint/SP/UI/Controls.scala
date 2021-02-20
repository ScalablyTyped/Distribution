package typings.sharepoint.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @js.native
  trait ControlManager extends StObject
  
  @js.native
  trait INavigationOptions extends StObject {
    
    var appHelpPageOnClick: js.UndefOr[String] = js.native
    
    var appHelpPageUrl: js.UndefOr[String] = js.native
    
    var appIconUrl: js.UndefOr[String] = js.native
    
    var appStartPage: js.UndefOr[String] = js.native
    
    var appTitle: js.UndefOr[String] = js.native
    
    var appTitleIconUrl: js.UndefOr[String] = js.native
    
    var appWebUrl: js.UndefOr[String] = js.native
    
    var assetId: js.UndefOr[String] = js.native
    
    var bottomHeaderVisible: js.UndefOr[Boolean] = js.native
    
    var clientTag: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var onCssLoaded: js.UndefOr[String] = js.native
    
    var rightToLeft: js.UndefOr[Boolean] = js.native
    
    var settingsLinks: js.UndefOr[js.Array[ISettingsLink]] = js.native
    
    var siteTitle: js.UndefOr[String] = js.native
    
    var siteUrl: js.UndefOr[String] = js.native
    
    var topHeaderVisible: js.UndefOr[Boolean] = js.native
  }
  object INavigationOptions {
    
    @scala.inline
    def apply(): INavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavigationOptions]
    }
    
    @scala.inline
    implicit class INavigationOptionsMutableBuilder[Self <: INavigationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppHelpPageOnClick(value: String): Self = StObject.set(x, "appHelpPageOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppHelpPageOnClickUndefined: Self = StObject.set(x, "appHelpPageOnClick", js.undefined)
      
      @scala.inline
      def setAppHelpPageUrl(value: String): Self = StObject.set(x, "appHelpPageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppHelpPageUrlUndefined: Self = StObject.set(x, "appHelpPageUrl", js.undefined)
      
      @scala.inline
      def setAppIconUrl(value: String): Self = StObject.set(x, "appIconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIconUrlUndefined: Self = StObject.set(x, "appIconUrl", js.undefined)
      
      @scala.inline
      def setAppStartPage(value: String): Self = StObject.set(x, "appStartPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppStartPageUndefined: Self = StObject.set(x, "appStartPage", js.undefined)
      
      @scala.inline
      def setAppTitle(value: String): Self = StObject.set(x, "appTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppTitleIconUrl(value: String): Self = StObject.set(x, "appTitleIconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppTitleIconUrlUndefined: Self = StObject.set(x, "appTitleIconUrl", js.undefined)
      
      @scala.inline
      def setAppTitleUndefined: Self = StObject.set(x, "appTitle", js.undefined)
      
      @scala.inline
      def setAppWebUrl(value: String): Self = StObject.set(x, "appWebUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppWebUrlUndefined: Self = StObject.set(x, "appWebUrl", js.undefined)
      
      @scala.inline
      def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
      
      @scala.inline
      def setBottomHeaderVisible(value: Boolean): Self = StObject.set(x, "bottomHeaderVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomHeaderVisibleUndefined: Self = StObject.set(x, "bottomHeaderVisible", js.undefined)
      
      @scala.inline
      def setClientTag(value: String): Self = StObject.set(x, "clientTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTagUndefined: Self = StObject.set(x, "clientTag", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOnCssLoaded(value: String): Self = StObject.set(x, "onCssLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCssLoadedUndefined: Self = StObject.set(x, "onCssLoaded", js.undefined)
      
      @scala.inline
      def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
      
      @scala.inline
      def setSettingsLinks(value: js.Array[ISettingsLink]): Self = StObject.set(x, "settingsLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsLinksUndefined: Self = StObject.set(x, "settingsLinks", js.undefined)
      
      @scala.inline
      def setSettingsLinksVarargs(value: ISettingsLink*): Self = StObject.set(x, "settingsLinks", js.Array(value :_*))
      
      @scala.inline
      def setSiteTitle(value: String): Self = StObject.set(x, "siteTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteTitleUndefined: Self = StObject.set(x, "siteTitle", js.undefined)
      
      @scala.inline
      def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
      
      @scala.inline
      def setTopHeaderVisible(value: Boolean): Self = StObject.set(x, "topHeaderVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopHeaderVisibleUndefined: Self = StObject.set(x, "topHeaderVisible", js.undefined)
    }
  }
  
  @js.native
  trait ISettingsLink extends StObject {
    
    var displayName: String = js.native
    
    var linkUrl: String = js.native
  }
  object ISettingsLink {
    
    @scala.inline
    def apply(displayName: String, linkUrl: String): ISettingsLink = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsLink]
    }
    
    @scala.inline
    implicit class ISettingsLinkMutableBuilder[Self <: ISettingsLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Navigation extends StObject {
    
    def get_appHelpPageOnClick(): String = js.native
    
    def get_appHelpPageUrl(): String = js.native
    
    def get_appIconUrl(): String = js.native
    
    def get_appStartPage(): String = js.native
    
    def get_appTitle(): String = js.native
    
    def get_appTitleIconUrl(): String = js.native
    
    def get_assetId(): String = js.native
    
    def get_rightToLeft(): Boolean = js.native
    
    def get_settingsLinks(): js.Array[ISettingsLink] = js.native
    
    def get_siteTitle(): String = js.native
    
    def get_siteUrl(): String = js.native
    
    def remove(): Unit = js.native
    
    def setBottomHeaderVisible(value: Boolean): Unit = js.native
    
    def setTopHeaderVisible(value: Boolean): Unit = js.native
    
    def setVisible(value: Boolean): Unit = js.native
    
    def set_appHelpPageOnClick(value: String): String = js.native
    
    def set_appHelpPageUrl(value: String): String = js.native
    
    def set_appIconUrl(value: String): String = js.native
    
    def set_appStartPage(value: String): String = js.native
    
    def set_appTitle(value: String): String = js.native
    
    def set_appTitleIconUrl(value: String): String = js.native
    
    def set_rightToLeft(value: Boolean): Boolean = js.native
    
    def set_settingsLinks(value: js.Array[ISettingsLink]): js.Array[ISettingsLink] = js.native
  }
  object Navigation {
    
    @scala.inline
    def apply(
      get_appHelpPageOnClick: () => String,
      get_appHelpPageUrl: () => String,
      get_appIconUrl: () => String,
      get_appStartPage: () => String,
      get_appTitle: () => String,
      get_appTitleIconUrl: () => String,
      get_assetId: () => String,
      get_rightToLeft: () => Boolean,
      get_settingsLinks: () => js.Array[ISettingsLink],
      get_siteTitle: () => String,
      get_siteUrl: () => String,
      remove: () => Unit,
      setBottomHeaderVisible: Boolean => Unit,
      setTopHeaderVisible: Boolean => Unit,
      setVisible: Boolean => Unit,
      set_appHelpPageOnClick: String => String,
      set_appHelpPageUrl: String => String,
      set_appIconUrl: String => String,
      set_appStartPage: String => String,
      set_appTitle: String => String,
      set_appTitleIconUrl: String => String,
      set_rightToLeft: Boolean => Boolean,
      set_settingsLinks: js.Array[ISettingsLink] => js.Array[ISettingsLink]
    ): Navigation = {
      val __obj = js.Dynamic.literal(get_appHelpPageOnClick = js.Any.fromFunction0(get_appHelpPageOnClick), get_appHelpPageUrl = js.Any.fromFunction0(get_appHelpPageUrl), get_appIconUrl = js.Any.fromFunction0(get_appIconUrl), get_appStartPage = js.Any.fromFunction0(get_appStartPage), get_appTitle = js.Any.fromFunction0(get_appTitle), get_appTitleIconUrl = js.Any.fromFunction0(get_appTitleIconUrl), get_assetId = js.Any.fromFunction0(get_assetId), get_rightToLeft = js.Any.fromFunction0(get_rightToLeft), get_settingsLinks = js.Any.fromFunction0(get_settingsLinks), get_siteTitle = js.Any.fromFunction0(get_siteTitle), get_siteUrl = js.Any.fromFunction0(get_siteUrl), remove = js.Any.fromFunction0(remove), setBottomHeaderVisible = js.Any.fromFunction1(setBottomHeaderVisible), setTopHeaderVisible = js.Any.fromFunction1(setTopHeaderVisible), setVisible = js.Any.fromFunction1(setVisible), set_appHelpPageOnClick = js.Any.fromFunction1(set_appHelpPageOnClick), set_appHelpPageUrl = js.Any.fromFunction1(set_appHelpPageUrl), set_appIconUrl = js.Any.fromFunction1(set_appIconUrl), set_appStartPage = js.Any.fromFunction1(set_appStartPage), set_appTitle = js.Any.fromFunction1(set_appTitle), set_appTitleIconUrl = js.Any.fromFunction1(set_appTitleIconUrl), set_rightToLeft = js.Any.fromFunction1(set_rightToLeft), set_settingsLinks = js.Any.fromFunction1(set_settingsLinks))
      __obj.asInstanceOf[Navigation]
    }
    
    @scala.inline
    implicit class NavigationMutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_appHelpPageOnClick(value: () => String): Self = StObject.set(x, "get_appHelpPageOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_appHelpPageUrl(value: () => String): Self = StObject.set(x, "get_appHelpPageUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_appIconUrl(value: () => String): Self = StObject.set(x, "get_appIconUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_appStartPage(value: () => String): Self = StObject.set(x, "get_appStartPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_appTitle(value: () => String): Self = StObject.set(x, "get_appTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_appTitleIconUrl(value: () => String): Self = StObject.set(x, "get_appTitleIconUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_assetId(value: () => String): Self = StObject.set(x, "get_assetId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_rightToLeft(value: () => Boolean): Self = StObject.set(x, "get_rightToLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_settingsLinks(value: () => js.Array[ISettingsLink]): Self = StObject.set(x, "get_settingsLinks", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_siteTitle(value: () => String): Self = StObject.set(x, "get_siteTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_siteUrl(value: () => String): Self = StObject.set(x, "get_siteUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetBottomHeaderVisible(value: Boolean => Unit): Self = StObject.set(x, "setBottomHeaderVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTopHeaderVisible(value: Boolean => Unit): Self = StObject.set(x, "setTopHeaderVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appHelpPageOnClick(value: String => String): Self = StObject.set(x, "set_appHelpPageOnClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appHelpPageUrl(value: String => String): Self = StObject.set(x, "set_appHelpPageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appIconUrl(value: String => String): Self = StObject.set(x, "set_appIconUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appStartPage(value: String => String): Self = StObject.set(x, "set_appStartPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appTitle(value: String => String): Self = StObject.set(x, "set_appTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_appTitleIconUrl(value: String => String): Self = StObject.set(x, "set_appTitleIconUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_rightToLeft(value: Boolean => Boolean): Self = StObject.set(x, "set_rightToLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_settingsLinks(value: js.Array[ISettingsLink] => js.Array[ISettingsLink]): Self = StObject.set(x, "set_settingsLinks", js.Any.fromFunction1(value))
    }
  }
  
  type NavigationOptions = INavigationOptions
  
  @js.native
  trait SettingsLink extends ISettingsLink
  object SettingsLink {
    
    @scala.inline
    def apply(displayName: String, linkUrl: String): SettingsLink = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsLink]
    }
  }
}
