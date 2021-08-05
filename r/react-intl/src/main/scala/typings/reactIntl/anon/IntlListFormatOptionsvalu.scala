package typings.reactIntl.anon

import typings.react.mod.ReactNode
import typings.reactIntl.reactIntlStrings.`best fit`
import typings.reactIntl.reactIntlStrings.conjunction
import typings.reactIntl.reactIntlStrings.disjunction
import typings.reactIntl.reactIntlStrings.long
import typings.reactIntl.reactIntlStrings.lookup
import typings.reactIntl.reactIntlStrings.narrow
import typings.reactIntl.reactIntlStrings.short
import typings.reactIntl.reactIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions & {  value :std.Array<react.react.ReactNode>} */
trait IntlListFormatOptionsvalu extends StObject {
  
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: js.UndefOr[long | short | narrow] = js.undefined
  
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
  
  var value: js.Array[ReactNode]
}
object IntlListFormatOptionsvalu {
  
  inline def apply(value: js.Array[ReactNode]): IntlListFormatOptionsvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlListFormatOptionsvalu]
  }
  
  extension [Self <: IntlListFormatOptionsvalu](x: Self) {
    
    inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: js.Array[ReactNode]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ReactNode*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
