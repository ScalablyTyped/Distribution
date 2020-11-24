package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with some or all of properties of `options` parameter
  * of `Intl.RelativeTimeFormat` constructor.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  *
  * [Specification](https://tc39.es/ecma402/#sec-InitializeRelativeTimeFormat).
  */
@js.native
trait RelativeTimeFormatOptions extends js.Object {
  
  var localeMatcher: js.UndefOr[RelativeTimeFormatLocaleMatcher] = js.native
  
  var numeric: js.UndefOr[RelativeTimeFormatNumeric] = js.native
  
  var style: js.UndefOr[RelativeTimeFormatStyle] = js.native
}
object RelativeTimeFormatOptions {
  
  @scala.inline
  def apply(): RelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeFormatOptions]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatOptionsOps[Self <: RelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setNumeric(value: RelativeTimeFormatNumeric): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setStyle(value: RelativeTimeFormatStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
