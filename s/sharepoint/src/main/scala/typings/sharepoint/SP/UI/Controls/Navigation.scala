package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation extends js.Object {
  
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
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_appHelpPageOnClick(value: () => String): Self = this.set("get_appHelpPageOnClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_appHelpPageUrl(value: () => String): Self = this.set("get_appHelpPageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_appIconUrl(value: () => String): Self = this.set("get_appIconUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_appStartPage(value: () => String): Self = this.set("get_appStartPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_appTitle(value: () => String): Self = this.set("get_appTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_appTitleIconUrl(value: () => String): Self = this.set("get_appTitleIconUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_assetId(value: () => String): Self = this.set("get_assetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_rightToLeft(value: () => Boolean): Self = this.set("get_rightToLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_settingsLinks(value: () => js.Array[ISettingsLink]): Self = this.set("get_settingsLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_siteTitle(value: () => String): Self = this.set("get_siteTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_siteUrl(value: () => String): Self = this.set("get_siteUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBottomHeaderVisible(value: Boolean => Unit): Self = this.set("setBottomHeaderVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTopHeaderVisible(value: Boolean => Unit): Self = this.set("setTopHeaderVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appHelpPageOnClick(value: String => String): Self = this.set("set_appHelpPageOnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appHelpPageUrl(value: String => String): Self = this.set("set_appHelpPageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appIconUrl(value: String => String): Self = this.set("set_appIconUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appStartPage(value: String => String): Self = this.set("set_appStartPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appTitle(value: String => String): Self = this.set("set_appTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_appTitleIconUrl(value: String => String): Self = this.set("set_appTitleIconUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_rightToLeft(value: Boolean => Boolean): Self = this.set("set_rightToLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_settingsLinks(value: js.Array[ISettingsLink] => js.Array[ISettingsLink]): Self = this.set("set_settingsLinks", js.Any.fromFunction1(value))
  }
}
