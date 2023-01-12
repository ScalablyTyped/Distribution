package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOptions extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var ngrams: js.UndefOr[NGram] = js.undefined
  
  var replace: js.UndefOr[Replace] = js.undefined
  
  var skipField: js.UndefOr[js.Array[String]] = js.undefined
  
  var stopwords: js.UndefOr[js.Array[String]] = js.undefined
  
  var storeRawDocs: js.UndefOr[Boolean] = js.undefined
  
  var storeVectors: js.UndefOr[Boolean] = js.undefined
  
  var tokenSplitRegex: js.UndefOr[js.RegExp] = js.undefined
  
  var tokenizer: js.UndefOr[Tokenizer] = js.undefined
}
object PutOptions {
  
  inline def apply(): PutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setNgrams(value: NGram): Self = StObject.set(x, "ngrams", value.asInstanceOf[js.Any])
    
    inline def setNgramsUndefined: Self = StObject.set(x, "ngrams", js.undefined)
    
    inline def setReplace(value: Replace): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setSkipField(value: js.Array[String]): Self = StObject.set(x, "skipField", value.asInstanceOf[js.Any])
    
    inline def setSkipFieldUndefined: Self = StObject.set(x, "skipField", js.undefined)
    
    inline def setSkipFieldVarargs(value: String*): Self = StObject.set(x, "skipField", js.Array(value*))
    
    inline def setStopwords(value: js.Array[String]): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setStoreRawDocs(value: Boolean): Self = StObject.set(x, "storeRawDocs", value.asInstanceOf[js.Any])
    
    inline def setStoreRawDocsUndefined: Self = StObject.set(x, "storeRawDocs", js.undefined)
    
    inline def setStoreVectors(value: Boolean): Self = StObject.set(x, "storeVectors", value.asInstanceOf[js.Any])
    
    inline def setStoreVectorsUndefined: Self = StObject.set(x, "storeVectors", js.undefined)
    
    inline def setTokenSplitRegex(value: js.RegExp): Self = StObject.set(x, "tokenSplitRegex", value.asInstanceOf[js.Any])
    
    inline def setTokenSplitRegexUndefined: Self = StObject.set(x, "tokenSplitRegex", js.undefined)
    
    inline def setTokenizer(value: /* args */ TokenizerArgs => js.Promise[js.Array[String]]): Self = StObject.set(x, "tokenizer", js.Any.fromFunction1(value))
    
    inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
  }
}
