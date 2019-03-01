package typings
package sharepointLib.SPNs.UINs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait INavigationOptions extends js.Object {
  var appHelpPageOnClick: js.UndefOr[java.lang.String] = js.undefined
  var appHelpPageUrl: js.UndefOr[java.lang.String] = js.undefined
  var appIconUrl: js.UndefOr[java.lang.String] = js.undefined
  var appStartPage: js.UndefOr[java.lang.String] = js.undefined
  var appTitle: js.UndefOr[java.lang.String] = js.undefined
  var appTitleIconUrl: js.UndefOr[java.lang.String] = js.undefined
  var appWebUrl: js.UndefOr[java.lang.String] = js.undefined
  var assetId: js.UndefOr[java.lang.String] = js.undefined
  var bottomHeaderVisible: js.UndefOr[scala.Boolean] = js.undefined
  var clientTag: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var onCssLoaded: js.UndefOr[java.lang.String] = js.undefined
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  var settingsLinks: js.UndefOr[js.Array[ISettingsLink]] = js.undefined
  var siteTitle: js.UndefOr[java.lang.String] = js.undefined
  var siteUrl: js.UndefOr[java.lang.String] = js.undefined
  var topHeaderVisible: js.UndefOr[scala.Boolean] = js.undefined
}

object INavigationOptions {
  @scala.inline
  def apply(
    appHelpPageOnClick: java.lang.String = null,
    appHelpPageUrl: java.lang.String = null,
    appIconUrl: java.lang.String = null,
    appStartPage: java.lang.String = null,
    appTitle: java.lang.String = null,
    appTitleIconUrl: java.lang.String = null,
    appWebUrl: java.lang.String = null,
    assetId: java.lang.String = null,
    bottomHeaderVisible: js.UndefOr[scala.Boolean] = js.undefined,
    clientTag: java.lang.String = null,
    language: java.lang.String = null,
    onCssLoaded: java.lang.String = null,
    rightToLeft: js.UndefOr[scala.Boolean] = js.undefined,
    settingsLinks: js.Array[ISettingsLink] = null,
    siteTitle: java.lang.String = null,
    siteUrl: java.lang.String = null,
    topHeaderVisible: js.UndefOr[scala.Boolean] = js.undefined
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

