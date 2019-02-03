package typings
package sharepointLib.SPNs.UINs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Controls.Navigation")
@js.native
class Navigation protected () extends js.Object {
  def this(placeholderDOMElementId: java.lang.String, options: INavigationOptions) = this()
  def get_appHelpPageOnClick(): java.lang.String = js.native
  def get_appHelpPageUrl(): java.lang.String = js.native
  def get_appIconUrl(): java.lang.String = js.native
  def get_appStartPage(): java.lang.String = js.native
  def get_appTitle(): java.lang.String = js.native
  def get_appTitleIconUrl(): java.lang.String = js.native
  def get_assetId(): java.lang.String = js.native
  def get_rightToLeft(): scala.Boolean = js.native
  def get_settingsLinks(): js.Array[ISettingsLink] = js.native
  def get_siteTitle(): java.lang.String = js.native
  def get_siteUrl(): java.lang.String = js.native
  def remove(): scala.Unit = js.native
  def setBottomHeaderVisible(value: scala.Boolean): scala.Unit = js.native
  def setTopHeaderVisible(value: scala.Boolean): scala.Unit = js.native
  def setVisible(value: scala.Boolean): scala.Unit = js.native
  def set_appHelpPageOnClick(value: java.lang.String): java.lang.String = js.native
  def set_appHelpPageUrl(value: java.lang.String): java.lang.String = js.native
  def set_appIconUrl(value: java.lang.String): java.lang.String = js.native
  def set_appStartPage(value: java.lang.String): java.lang.String = js.native
  def set_appTitle(value: java.lang.String): java.lang.String = js.native
  def set_appTitleIconUrl(value: java.lang.String): java.lang.String = js.native
  def set_rightToLeft(value: scala.Boolean): scala.Boolean = js.native
  def set_settingsLinks(value: js.Array[ISettingsLink]): js.Array[ISettingsLink] = js.native
}

/* static members */
@JSGlobal("SP.UI.Controls.Navigation")
@js.native
object Navigation extends js.Object {
  def getVersionedLayoutsUrl(pageName: java.lang.String): java.lang.String = js.native
}

