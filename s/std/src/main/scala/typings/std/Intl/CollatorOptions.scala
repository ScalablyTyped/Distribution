package typings.std.Intl

import typings.std.stdStrings.`best fit`
import typings.std.stdStrings.`case`
import typings.std.stdStrings.`false`
import typings.std.stdStrings.accent
import typings.std.stdStrings.base
import typings.std.stdStrings.big5han
import typings.std.stdStrings.compat
import typings.std.stdStrings.dict
import typings.std.stdStrings.direct
import typings.std.stdStrings.ducet
import typings.std.stdStrings.emoji
import typings.std.stdStrings.eor
import typings.std.stdStrings.gb2312
import typings.std.stdStrings.lookup
import typings.std.stdStrings.lower
import typings.std.stdStrings.phonebk
import typings.std.stdStrings.phonetic
import typings.std.stdStrings.pinyin
import typings.std.stdStrings.reformed
import typings.std.stdStrings.search
import typings.std.stdStrings.searchjl
import typings.std.stdStrings.sort
import typings.std.stdStrings.stroke
import typings.std.stdStrings.trad
import typings.std.stdStrings.unihan
import typings.std.stdStrings.upper
import typings.std.stdStrings.variant
import typings.std.stdStrings.zhuyin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollatorOptions extends StObject {
  
  /* standard es5 */
  var caseFirst: js.UndefOr[upper | lower | `false`] = js.undefined
  
  /* standard es5 */
  var collation: js.UndefOr[
    big5han | compat | dict | direct | ducet | emoji | eor | gb2312 | phonebk | phonetic | pinyin | reformed | searchjl | stroke | trad | unihan | zhuyin
  ] = js.undefined
  
  /* standard es5 */
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
  
  /* standard es5 */
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  /* standard es5 */
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  /* standard es5 */
  var sensitivity: js.UndefOr[base | accent | `case` | variant] = js.undefined
  
  /* standard es5 */
  var usage: js.UndefOr[sort | search] = js.undefined
}
object CollatorOptions {
  
  inline def apply(): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
    
    inline def setCaseFirst(value: upper | lower | `false`): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setCollation(
      value: big5han | compat | dict | direct | ducet | emoji | eor | gb2312 | phonebk | phonetic | pinyin | reformed | searchjl | stroke | trad | unihan | zhuyin
    ): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
    
    inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setSensitivity(value: base | accent | `case` | variant): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setUsage(value: sort | search): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
