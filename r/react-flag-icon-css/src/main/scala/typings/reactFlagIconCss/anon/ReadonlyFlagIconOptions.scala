package typings.reactFlagIconCss.anon

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-flag-icon-css.react-flag-icon-css.FlagIconOptions> */
trait ReadonlyFlagIconOptions extends js.Object {
  val customCodes: js.UndefOr[StringDictionary[String]] = js.undefined
  val themeStyles: js.UndefOr[
    StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])]
  ] = js.undefined
  val useCssModules: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyFlagIconOptions {
  @scala.inline
  def apply(
    customCodes: StringDictionary[String] = null,
    themeStyles: StringDictionary[(Properties[String | `0`]) with (PropertiesHyphen[String | `0`])] = null,
    useCssModules: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyFlagIconOptions = {
    val __obj = js.Dynamic.literal()
    if (customCodes != null) __obj.updateDynamic("customCodes")(customCodes.asInstanceOf[js.Any])
    if (themeStyles != null) __obj.updateDynamic("themeStyles")(themeStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssModules)) __obj.updateDynamic("useCssModules")(useCssModules.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFlagIconOptions]
  }
}

