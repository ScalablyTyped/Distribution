package typings.sharepoint.SPNs.UINs.ControlsNs

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
    if (appHelpPageOnClick != null) __obj.updateDynamic("appHelpPageOnClick")(appHelpPageOnClick)
    if (appHelpPageUrl != null) __obj.updateDynamic("appHelpPageUrl")(appHelpPageUrl)
    if (appIconUrl != null) __obj.updateDynamic("appIconUrl")(appIconUrl)
    if (appStartPage != null) __obj.updateDynamic("appStartPage")(appStartPage)
    if (appTitle != null) __obj.updateDynamic("appTitle")(appTitle)
    if (appTitleIconUrl != null) __obj.updateDynamic("appTitleIconUrl")(appTitleIconUrl)
    if (appWebUrl != null) __obj.updateDynamic("appWebUrl")(appWebUrl)
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (!js.isUndefined(bottomHeaderVisible)) __obj.updateDynamic("bottomHeaderVisible")(bottomHeaderVisible)
    if (clientTag != null) __obj.updateDynamic("clientTag")(clientTag)
    if (language != null) __obj.updateDynamic("language")(language)
    if (onCssLoaded != null) __obj.updateDynamic("onCssLoaded")(onCssLoaded)
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft)
    if (settingsLinks != null) __obj.updateDynamic("settingsLinks")(settingsLinks)
    if (siteTitle != null) __obj.updateDynamic("siteTitle")(siteTitle)
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl)
    if (!js.isUndefined(topHeaderVisible)) __obj.updateDynamic("topHeaderVisible")(topHeaderVisible)
    __obj.asInstanceOf[INavigationOptions]
  }
}

