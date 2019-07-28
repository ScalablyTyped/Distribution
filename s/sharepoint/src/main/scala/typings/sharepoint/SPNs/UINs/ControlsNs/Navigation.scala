package typings.sharepoint.SPNs.UINs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Controls.Navigation")
@js.native
class Navigation protected () extends js.Object {
  def this(placeholderDOMElementId: String, options: INavigationOptions) = this()
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

/* static members */
@JSGlobal("SP.UI.Controls.Navigation")
@js.native
object Navigation extends js.Object {
  def getVersionedLayoutsUrl(pageName: String): String = js.native
}

