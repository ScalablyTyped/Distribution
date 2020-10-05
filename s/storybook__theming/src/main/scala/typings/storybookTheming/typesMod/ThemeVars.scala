package typings.storybookTheming.typesMod

import typings.storybookTheming.storybookThemingStrings.dark
import typings.storybookTheming.storybookThemingStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeVars extends js.Object {
  var appBg: js.UndefOr[String] = js.native
  var appBorderColor: js.UndefOr[String] = js.native
  var appBorderRadius: js.UndefOr[Double] = js.native
  var appContentBg: js.UndefOr[String] = js.native
  var barBg: js.UndefOr[String] = js.native
  var barSelectedColor: js.UndefOr[String] = js.native
  var barTextColor: js.UndefOr[String] = js.native
  var base: light | dark = js.native
  var brandImage: js.UndefOr[String] = js.native
  var brandTitle: js.UndefOr[String] = js.native
  var brandUrl: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var fontBase: js.UndefOr[String] = js.native
  var fontCode: js.UndefOr[String] = js.native
  var gridCellSize: js.UndefOr[Double] = js.native
  var inputBg: js.UndefOr[String] = js.native
  var inputBorder: js.UndefOr[String] = js.native
  var inputBorderRadius: js.UndefOr[Double] = js.native
  var inputTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var textInverseColor: js.UndefOr[String] = js.native
}

object ThemeVars {
  @scala.inline
  def apply(base: light | dark): ThemeVars = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeVars]
  }
  @scala.inline
  implicit class ThemeVarsOps[Self <: ThemeVars] (val x: Self) extends AnyVal {
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
    def setBase(value: light | dark): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppBg(value: String): Self = this.set("appBg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBg: Self = this.set("appBg", js.undefined)
    @scala.inline
    def setAppBorderColor(value: String): Self = this.set("appBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBorderColor: Self = this.set("appBorderColor", js.undefined)
    @scala.inline
    def setAppBorderRadius(value: Double): Self = this.set("appBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBorderRadius: Self = this.set("appBorderRadius", js.undefined)
    @scala.inline
    def setAppContentBg(value: String): Self = this.set("appContentBg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppContentBg: Self = this.set("appContentBg", js.undefined)
    @scala.inline
    def setBarBg(value: String): Self = this.set("barBg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarBg: Self = this.set("barBg", js.undefined)
    @scala.inline
    def setBarSelectedColor(value: String): Self = this.set("barSelectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSelectedColor: Self = this.set("barSelectedColor", js.undefined)
    @scala.inline
    def setBarTextColor(value: String): Self = this.set("barTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarTextColor: Self = this.set("barTextColor", js.undefined)
    @scala.inline
    def setBrandImage(value: String): Self = this.set("brandImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandImage: Self = this.set("brandImage", js.undefined)
    @scala.inline
    def setBrandTitle(value: String): Self = this.set("brandTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandTitle: Self = this.set("brandTitle", js.undefined)
    @scala.inline
    def setBrandUrl(value: String): Self = this.set("brandUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandUrl: Self = this.set("brandUrl", js.undefined)
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setFontBase(value: String): Self = this.set("fontBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontBase: Self = this.set("fontBase", js.undefined)
    @scala.inline
    def setFontCode(value: String): Self = this.set("fontCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontCode: Self = this.set("fontCode", js.undefined)
    @scala.inline
    def setGridCellSize(value: Double): Self = this.set("gridCellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridCellSize: Self = this.set("gridCellSize", js.undefined)
    @scala.inline
    def setInputBg(value: String): Self = this.set("inputBg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBg: Self = this.set("inputBg", js.undefined)
    @scala.inline
    def setInputBorder(value: String): Self = this.set("inputBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBorder: Self = this.set("inputBorder", js.undefined)
    @scala.inline
    def setInputBorderRadius(value: Double): Self = this.set("inputBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBorderRadius: Self = this.set("inputBorderRadius", js.undefined)
    @scala.inline
    def setInputTextColor(value: String): Self = this.set("inputTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputTextColor: Self = this.set("inputTextColor", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextInverseColor(value: String): Self = this.set("textInverseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextInverseColor: Self = this.set("textInverseColor", js.undefined)
  }
  
}

