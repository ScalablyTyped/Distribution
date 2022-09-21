package typings.searchIndex.mod

import typings.abstractLeveldown.mod.AbstractLevelDOWNConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndexOptions extends StObject {
  
  var cacheLength: js.UndefOr[Double] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var db: js.UndefOr[AbstractLevelDOWNConstructor] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stopwords: js.UndefOr[js.Array[String]] = js.undefined
  
  var tokenAppend: js.UndefOr[String] = js.undefined
}
object SearchIndexOptions {
  
  inline def apply(): SearchIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchIndexOptions]
  }
  
  extension [Self <: SearchIndexOptions](x: Self) {
    
    inline def setCacheLength(value: Double): Self = StObject.set(x, "cacheLength", value.asInstanceOf[js.Any])
    
    inline def setCacheLengthUndefined: Self = StObject.set(x, "cacheLength", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setDb(value: AbstractLevelDOWNConstructor): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStopwords(value: js.Array[String]): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setTokenAppend(value: String): Self = StObject.set(x, "tokenAppend", value.asInstanceOf[js.Any])
    
    inline def setTokenAppendUndefined: Self = StObject.set(x, "tokenAppend", js.undefined)
  }
}
