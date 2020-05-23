package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
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
}

