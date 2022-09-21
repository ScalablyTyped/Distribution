package typings.sharepoint.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  trait ControlManager extends StObject
  
  trait INavigationOptions extends StObject {
    
    var appHelpPageOnClick: js.UndefOr[String] = js.undefined
    
    var appHelpPageUrl: js.UndefOr[String] = js.undefined
    
    var appIconUrl: js.UndefOr[String] = js.undefined
    
    var appStartPage: js.UndefOr[String] = js.undefined
    
    var appTitle: js.UndefOr[String] = js.undefined
    
    var appTitleIconUrl: js.UndefOr[String] = js.undefined
    
    var appWebUrl: js.UndefOr[String] = js.undefined
    
    var assetId: js.UndefOr[String] = js.undefined
    
    var bottomHeaderVisible: js.UndefOr[Boolean] = js.undefined
    
    var clientTag: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var onCssLoaded: js.UndefOr[String] = js.undefined
    
    var rightToLeft: js.UndefOr[Boolean] = js.undefined
    
    var settingsLinks: js.UndefOr[js.Array[ISettingsLink]] = js.undefined
    
    var siteTitle: js.UndefOr[String] = js.undefined
    
    var siteUrl: js.UndefOr[String] = js.undefined
    
    var topHeaderVisible: js.UndefOr[Boolean] = js.undefined
  }
  object INavigationOptions {
    
    inline def apply(): INavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavigationOptions]
    }
    
    extension [Self <: INavigationOptions](x: Self) {
      
      inline def setAppHelpPageOnClick(value: String): Self = StObject.set(x, "appHelpPageOnClick", value.asInstanceOf[js.Any])
      
      inline def setAppHelpPageOnClickUndefined: Self = StObject.set(x, "appHelpPageOnClick", js.undefined)
      
      inline def setAppHelpPageUrl(value: String): Self = StObject.set(x, "appHelpPageUrl", value.asInstanceOf[js.Any])
      
      inline def setAppHelpPageUrlUndefined: Self = StObject.set(x, "appHelpPageUrl", js.undefined)
      
      inline def setAppIconUrl(value: String): Self = StObject.set(x, "appIconUrl", value.asInstanceOf[js.Any])
      
      inline def setAppIconUrlUndefined: Self = StObject.set(x, "appIconUrl", js.undefined)
      
      inline def setAppStartPage(value: String): Self = StObject.set(x, "appStartPage", value.asInstanceOf[js.Any])
      
      inline def setAppStartPageUndefined: Self = StObject.set(x, "appStartPage", js.undefined)
      
      inline def setAppTitle(value: String): Self = StObject.set(x, "appTitle", value.asInstanceOf[js.Any])
      
      inline def setAppTitleIconUrl(value: String): Self = StObject.set(x, "appTitleIconUrl", value.asInstanceOf[js.Any])
      
      inline def setAppTitleIconUrlUndefined: Self = StObject.set(x, "appTitleIconUrl", js.undefined)
      
      inline def setAppTitleUndefined: Self = StObject.set(x, "appTitle", js.undefined)
      
      inline def setAppWebUrl(value: String): Self = StObject.set(x, "appWebUrl", value.asInstanceOf[js.Any])
      
      inline def setAppWebUrlUndefined: Self = StObject.set(x, "appWebUrl", js.undefined)
      
      inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
      
      inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
      
      inline def setBottomHeaderVisible(value: Boolean): Self = StObject.set(x, "bottomHeaderVisible", value.asInstanceOf[js.Any])
      
      inline def setBottomHeaderVisibleUndefined: Self = StObject.set(x, "bottomHeaderVisible", js.undefined)
      
      inline def setClientTag(value: String): Self = StObject.set(x, "clientTag", value.asInstanceOf[js.Any])
      
      inline def setClientTagUndefined: Self = StObject.set(x, "clientTag", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOnCssLoaded(value: String): Self = StObject.set(x, "onCssLoaded", value.asInstanceOf[js.Any])
      
      inline def setOnCssLoadedUndefined: Self = StObject.set(x, "onCssLoaded", js.undefined)
      
      inline def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
      
      inline def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
      
      inline def setSettingsLinks(value: js.Array[ISettingsLink]): Self = StObject.set(x, "settingsLinks", value.asInstanceOf[js.Any])
      
      inline def setSettingsLinksUndefined: Self = StObject.set(x, "settingsLinks", js.undefined)
      
      inline def setSettingsLinksVarargs(value: ISettingsLink*): Self = StObject.set(x, "settingsLinks", js.Array(value*))
      
      inline def setSiteTitle(value: String): Self = StObject.set(x, "siteTitle", value.asInstanceOf[js.Any])
      
      inline def setSiteTitleUndefined: Self = StObject.set(x, "siteTitle", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
      
      inline def setTopHeaderVisible(value: Boolean): Self = StObject.set(x, "topHeaderVisible", value.asInstanceOf[js.Any])
      
      inline def setTopHeaderVisibleUndefined: Self = StObject.set(x, "topHeaderVisible", js.undefined)
    }
  }
  
  trait ISettingsLink extends StObject {
    
    var displayName: String
    
    var linkUrl: String
  }
  object ISettingsLink {
    
    inline def apply(displayName: String, linkUrl: String): ISettingsLink = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsLink]
    }
    
    extension [Self <: ISettingsLink](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Navigation extends StObject {
    
    def get_appHelpPageOnClick(): String
    
    def get_appHelpPageUrl(): String
    
    def get_appIconUrl(): String
    
    def get_appStartPage(): String
    
    def get_appTitle(): String
    
    def get_appTitleIconUrl(): String
    
    def get_assetId(): String
    
    def get_rightToLeft(): Boolean
    
    def get_settingsLinks(): js.Array[ISettingsLink]
    
    def get_siteTitle(): String
    
    def get_siteUrl(): String
    
    def remove(): Unit
    
    def setBottomHeaderVisible(value: Boolean): Unit
    
    def setTopHeaderVisible(value: Boolean): Unit
    
    def setVisible(value: Boolean): Unit
    
    def set_appHelpPageOnClick(value: String): String
    
    def set_appHelpPageUrl(value: String): String
    
    def set_appIconUrl(value: String): String
    
    def set_appStartPage(value: String): String
    
    def set_appTitle(value: String): String
    
    def set_appTitleIconUrl(value: String): String
    
    def set_rightToLeft(value: Boolean): Boolean
    
    def set_settingsLinks(value: js.Array[ISettingsLink]): js.Array[ISettingsLink]
  }
  object Navigation {
    
    inline def apply(
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
    
    extension [Self <: Navigation](x: Self) {
      
      inline def setGet_appHelpPageOnClick(value: () => String): Self = StObject.set(x, "get_appHelpPageOnClick", js.Any.fromFunction0(value))
      
      inline def setGet_appHelpPageUrl(value: () => String): Self = StObject.set(x, "get_appHelpPageUrl", js.Any.fromFunction0(value))
      
      inline def setGet_appIconUrl(value: () => String): Self = StObject.set(x, "get_appIconUrl", js.Any.fromFunction0(value))
      
      inline def setGet_appStartPage(value: () => String): Self = StObject.set(x, "get_appStartPage", js.Any.fromFunction0(value))
      
      inline def setGet_appTitle(value: () => String): Self = StObject.set(x, "get_appTitle", js.Any.fromFunction0(value))
      
      inline def setGet_appTitleIconUrl(value: () => String): Self = StObject.set(x, "get_appTitleIconUrl", js.Any.fromFunction0(value))
      
      inline def setGet_assetId(value: () => String): Self = StObject.set(x, "get_assetId", js.Any.fromFunction0(value))
      
      inline def setGet_rightToLeft(value: () => Boolean): Self = StObject.set(x, "get_rightToLeft", js.Any.fromFunction0(value))
      
      inline def setGet_settingsLinks(value: () => js.Array[ISettingsLink]): Self = StObject.set(x, "get_settingsLinks", js.Any.fromFunction0(value))
      
      inline def setGet_siteTitle(value: () => String): Self = StObject.set(x, "get_siteTitle", js.Any.fromFunction0(value))
      
      inline def setGet_siteUrl(value: () => String): Self = StObject.set(x, "get_siteUrl", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetBottomHeaderVisible(value: Boolean => Unit): Self = StObject.set(x, "setBottomHeaderVisible", js.Any.fromFunction1(value))
      
      inline def setSetTopHeaderVisible(value: Boolean => Unit): Self = StObject.set(x, "setTopHeaderVisible", js.Any.fromFunction1(value))
      
      inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      inline def setSet_appHelpPageOnClick(value: String => String): Self = StObject.set(x, "set_appHelpPageOnClick", js.Any.fromFunction1(value))
      
      inline def setSet_appHelpPageUrl(value: String => String): Self = StObject.set(x, "set_appHelpPageUrl", js.Any.fromFunction1(value))
      
      inline def setSet_appIconUrl(value: String => String): Self = StObject.set(x, "set_appIconUrl", js.Any.fromFunction1(value))
      
      inline def setSet_appStartPage(value: String => String): Self = StObject.set(x, "set_appStartPage", js.Any.fromFunction1(value))
      
      inline def setSet_appTitle(value: String => String): Self = StObject.set(x, "set_appTitle", js.Any.fromFunction1(value))
      
      inline def setSet_appTitleIconUrl(value: String => String): Self = StObject.set(x, "set_appTitleIconUrl", js.Any.fromFunction1(value))
      
      inline def setSet_rightToLeft(value: Boolean => Boolean): Self = StObject.set(x, "set_rightToLeft", js.Any.fromFunction1(value))
      
      inline def setSet_settingsLinks(value: js.Array[ISettingsLink] => js.Array[ISettingsLink]): Self = StObject.set(x, "set_settingsLinks", js.Any.fromFunction1(value))
    }
  }
  
  type NavigationOptions = INavigationOptions
  
  trait SettingsLink
    extends StObject
       with ISettingsLink
  object SettingsLink {
    
    inline def apply(displayName: String, linkUrl: String): SettingsLink = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], linkUrl = linkUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsLink]
    }
  }
}
