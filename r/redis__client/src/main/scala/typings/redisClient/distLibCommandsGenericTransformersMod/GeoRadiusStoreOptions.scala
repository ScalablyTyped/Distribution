package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRadiusStoreOptions
  extends StObject
     with GeoSearchOptions {
  
  var STOREDIST: js.UndefOr[Boolean] = js.undefined
}
object GeoRadiusStoreOptions {
  
  inline def apply(): GeoRadiusStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRadiusStoreOptions]
  }
  
  extension [Self <: GeoRadiusStoreOptions](x: Self) {
    
    inline def setSTOREDIST(value: Boolean): Self = StObject.set(x, "STOREDIST", value.asInstanceOf[js.Any])
    
    inline def setSTOREDISTUndefined: Self = StObject.set(x, "STOREDIST", js.undefined)
  }
}
