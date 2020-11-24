package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with properties reflecting the locale
  * and formatting options computed during initialization
  * of the `Intel.RelativeTimeFormat` object
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions#Description).
  *
  * [Specification](https://tc39.es/ecma402/#table-relativetimeformat-resolvedoptions-properties)
  */
@js.native
trait ResolvedRelativeTimeFormatOptions extends js.Object {
  
  var locale: BCP47LanguageTag = js.native
  
  var numberingSystem: String = js.native
  
  var numeric: RelativeTimeFormatNumeric = js.native
  
  var style: RelativeTimeFormatStyle = js.native
}
object ResolvedRelativeTimeFormatOptions {
  
  @scala.inline
  def apply(
    locale: BCP47LanguageTag,
    numberingSystem: String,
    numeric: RelativeTimeFormatNumeric,
    style: RelativeTimeFormatStyle
  ): ResolvedRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedRelativeTimeFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedRelativeTimeFormatOptionsOps[Self <: ResolvedRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: BCP47LanguageTag): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: RelativeTimeFormatNumeric): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: RelativeTimeFormatStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
