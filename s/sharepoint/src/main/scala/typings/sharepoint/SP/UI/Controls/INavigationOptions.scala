package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait INavigationOptions extends js.Object {
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
  @scala.inline
  def apply(
    appHelpPageOnClick: String = null,
    appHelpPageUrl: String = null,
    appIconUrl: String = null,
    appStartPage: String = null,
    appTitle: String = null,
    appTitleIconUrl: String = null,
    appWebUrl: String = null,
    assetId: String = null,
    bottomHeaderVisible: js.UndefOr[Boolean] = js.undefined,
    clientTag: String = null,
    language: String = null,
    onCssLoaded: String = null,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    settingsLinks: js.Array[ISettingsLink] = null,
    siteTitle: String = null,
    siteUrl: String = null,
    topHeaderVisible: js.UndefOr[Boolean] = js.undefined
  ): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (appHelpPageOnClick != null) __obj.updateDynamic("appHelpPageOnClick")(appHelpPageOnClick.asInstanceOf[js.Any])
    if (appHelpPageUrl != null) __obj.updateDynamic("appHelpPageUrl")(appHelpPageUrl.asInstanceOf[js.Any])
    if (appIconUrl != null) __obj.updateDynamic("appIconUrl")(appIconUrl.asInstanceOf[js.Any])
    if (appStartPage != null) __obj.updateDynamic("appStartPage")(appStartPage.asInstanceOf[js.Any])
    if (appTitle != null) __obj.updateDynamic("appTitle")(appTitle.asInstanceOf[js.Any])
    if (appTitleIconUrl != null) __obj.updateDynamic("appTitleIconUrl")(appTitleIconUrl.asInstanceOf[js.Any])
    if (appWebUrl != null) __obj.updateDynamic("appWebUrl")(appWebUrl.asInstanceOf[js.Any])
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomHeaderVisible)) __obj.updateDynamic("bottomHeaderVisible")(bottomHeaderVisible.asInstanceOf[js.Any])
    if (clientTag != null) __obj.updateDynamic("clientTag")(clientTag.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onCssLoaded != null) __obj.updateDynamic("onCssLoaded")(onCssLoaded.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.asInstanceOf[js.Any])
    if (settingsLinks != null) __obj.updateDynamic("settingsLinks")(settingsLinks.asInstanceOf[js.Any])
    if (siteTitle != null) __obj.updateDynamic("siteTitle")(siteTitle.asInstanceOf[js.Any])
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(topHeaderVisible)) __obj.updateDynamic("topHeaderVisible")(topHeaderVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavigationOptions]
  }
}

