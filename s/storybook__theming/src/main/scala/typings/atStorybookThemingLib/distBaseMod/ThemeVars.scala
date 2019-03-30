package typings
package atStorybookThemingLib.distBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeVars extends js.Object {
  var appBg: js.UndefOr[java.lang.String] = js.undefined
  var appBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var appBorderRadius: js.UndefOr[scala.Double] = js.undefined
  var appContentBg: js.UndefOr[java.lang.String] = js.undefined
  var barBg: js.UndefOr[java.lang.String] = js.undefined
  var barSelectedColor: js.UndefOr[java.lang.String] = js.undefined
  var barTextColor: js.UndefOr[java.lang.String] = js.undefined
  var base: atStorybookThemingLib.atStorybookThemingLibStrings.light | atStorybookThemingLib.atStorybookThemingLibStrings.dark
  var brandImage: js.UndefOr[java.lang.String] = js.undefined
  var brandTitle: js.UndefOr[java.lang.String] = js.undefined
  var brandUrl: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var fontBase: js.UndefOr[java.lang.String] = js.undefined
  var fontCode: js.UndefOr[java.lang.String] = js.undefined
  var inputBg: js.UndefOr[java.lang.String] = js.undefined
  var inputBorder: js.UndefOr[java.lang.String] = js.undefined
  var inputBorderRadius: js.UndefOr[scala.Double] = js.undefined
  var inputTextColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var textInverseColor: js.UndefOr[java.lang.String] = js.undefined
}

object ThemeVars {
  @scala.inline
  def apply(
    base: atStorybookThemingLib.atStorybookThemingLibStrings.light | atStorybookThemingLib.atStorybookThemingLibStrings.dark,
    appBg: java.lang.String = null,
    appBorderColor: java.lang.String = null,
    appBorderRadius: scala.Int | scala.Double = null,
    appContentBg: java.lang.String = null,
    barBg: java.lang.String = null,
    barSelectedColor: java.lang.String = null,
    barTextColor: java.lang.String = null,
    brandImage: java.lang.String = null,
    brandTitle: java.lang.String = null,
    brandUrl: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    fontBase: java.lang.String = null,
    fontCode: java.lang.String = null,
    inputBg: java.lang.String = null,
    inputBorder: java.lang.String = null,
    inputBorderRadius: scala.Int | scala.Double = null,
    inputTextColor: java.lang.String = null,
    textColor: java.lang.String = null,
    textInverseColor: java.lang.String = null
  ): ThemeVars = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    if (appBg != null) __obj.updateDynamic("appBg")(appBg)
    if (appBorderColor != null) __obj.updateDynamic("appBorderColor")(appBorderColor)
    if (appBorderRadius != null) __obj.updateDynamic("appBorderRadius")(appBorderRadius.asInstanceOf[js.Any])
    if (appContentBg != null) __obj.updateDynamic("appContentBg")(appContentBg)
    if (barBg != null) __obj.updateDynamic("barBg")(barBg)
    if (barSelectedColor != null) __obj.updateDynamic("barSelectedColor")(barSelectedColor)
    if (barTextColor != null) __obj.updateDynamic("barTextColor")(barTextColor)
    if (brandImage != null) __obj.updateDynamic("brandImage")(brandImage)
    if (brandTitle != null) __obj.updateDynamic("brandTitle")(brandTitle)
    if (brandUrl != null) __obj.updateDynamic("brandUrl")(brandUrl)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (fontBase != null) __obj.updateDynamic("fontBase")(fontBase)
    if (fontCode != null) __obj.updateDynamic("fontCode")(fontCode)
    if (inputBg != null) __obj.updateDynamic("inputBg")(inputBg)
    if (inputBorder != null) __obj.updateDynamic("inputBorder")(inputBorder)
    if (inputBorderRadius != null) __obj.updateDynamic("inputBorderRadius")(inputBorderRadius.asInstanceOf[js.Any])
    if (inputTextColor != null) __obj.updateDynamic("inputTextColor")(inputTextColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textInverseColor != null) __obj.updateDynamic("textInverseColor")(textInverseColor)
    __obj.asInstanceOf[ThemeVars]
  }
}

