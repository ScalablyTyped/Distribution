package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait INavigationOptions extends js.Object {
  var appHelpPageOnClick: js.UndefOr[String] = js.native
  var appHelpPageUrl: js.UndefOr[String] = js.native
  var appIconUrl: js.UndefOr[String] = js.native
  var appStartPage: js.UndefOr[String] = js.native
  var appTitle: js.UndefOr[String] = js.native
  var appTitleIconUrl: js.UndefOr[String] = js.native
  var appWebUrl: js.UndefOr[String] = js.native
  var assetId: js.UndefOr[String] = js.native
  var bottomHeaderVisible: js.UndefOr[Boolean] = js.native
  var clientTag: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var onCssLoaded: js.UndefOr[String] = js.native
  var rightToLeft: js.UndefOr[Boolean] = js.native
  var settingsLinks: js.UndefOr[js.Array[ISettingsLink]] = js.native
  var siteTitle: js.UndefOr[String] = js.native
  var siteUrl: js.UndefOr[String] = js.native
  var topHeaderVisible: js.UndefOr[Boolean] = js.native
}

object INavigationOptions {
  @scala.inline
  def apply(): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationOptions]
  }
  @scala.inline
  implicit class INavigationOptionsOps[Self <: INavigationOptions] (val x: Self) extends AnyVal {
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
    def setAppHelpPageOnClick(value: String): Self = this.set("appHelpPageOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppHelpPageOnClick: Self = this.set("appHelpPageOnClick", js.undefined)
    @scala.inline
    def setAppHelpPageUrl(value: String): Self = this.set("appHelpPageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppHelpPageUrl: Self = this.set("appHelpPageUrl", js.undefined)
    @scala.inline
    def setAppIconUrl(value: String): Self = this.set("appIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIconUrl: Self = this.set("appIconUrl", js.undefined)
    @scala.inline
    def setAppStartPage(value: String): Self = this.set("appStartPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStartPage: Self = this.set("appStartPage", js.undefined)
    @scala.inline
    def setAppTitle(value: String): Self = this.set("appTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppTitle: Self = this.set("appTitle", js.undefined)
    @scala.inline
    def setAppTitleIconUrl(value: String): Self = this.set("appTitleIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppTitleIconUrl: Self = this.set("appTitleIconUrl", js.undefined)
    @scala.inline
    def setAppWebUrl(value: String): Self = this.set("appWebUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppWebUrl: Self = this.set("appWebUrl", js.undefined)
    @scala.inline
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setBottomHeaderVisible(value: Boolean): Self = this.set("bottomHeaderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomHeaderVisible: Self = this.set("bottomHeaderVisible", js.undefined)
    @scala.inline
    def setClientTag(value: String): Self = this.set("clientTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientTag: Self = this.set("clientTag", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setOnCssLoaded(value: String): Self = this.set("onCssLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCssLoaded: Self = this.set("onCssLoaded", js.undefined)
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    @scala.inline
    def setSettingsLinksVarargs(value: ISettingsLink*): Self = this.set("settingsLinks", js.Array(value :_*))
    @scala.inline
    def setSettingsLinks(value: js.Array[ISettingsLink]): Self = this.set("settingsLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsLinks: Self = this.set("settingsLinks", js.undefined)
    @scala.inline
    def setSiteTitle(value: String): Self = this.set("siteTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteTitle: Self = this.set("siteTitle", js.undefined)
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
    @scala.inline
    def setTopHeaderVisible(value: Boolean): Self = this.set("topHeaderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopHeaderVisible: Self = this.set("topHeaderVisible", js.undefined)
  }
  
}

