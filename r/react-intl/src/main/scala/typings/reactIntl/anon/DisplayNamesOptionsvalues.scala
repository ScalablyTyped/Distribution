package typings.reactIntl.anon

import typings.reactIntl.reactIntlStrings.`best fit`
import typings.reactIntl.reactIntlStrings.code
import typings.reactIntl.reactIntlStrings.currency
import typings.reactIntl.reactIntlStrings.language
import typings.reactIntl.reactIntlStrings.long
import typings.reactIntl.reactIntlStrings.lookup
import typings.reactIntl.reactIntlStrings.narrow
import typings.reactIntl.reactIntlStrings.none
import typings.reactIntl.reactIntlStrings.region
import typings.reactIntl.reactIntlStrings.script
import typings.reactIntl.reactIntlStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions & {  value :string | number | object} */
@js.native
trait DisplayNamesOptionsvalues extends js.Object {
  
  var fallback: js.UndefOr[code | none] = js.native
  
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
  
  var style: js.UndefOr[narrow | short | long] = js.native
  
  var `type`: language | region | script | currency = js.native
  
  var value: String | Double | js.Object = js.native
}
object DisplayNamesOptionsvalues {
  
  @scala.inline
  def apply(`type`: language | region | script | currency, value: String | Double | js.Object): DisplayNamesOptionsvalues = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptionsvalues]
  }
  
  @scala.inline
  implicit class DisplayNamesOptionsvaluesOps[Self <: DisplayNamesOptionsvalues] (val x: Self) extends AnyVal {
    
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
    def setType(value: language | region | script | currency): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | js.Object): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: code | none): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: lookup | (`best fit`)): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setStyle(value: narrow | short | long): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
