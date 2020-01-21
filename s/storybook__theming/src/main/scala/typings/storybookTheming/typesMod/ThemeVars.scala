package typings.storybookTheming.typesMod

import typings.storybookTheming.storybookThemingStrings.dark
import typings.storybookTheming.storybookThemingStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeVars extends js.Object {
  var appBg: js.UndefOr[String] = js.undefined
  var appBorderColor: js.UndefOr[String] = js.undefined
  var appBorderRadius: js.UndefOr[Double] = js.undefined
  var appContentBg: js.UndefOr[String] = js.undefined
  var barBg: js.UndefOr[String] = js.undefined
  var barSelectedColor: js.UndefOr[String] = js.undefined
  var barTextColor: js.UndefOr[String] = js.undefined
  var base: light | dark
  var brandImage: js.UndefOr[String] = js.undefined
  var brandTitle: js.UndefOr[String] = js.undefined
  var brandUrl: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var fontBase: js.UndefOr[String] = js.undefined
  var fontCode: js.UndefOr[String] = js.undefined
  var gridCellSize: js.UndefOr[Double] = js.undefined
  var inputBg: js.UndefOr[String] = js.undefined
  var inputBorder: js.UndefOr[String] = js.undefined
  var inputBorderRadius: js.UndefOr[Double] = js.undefined
  var inputTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var textInverseColor: js.UndefOr[String] = js.undefined
}

object ThemeVars {
  @scala.inline
  def apply(
    base: light | dark,
    appBg: String = null,
    appBorderColor: String = null,
    appBorderRadius: Int | Double = null,
    appContentBg: String = null,
    barBg: String = null,
    barSelectedColor: String = null,
    barTextColor: String = null,
    brandImage: String = null,
    brandTitle: String = null,
    brandUrl: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    fontBase: String = null,
    fontCode: String = null,
    gridCellSize: Int | Double = null,
    inputBg: String = null,
    inputBorder: String = null,
    inputBorderRadius: Int | Double = null,
    inputTextColor: String = null,
    textColor: String = null,
    textInverseColor: String = null
  ): ThemeVars = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    if (appBg != null) __obj.updateDynamic("appBg")(appBg.asInstanceOf[js.Any])
    if (appBorderColor != null) __obj.updateDynamic("appBorderColor")(appBorderColor.asInstanceOf[js.Any])
    if (appBorderRadius != null) __obj.updateDynamic("appBorderRadius")(appBorderRadius.asInstanceOf[js.Any])
    if (appContentBg != null) __obj.updateDynamic("appContentBg")(appContentBg.asInstanceOf[js.Any])
    if (barBg != null) __obj.updateDynamic("barBg")(barBg.asInstanceOf[js.Any])
    if (barSelectedColor != null) __obj.updateDynamic("barSelectedColor")(barSelectedColor.asInstanceOf[js.Any])
    if (barTextColor != null) __obj.updateDynamic("barTextColor")(barTextColor.asInstanceOf[js.Any])
    if (brandImage != null) __obj.updateDynamic("brandImage")(brandImage.asInstanceOf[js.Any])
    if (brandTitle != null) __obj.updateDynamic("brandTitle")(brandTitle.asInstanceOf[js.Any])
    if (brandUrl != null) __obj.updateDynamic("brandUrl")(brandUrl.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (fontBase != null) __obj.updateDynamic("fontBase")(fontBase.asInstanceOf[js.Any])
    if (fontCode != null) __obj.updateDynamic("fontCode")(fontCode.asInstanceOf[js.Any])
    if (gridCellSize != null) __obj.updateDynamic("gridCellSize")(gridCellSize.asInstanceOf[js.Any])
    if (inputBg != null) __obj.updateDynamic("inputBg")(inputBg.asInstanceOf[js.Any])
    if (inputBorder != null) __obj.updateDynamic("inputBorder")(inputBorder.asInstanceOf[js.Any])
    if (inputBorderRadius != null) __obj.updateDynamic("inputBorderRadius")(inputBorderRadius.asInstanceOf[js.Any])
    if (inputTextColor != null) __obj.updateDynamic("inputTextColor")(inputTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textInverseColor != null) __obj.updateDynamic("textInverseColor")(textInverseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeVars]
  }
}

