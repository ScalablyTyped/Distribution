package typings.redisClient.genericTransformersMod

import typings.redisClient.redisClientStrings.ASC
import typings.redisClient.redisClientStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSearchOptions extends StObject {
  
  var COUNT: js.UndefOr[GeoCountArgument] = js.undefined
  
  var SORT: js.UndefOr[ASC | DESC] = js.undefined
}
object GeoSearchOptions {
  
  inline def apply(): GeoSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoSearchOptions]
  }
  
  extension [Self <: GeoSearchOptions](x: Self) {
    
    inline def setCOUNT(value: GeoCountArgument): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    
    inline def setSORT(value: ASC | DESC): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
    
    inline def setSORTUndefined: Self = StObject.set(x, "SORT", js.undefined)
  }
}
