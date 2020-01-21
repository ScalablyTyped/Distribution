package typings.reactFlagIconCss.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
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
    if (customCodes != null) __obj.updateDynamic("customCodes")(customCodes.asInstanceOf[js.Any])
    if (themeStyles != null) __obj.updateDynamic("themeStyles")(themeStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssModules)) __obj.updateDynamic("useCssModules")(useCssModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagIconOptions]
  }
}

