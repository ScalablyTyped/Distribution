package typings.std.Intl

import typings.std.stdStrings.`best fit`
import typings.std.stdStrings.grapheme
import typings.std.stdStrings.lookup
import typings.std.stdStrings.sentence
import typings.std.stdStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with some or all properties of the `Intl.Segmenter` constructor `options` parameter.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/Segmenter#parameters)
  */
trait SegmenterOptions extends StObject {
  
  /** The type of input to be split */
  /* standard es2022.intl */
  var granularity: js.UndefOr[grapheme | word | sentence] = js.undefined
  
  /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
  /* standard es2022.intl */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}
object SegmenterOptions {
  
  inline def apply(): SegmenterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmenterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmenterOptions] (val x: Self) extends AnyVal {
    
    inline def setGranularity(value: grapheme | word | sentence): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
