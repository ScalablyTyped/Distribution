package typings.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.Properties
import typings.csstype.csstypeMod.PropertiesHyphen
import typings.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagIconOptions extends js.Object {
  /**
    * An object literal whose keys are your custom codes.
    */
  var customCodes: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
    * using .theme-base and/or b) you are using custom flags.
    */
  var themeStyles: js.UndefOr[
    StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
  ] = js.undefined
  /**
    * Use CSS modules styles (your module bundler must be correctly setup).
    */
  var useCssModules: js.UndefOr[Boolean] = js.undefined
}

object FlagIconOptions {
  @scala.inline
  def apply(
    customCodes: StringDictionary[String] = null,
    themeStyles: StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])] = null,
    useCssModules: js.UndefOr[Boolean] = js.undefined
  ): FlagIconOptions = {
    val __obj = js.Dynamic.literal()
    if (customCodes != null) __obj.updateDynamic("customCodes")(customCodes)
    if (themeStyles != null) __obj.updateDynamic("themeStyles")(themeStyles)
    if (!js.isUndefined(useCssModules)) __obj.updateDynamic("useCssModules")(useCssModules)
    __obj.asInstanceOf[FlagIconOptions]
  }
}

