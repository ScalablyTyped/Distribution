package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.Controls.INavigationOptions
import typings.sharepoint.SP.UI.Controls.ISettingsLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @JSGlobal("SP.UI.Controls.ControlManager")
  @js.native
  open class ControlManager ()
    extends StObject
       with typings.sharepoint.SP.UI.Controls.ControlManager
  object ControlManager {
    
    @JSGlobal("SP.UI.Controls.ControlManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getControl(placeHolderId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getControl")(placeHolderId.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSGlobal("SP.UI.Controls.Navigation")
  @js.native
  open class Navigation protected ()
    extends StObject
       with typings.sharepoint.SP.UI.Controls.Navigation {
    def this(placeholderDOMElementId: String, options: INavigationOptions) = this()
    
    /* CompleteClass */
    override def get_appHelpPageOnClick(): String = js.native
    
    /* CompleteClass */
    override def get_appHelpPageUrl(): String = js.native
    
    /* CompleteClass */
    override def get_appIconUrl(): String = js.native
    
    /* CompleteClass */
    override def get_appStartPage(): String = js.native
    
    /* CompleteClass */
    override def get_appTitle(): String = js.native
    
    /* CompleteClass */
    override def get_appTitleIconUrl(): String = js.native
    
    /* CompleteClass */
    override def get_assetId(): String = js.native
    
    /* CompleteClass */
    override def get_rightToLeft(): Boolean = js.native
    
    /* CompleteClass */
    override def get_settingsLinks(): js.Array[ISettingsLink] = js.native
    
    /* CompleteClass */
    override def get_siteTitle(): String = js.native
    
    /* CompleteClass */
    override def get_siteUrl(): String = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /* CompleteClass */
    override def setBottomHeaderVisible(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setTopHeaderVisible(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setVisible(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def set_appHelpPageOnClick(value: String): String = js.native
    
    /* CompleteClass */
    override def set_appHelpPageUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_appIconUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_appStartPage(value: String): String = js.native
    
    /* CompleteClass */
    override def set_appTitle(value: String): String = js.native
    
    /* CompleteClass */
    override def set_appTitleIconUrl(value: String): String = js.native
    
    /* CompleteClass */
    override def set_rightToLeft(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_settingsLinks(value: js.Array[ISettingsLink]): js.Array[ISettingsLink] = js.native
  }
  object Navigation {
    
    @JSGlobal("SP.UI.Controls.Navigation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getVersionedLayoutsUrl(pageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionedLayoutsUrl")(pageName.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("SP.UI.Controls.NavigationOptions")
  @js.native
  open class NavigationOptions ()
    extends StObject
       with INavigationOptions
  
  @JSGlobal("SP.UI.Controls.SettingsLink")
  @js.native
  open class SettingsLink ()
    extends StObject
       with typings.sharepoint.SP.UI.Controls.SettingsLink {
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var linkUrl: String = js.native
  }
}
