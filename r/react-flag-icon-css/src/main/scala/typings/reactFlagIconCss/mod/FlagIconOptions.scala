package typings.reactFlagIconCss.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagIconOptions extends js.Object {
  /**
    * An object literal whose keys are your custom codes.
    */
  var customCodes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
    * using .theme-base and/or b) you are using custom flags.
    */
  var themeStyles: js.UndefOr[
    StringDictionary[
      (Properties[(String with js.Object) | `0`, String with js.Object]) with (PropertiesHyphen[(String with js.Object) | `0`, String with js.Object])
    ]
  ] = js.native
  /**
    * Use CSS modules styles (your module bundler must be correctly setup).
    */
  var useCssModules: js.UndefOr[Boolean] = js.native
}

object FlagIconOptions {
  @scala.inline
  def apply(): FlagIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagIconOptions]
  }
  @scala.inline
  implicit class FlagIconOptionsOps[Self <: FlagIconOptions] (val x: Self) extends AnyVal {
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
    def setCustomCodes(value: StringDictionary[String]): Self = this.set("customCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCodes: Self = this.set("customCodes", js.undefined)
    @scala.inline
    def setThemeStyles(
      value: StringDictionary[
          (Properties[(String with js.Object) | `0`, String with js.Object]) with (PropertiesHyphen[(String with js.Object) | `0`, String with js.Object])
        ]
    ): Self = this.set("themeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeStyles: Self = this.set("themeStyles", js.undefined)
    @scala.inline
    def setUseCssModules(value: Boolean): Self = this.set("useCssModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCssModules: Self = this.set("useCssModules", js.undefined)
  }
  
}

