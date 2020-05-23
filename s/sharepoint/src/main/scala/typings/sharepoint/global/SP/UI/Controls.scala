package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.Controls.INavigationOptions
import typings.sharepoint.SP.UI.Controls.ISettingsLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Controls")
@js.native
object Controls extends js.Object {
  @js.native
  class ControlManager ()
    extends typings.sharepoint.SP.UI.Controls.ControlManager
  
  @js.native
  class Navigation protected ()
    extends typings.sharepoint.SP.UI.Controls.Navigation {
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
  
  @js.native
  class NavigationOptions () extends INavigationOptions
  
  @js.native
  class SettingsLink ()
    extends typings.sharepoint.SP.UI.Controls.SettingsLink {
    /* CompleteClass */
    override var displayName: String = js.native
    /* CompleteClass */
    override var linkUrl: String = js.native
  }
  
  /* static members */
  @js.native
  object ControlManager extends js.Object {
    def getControl(placeHolderId: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Navigation extends js.Object {
    def getVersionedLayoutsUrl(pageName: String): String = js.native
  }
  
}

