package typings.reactFlagIconCss.anon

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-flag-icon-css.react-flag-icon-css.FlagIconOptions> */
@js.native
trait ReadonlyFlagIconOptions extends js.Object {
  val customCodes: js.UndefOr[StringDictionary[String]] = js.native
  val themeStyles: js.UndefOr[
    StringDictionary[
      (Properties[(String with js.Object) | `0`, String with js.Object]) with (PropertiesHyphen[(String with js.Object) | `0`, String with js.Object])
    ]
  ] = js.native
  val useCssModules: js.UndefOr[Boolean] = js.native
}

object ReadonlyFlagIconOptions {
  @scala.inline
  def apply(): ReadonlyFlagIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyFlagIconOptions]
  }
  @scala.inline
  implicit class ReadonlyFlagIconOptionsOps[Self <: ReadonlyFlagIconOptions] (val x: Self) extends AnyVal {
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

