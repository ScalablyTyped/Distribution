package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var BUCKETS: js.UndefOr[js.Array[String]] = js.undefined
  
  var DOCUMENTS: js.UndefOr[Boolean] = js.undefined
  
  var FACETS: js.UndefOr[js.Array[Token]] = js.undefined
  
  var PAGE: js.UndefOr[Page] = js.undefined
  
  var PIPELINE: js.UndefOr[AlterToken] = js.undefined
  
  var SCORE: js.UndefOr[Score] = js.undefined
  
  var SORT: js.UndefOr[Sort] = js.undefined
  
  var WEIGHT: js.UndefOr[js.Array[Weight]] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
    inline def setBUCKETS(value: js.Array[String]): Self = StObject.set(x, "BUCKETS", value.asInstanceOf[js.Any])
    
    inline def setBUCKETSUndefined: Self = StObject.set(x, "BUCKETS", js.undefined)
    
    inline def setBUCKETSVarargs(value: String*): Self = StObject.set(x, "BUCKETS", js.Array(value*))
    
    inline def setDOCUMENTS(value: Boolean): Self = StObject.set(x, "DOCUMENTS", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENTSUndefined: Self = StObject.set(x, "DOCUMENTS", js.undefined)
    
    inline def setFACETS(value: js.Array[Token]): Self = StObject.set(x, "FACETS", value.asInstanceOf[js.Any])
    
    inline def setFACETSUndefined: Self = StObject.set(x, "FACETS", js.undefined)
    
    inline def setFACETSVarargs(value: Token*): Self = StObject.set(x, "FACETS", js.Array(value*))
    
    inline def setPAGE(value: Page): Self = StObject.set(x, "PAGE", value.asInstanceOf[js.Any])
    
    inline def setPAGEUndefined: Self = StObject.set(x, "PAGE", js.undefined)
    
    inline def setPIPELINE(value: /* token */ Token => js.Promise[Token]): Self = StObject.set(x, "PIPELINE", js.Any.fromFunction1(value))
    
    inline def setPIPELINEUndefined: Self = StObject.set(x, "PIPELINE", js.undefined)
    
    inline def setSCORE(value: Score): Self = StObject.set(x, "SCORE", value.asInstanceOf[js.Any])
    
    inline def setSCOREUndefined: Self = StObject.set(x, "SCORE", js.undefined)
    
    inline def setSORT(value: Sort): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
    
    inline def setSORTUndefined: Self = StObject.set(x, "SORT", js.undefined)
    
    inline def setWEIGHT(value: js.Array[Weight]): Self = StObject.set(x, "WEIGHT", value.asInstanceOf[js.Any])
    
    inline def setWEIGHTUndefined: Self = StObject.set(x, "WEIGHT", js.undefined)
    
    inline def setWEIGHTVarargs(value: Weight*): Self = StObject.set(x, "WEIGHT", js.Array(value*))
  }
}
