package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineStorageOptions extends StObject {
  
  var cacheLimit: js.UndefOr[Double] = js.undefined
  
  var cachePath: String
}
object OfflineStorageOptions {
  
  inline def apply(cachePath: String): OfflineStorageOptions = {
    val __obj = js.Dynamic.literal(cachePath = cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineStorageOptions]
  }
  
  extension [Self <: OfflineStorageOptions](x: Self) {
    
    inline def setCacheLimit(value: Double): Self = StObject.set(x, "cacheLimit", value.asInstanceOf[js.Any])
    
    inline def setCacheLimitUndefined: Self = StObject.set(x, "cacheLimit", js.undefined)
    
    inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
  }
}
