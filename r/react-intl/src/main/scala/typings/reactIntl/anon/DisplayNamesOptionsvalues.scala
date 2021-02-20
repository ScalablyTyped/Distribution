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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions & {  value :string | number | object} */
@js.native
trait DisplayNamesOptionsvalues extends StObject {
  
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
  implicit class DisplayNamesOptionsvaluesMutableBuilder[Self <: DisplayNamesOptionsvalues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
