package typings.redisClient.genericTransformersMod

import typings.redisClient.anon.Count
import typings.redisClient.redisClientBooleans.`true`
import typings.redisClient.redisClientStrings.ASC
import typings.redisClient.redisClientStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOptions extends StObject {
  
  var ALPHA: js.UndefOr[`true`] = js.undefined
  
  var BY: js.UndefOr[String] = js.undefined
  
  var DIRECTION: js.UndefOr[ASC | DESC] = js.undefined
  
  var GET: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var LIMIT: js.UndefOr[Count] = js.undefined
}
object SortOptions {
  
  inline def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
  
  extension [Self <: SortOptions](x: Self) {
    
    inline def setALPHA(value: `true`): Self = StObject.set(x, "ALPHA", value.asInstanceOf[js.Any])
    
    inline def setALPHAUndefined: Self = StObject.set(x, "ALPHA", js.undefined)
    
    inline def setBY(value: String): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
    
    inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
    
    inline def setDIRECTION(value: ASC | DESC): Self = StObject.set(x, "DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setDIRECTIONUndefined: Self = StObject.set(x, "DIRECTION", js.undefined)
    
    inline def setGET(value: String | js.Array[String]): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setGETUndefined: Self = StObject.set(x, "GET", js.undefined)
    
    inline def setGETVarargs(value: String*): Self = StObject.set(x, "GET", js.Array(value*))
    
    inline def setLIMIT(value: Count): Self = StObject.set(x, "LIMIT", value.asInstanceOf[js.Any])
    
    inline def setLIMITUndefined: Self = StObject.set(x, "LIMIT", js.undefined)
  }
}
